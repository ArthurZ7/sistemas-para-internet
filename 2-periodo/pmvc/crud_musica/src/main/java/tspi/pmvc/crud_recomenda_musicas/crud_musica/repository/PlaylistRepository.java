package tspi.pmvc.crud_recomenda_musicas.crud_musica.repository;

import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.BeanPropertyRowMapper;

import tspi.pmvc.crud_recomenda_musicas.crud_musica.domain.Musica;
import tspi.pmvc.crud_recomenda_musicas.crud_musica.domain.Playlist;
import tspi.pmvc.crud_recomenda_musicas.crud_musica.domain.Usuario;

@Repository
public class PlaylistRepository {

    private final JdbcTemplate conexao;
    
    public PlaylistRepository(JdbcTemplate conexao) {
        this.conexao = conexao;
    }

    public List<Playlist> listar() {
        String sql = """
                        select cod_playlist as codigo, nom_playlist as nome, cod_usuario
                        from tb_playlist;
                    """;
        List<Playlist> playlists = conexao.query(sql, new BeanPropertyRowMapper<>(Playlist.class));

        for (Playlist playlist : playlists) {
            carregarMusicas(playlist);
            carregarUsuario(playlist);
        }

        return playlists;
    }

    private void carregarMusicas(Playlist playlist) {
        String sql = """
                        select m.cod_musica as codigo, m.titulo_musica as titulo, m.ano_lancamento_musica as anoLancamento, m.duracao_musica as duracao
                        from tb_musica m
                        join tb_playlist_musica pm on pm.cod_musica = m.cod_musica
                        where pm.cod_playlist = ?
                    """;
        List<Musica> musicas = conexao.query(sql, new BeanPropertyRowMapper<>(Musica.class), playlist.getCodigo());
        playlist.setMusicas(musicas);
    }

    private void carregarUsuario(Playlist playlist) {
        if (playlist.getUsuario() != null) {
            String sql = """
                         SELECT cod_usuario AS codigo, 
                                nom_usuario AS nome
                         FROM tb_usuario
                         WHERE cod_usuario = ?
                         """;
            Usuario usuario = conexao.queryForObject(sql, new BeanPropertyRowMapper<>(Usuario.class), playlist.getUsuario().getCodigo());
            playlist.setUsuario(usuario);
        } else {
            // Caso não haja usuário, pode definir um comportamento, como atribuir um usuário padrão ou não fazer nada.
            playlist.setUsuario(null); 
        }
    }

    public void salvar(Playlist playlist) {
        String sql = """
                        insert into tb_playlist(nom_playlist, cod_usuario)
                        values (?, ?)
                    """;
        conexao.update(sql, playlist.getNome(), playlist.getUsuario().getCodigo());

        // Recuperar o ID da playlist salva
        Integer idPlaylist = conexao.queryForObject("select last_insert_id()", Integer.class);

        // Salvar músicas associadas
        for (Musica musica : playlist.getMusicas()) {
            salvarMusicaNaPlaylist(idPlaylist, musica.getCodigo());
        }
    }

    private void salvarMusicaNaPlaylist(Integer idPlaylist, Integer idMusica) {
        String sql = "insert into tb_playlist_musica(cod_playlist, cod_musica) values (?, ?)";
        conexao.update(sql, idPlaylist, idMusica);
    }

    public void atualizar(Playlist playlist) {
        String sql = """
                        update tb_playlist set nom_playlist = ?, cod_usuario = ?
                        where cod_playlist = ?
                     """;
        conexao.update(sql, playlist.getNome(), playlist.getUsuario().getCodigo(), playlist.getCodigo());
    
        // Atualizar músicas associadas
        removerMusicasDaPlaylist(playlist.getCodigo());
        for (Musica musica : playlist.getMusicas()) {
            salvarMusicaNaPlaylist(playlist.getCodigo(), musica.getCodigo());
        }
    }
    
    private void removerMusicasDaPlaylist(Integer idPlaylist) {
        String sql = "delete from tb_playlist_musica where cod_playlist = ?";
        conexao.update(sql, idPlaylist);
    }

    public void excluir(Integer codigo) {  
        removerMusicasDaPlaylist(codigo);
    
        String sql = "delete from tb_playlist where cod_playlist = ?";
        conexao.update(sql, codigo);
    }
    
    public Playlist buscarPorCodigo(Integer codigo) {
        String sql = """
                        select cod_playlist as codigo,
                               nom_playlist as nome,
                               cod_usuario
                        from tb_playlist
                        where cod_playlist = ?
                     """;
        Playlist playlist = conexao.queryForObject(sql, 
                               new BeanPropertyRowMapper<>(Playlist.class), 
                               codigo);
    
        // Carregar músicas associadas
        carregarMusicas(playlist);
        return playlist;
    }
    
    public List<Playlist> buscarPorNome(String nome) {
        String sql = """
                        select cod_playlist as codigo,
                               nom_playlist as nome,
                               cod_usuario
                        from tb_playlist
                        where lower(nom_playlist) like ?
                     """;
        List<Playlist> playlists = conexao.query(sql, 
                               new BeanPropertyRowMapper<>(Playlist.class), 
                               "%" + nome.toLowerCase() + "%");
    
        // Carregar músicas associadas para cada playlist
        for (Playlist playlist : playlists) {
            carregarMusicas(playlist);
        }
        return playlists;
    }
    

}