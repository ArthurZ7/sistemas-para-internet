package tspi.pmvc.crud_recomenda_musicas.crud_musica.repository;

import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.BeanPropertyRowMapper;

import tspi.pmvc.crud_recomenda_musicas.crud_musica.domain.Musica;

@Repository
public class MusicaRepository {

    private final JdbcTemplate conexao;
    
    public MusicaRepository(JdbcTemplate conexao) {
        this.conexao = conexao;
    }

    public List<Musica> listar() {
        String sql = """
                        select cod_musica as codigo,
                                titulo_musica as titulo,
                                ano_lancamento_musica as ano_lancamento,
                                duracao_musica as duracao
                        from tb_musica;
                        """;
        return conexao.query(sql,
                                new BeanPropertyRowMapper<>(Musica.class)
                            );
    }

    public List<Musica> buscarPorTitulo(String titulo) {
        String sql = """
                        select cod_musica as codigo,
                                titulo_musica as titulo,
                                ano_lancamento_musica as ano_lancamento,
                                duracao_musica as duracao
                        from tb_musica
                        where lower(titulo_musica) like ?
                        """;
        return conexao.query(sql,
                            new BeanPropertyRowMapper<>(Musica.class),
                            "%"+titulo.toLowerCase()+"%");
    }

    public void salvar(Musica musica) {
        String sql = """
                        insert into tb_musica(
                            titulo_musica, 
                            ano_lancamento_musica, 
                            duracao_musica
                        ) values (?, ?, ?)
                     """;
        conexao.update(sql,
                        musica.getTitulo(),
                        musica.getAno_lancamento(),
                        musica.getDuracao());
    }

    public void atualizar(Musica musica) {
        String sql = """
                        update tb_musica set 
                            titulo_musica = ?, 
                            ano_lancamento_musica = ?, 
                            duracao_musica = ? 
                        where cod_musica = ?
                     """;
        conexao.update(sql,
                        musica.getTitulo(),
                        musica.getAno_lancamento(),
                        musica.getDuracao(),
                        musica.getCodigo());
    }

    public void excluir(Integer codigo) {  
        String sql = "delete from tb_musica where cod_musica = ?";
        conexao.update(sql, codigo);
    }

    public Musica buscarPorCodigo(Integer codigo) {
        String sql = """
                        select cod_musica as codigo,
                                titulo_musica as titulo,
                                ano_lancamento_musica as ano_lancamento,
                                duracao_musica as duracao
                        from tb_musica
                        where cod_musica = ?
                        """;    
        return conexao.queryForObject(sql, 
                    new BeanPropertyRowMapper<>(Musica.class),
                    codigo);
    }

    public List<Musica> buscarPorIds(List<Integer> idsMusicas) {
        String sql = """
                     select cod_musica as codigo, 
                            titulo_musica as titulo,
                            ano_lancamento_musica as anoLancamento,
                            duracao_musica as duracao
                     from tb_musica
                     where cod_musica in (:ids)
                     """;
        MapSqlParameterSource parameters = new MapSqlParameterSource();
        parameters.addValue("ids", idsMusicas);
    
        NamedParameterJdbcTemplate namedTemplate = new NamedParameterJdbcTemplate(conexao.getDataSource());
        return namedTemplate.query(sql, parameters, new BeanPropertyRowMapper<>(Musica.class));
    }

}