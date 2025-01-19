package tspi.pmvc.crud_recomenda_musicas.crud_musica.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import tspi.pmvc.crud_recomenda_musicas.crud_musica.domain.Musica;
import tspi.pmvc.crud_recomenda_musicas.crud_musica.repository.MusicaRepository;

@Controller
public class MusicaController {

    private final MusicaRepository musicaRepository;
    
    public MusicaController(MusicaRepository musicaRepository) {
        this.musicaRepository = musicaRepository;
    }

    @GetMapping("/musicas/listar")
    public String listar(Model model) {
        List<Musica> musicas = musicaRepository.listar(); 
        model.addAttribute("musicas", musicas);
        return "musicas/musicaListar";
    }

    @GetMapping("/musicas/novo")
    public String novo(Model model) {
        model.addAttribute("musicas", new Musica());
        return "musicas/musicaForm";
    }

    @PostMapping("/musicas/novo")
    public String salvar(@ModelAttribute Musica musica, Model model) {
        if (musica.getCodigo() == 0) {
            musicaRepository.salvar(musica);
        } else {
            musicaRepository.atualizar(musica);
        }
        return listar(model);
    }

    @PostMapping("/musicas/excluir/{codigo}")
    public String excluir(@PathVariable Integer codigo,Model model) {
        musicaRepository.excluir(codigo);
        model.addAttribute("mensagem","Excluido com sucesso");
        return listar(model);
    }
    
    @GetMapping("/musicas/editar/{codigo}")
    public String editar(@PathVariable Integer codigo, Model model) {
        Musica musica = musicaRepository.buscarPorCodigo(codigo);
        model.addAttribute("musicas", musica);
        return "musicas/musicaForm";
    }

    @GetMapping("/musicas/buscar")
    public String buscar(@RequestParam("titulo") String titulo, Model model) {
        List<Musica> musicas = musicaRepository.buscarPorTitulo(titulo);
        if (musicas.isEmpty()) {
            model.addAttribute("mensagem", "Não há músicas para o título informado: " + titulo);    
        }
        model.addAttribute("musicas", musicas);
        return "musicas/musicaListar";
    }

}

