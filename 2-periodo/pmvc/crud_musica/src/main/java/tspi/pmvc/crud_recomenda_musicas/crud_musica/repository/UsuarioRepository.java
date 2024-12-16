package tspi.pmvc.crud_recomenda_musicas.crud_musica.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import tspi.pmvc.crud_recomenda_musicas.crud_musica.domain.Usuario;

@Repository
public class UsuarioRepository {

    private final List<Usuario> usuarios;

    public UsuarioRepository() {
        this.usuarios = new ArrayList<>();
        this.usuarios.add(new Usuario(1, "Arthur", "2004-07-30", "Rua das couves, 140", "arthur.inocencio@estudante.iftm.edu.br", 1234));
        this.usuarios.add(new Usuario(2, "Felipe", "2004-12-29", "Rua da Jabuticaba, 210", "felipe@estudante.iftm.edu.br", 4567));
        
    }

    public List<Usuario> listar() {
        return this.usuarios;
    }


    public List<Usuario> buscaPorNome(String nome) {
        List<Usuario> usuariosBusca = new ArrayList<>();
        for (Usuario usuario : this.usuarios) {
            if (usuario.getNome().toLowerCase().contains(nome.toLowerCase())) {
                usuariosBusca.add(usuario);
            }
        }
        return usuariosBusca;
    }

    public Usuario buscaPorCodigo(int codigo) {
        Usuario usuarioBusca = new Usuario(codigo);
        int index = usuarios.indexOf(usuarioBusca);
        if (index != -1) {
            return usuarios.get(index);
        } else {
            return null;
        }
    }

    public void novo(Usuario usuario) {
        usuarios.add(usuario);
    }

    public boolean delete(int codigo) {
        Usuario usuario = new Usuario(codigo);
        return usuarios.remove(usuario);
    }

    public boolean update(Usuario usuario) {
        int index = usuarios.indexOf(usuario);
        if (index != -1) {
            usuarios.set(index, usuario);
            return true;
        }
        return false;
    }

    

}
