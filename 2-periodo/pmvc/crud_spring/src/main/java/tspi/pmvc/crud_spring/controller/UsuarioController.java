package tspi.pmvc.crud_spring.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import tspi.pmvc.crud_spring.domain.Usuario;




@Controller
public class UsuarioController {

    @GetMapping("/")
    public String init(Model model) {
        String nomeUsuario = "Arthur Borges";
        Usuario usuario = new Usuario();
        usuario.setNome(nomeUsuario);
        usuario.setAdministrador(false);
        model.addAttribute("nomeUsuario", nomeUsuario);
        model.addAttribute("usuario", usuario);

        List<Usuario> usuarios = Arrays.asList(
            new Usuario("Arthur", "arthurib", "senha123", true),
            new Usuario("Xande", "xandao", "senha456", false),
            new Usuario("Pedro", "pedrin", "senha789", true)
        );
        model.addAttribute("usuarios", usuarios);
        return "usuarioView";
    }

    @GetMapping("/editar/{login}")
    public String mostrarFormularioEdicao(@PathVariable String login, Model model) {
        model.addAttribute("nomeUsuario", login);
        model.addAttribute("nomes", new ArrayList<>());
        model.addAttribute("usuarios", new ArrayList<>());
        model.addAttribute("usuario", new Usuario());
        return "usuarioView";
    }

    @GetMapping("/novo")
    public String novoUsuario(Model model) {
        Usuario usuario = new Usuario();
        usuario.setLogin("amigao");
        usuario.setSenha("teste");
        usuario.setNome("Arthur");
        usuario.setAdministrador(true);
        model.addAttribute("usuario", usuario);
        return "formUsuario";
    }
    

    @GetMapping("/vazio")
    public String usuarioVazio(Model model) {
        Usuario usuario = new Usuario();
        model.addAttribute("usuario", usuario);
        return "formUsuario";
    }
    
}
