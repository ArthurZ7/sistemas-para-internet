package tspi.pmvc.crud_recomenda_musicas.crud_musica.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import tspi.pmvc.crud_recomenda_musicas.crud_musica.domain.Usuario;
import tspi.pmvc.crud_recomenda_musicas.crud_musica.repository.UsuarioRepository;

@Controller
public class UsuarioController {

    private final UsuarioRepository usuarioRepository;
    
    public UsuarioController(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    @GetMapping("/usuarios/listar")
    public String listar(Model model) {
        List<Usuario> usuarios = usuarioRepository.listar(); 
        model.addAttribute("usuarios", usuarios);
        return "usuarios/usuarioListar";
    }

    @GetMapping("/usuarios/novo")
    public String novo(Model model) {
        model.addAttribute("usuarios",new Usuario());
        return "usuarios/usuarioForm";
    }

    @PostMapping("/usuarios/novo")
    public String salvar(@ModelAttribute Usuario usuario,Model model) {
        if (usuario.getCodigo() == null) {
            usuarioRepository.salvar(usuario);
        } else {
            usuarioRepository.atualizar(usuario);
        }
        return listar(model);
    }

    @PostMapping("/usuarios/excluir/{codigo}")
    public String excluir(@PathVariable Integer codigo,Model model) {
        usuarioRepository.excluir(codigo);
        model.addAttribute("mensagem","Excluido com sucesso");
        return listar(model);
    }
    
    @GetMapping("/usuarios/editar/{codigo}")
    public String editar(@PathVariable Integer codigo,Model model) {
        Usuario usuario = usuarioRepository.buscarPorCodigo(codigo);
        model.addAttribute("usuarios",usuario);
        return "usuarios/usuarioForm";
    }

    @GetMapping("/usuarios/buscar")
    public String buscar(@RequestParam("nome") String nome,Model model) {
        List<Usuario> usuarios = usuarioRepository.buscarPorNome(nome);
        if (usuarios.isEmpty()) {
            model.addAttribute("mensagem", 
                                  "Não tem usuario para o nome informado: "+nome);    
        }
        model.addAttribute("usuarios",usuarios);
        return "usuarios/usuarioListar";
    }

}
