package tspi.pmvc.crud_recomenda_musicas.crud_musica.repository;

import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.BeanPropertyRowMapper;

import tspi.pmvc.crud_recomenda_musicas.crud_musica.domain.Usuario;

@Repository
public class UsuarioRepository {

    private final JdbcTemplate conexao;
    
    public UsuarioRepository(JdbcTemplate conexao) {
        this.conexao = conexao;
    }

    public List<Usuario> listar() {
        String sql = """
                        select cod_usuario as codigo,
                                nom_usuario as nome,
                                dt_nasc_usuario as data_nasc,
                                end_usuario as endereco,
                                email_usuario as email,
                                senha_usuario as senha
                        from tb_usuario;
                        """;
        return conexao.query(sql,
                                new BeanPropertyRowMapper<>(Usuario.class)
                            );
    }

    public List<Usuario> buscarPorNome(String nome) {
        String sql = """
                        select cod_usuario as codigo,
                                nom_usuario as nome,
                                dt_nasc_usuario as data_nasc,
                                end_usuario as endereco,
                                email_usuario as email,
                                senha_usuario as senha
                        from tb_usuario
                        where lower(nom_usuario) like ?
                        """;
        return conexao.query(sql,
                            new BeanPropertyRowMapper<>(Usuario.class),
                            "%"+nome.toLowerCase()+"%");
    }

    public void salvar(Usuario usuario) {
        String sql = """
                        insert into tb_usuario(
                            nom_usuario, 
                            dt_nasc_usuario, 
                            end_usuario, 
                            email_usuario,
                            senha_usuario
                        ) values (?, ?, ?, ?, ?)
                     """;
        conexao.update(sql,
                        usuario.getNome(),
                        usuario.getData_nasc(),
                        usuario.getEndereco(),
                        usuario.getEmail(),
                        usuario.getSenha());
    }

    public void atualizar(Usuario usuario) {
        String sql = """
                        update tb_usuario set 
                            nom_usuario = ?, 
                            dt_nasc_usuario = ?, 
                            end_usuario = ?, 
                            email_usuario = ?,
                            senha_usuario = ? 
                        where cod_usuario = ?
                     """;
        conexao.update(sql,
                        usuario.getNome(),
                        usuario.getData_nasc(),
                        usuario.getEndereco(),
                        usuario.getEmail(),
                        usuario.getSenha(),  
                        usuario.getCodigo());
    }

    public void excluir(Integer codigo) {  
        String sql = "delete from tb_usuario where cod_usuario = ?";
        conexao.update(sql,codigo);
    }

    public Usuario buscarPorCodigo(Integer codigo) {
        String sql = """
                        select cod_usuario as codigo,
                                nom_usuario as nome,
                                dt_nasc_usuario as data_nasc,
                                end_usuario as endereco,
                                email_usuario as email,
                                senha_usuario as senha
                        from tb_usuario
                        where cod_usuario = ?
                        """;    
        return conexao.queryForObject(sql, 
                    new BeanPropertyRowMapper<>(Usuario.class),
                    codigo);
    }
}
