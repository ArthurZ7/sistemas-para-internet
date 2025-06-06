package tspi.pmvc.crud_spring.repository;

import java.util.ArrayList;
import java.util.List;

import tspi.pmvc.crud_spring.domain.Usuario;

public class UsuarioRepository {

    private final List<Usuario> usuarios;

    public UsuarioRepository() {
        this.usuarios = new ArrayList<Usuario>();
        this.usuarios.add(new Usuario("Arthur", "arthurz", "art123", true));
        this.usuarios.add(new Usuario("Amigão", "amigao", "teste", false));
        
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

    public Usuario buscaPorLogin(String login) {
        Usuario usuarioBusca = new Usuario(login);
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

    public boolean delete(String login) {
        Usuario usuario = new Usuario(login);
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
