package tspi.pmvc.crud_recomenda_musicas.crud_musica.controller;

import java.util.ArrayList;
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
import tspi.pmvc.crud_recomenda_musicas.crud_musica.domain.Playlist;
import tspi.pmvc.crud_recomenda_musicas.crud_musica.domain.Usuario;
import tspi.pmvc.crud_recomenda_musicas.crud_musica.repository.PlaylistRepository;
import tspi.pmvc.crud_recomenda_musicas.crud_musica.repository.UsuarioRepository;

@Controller
public class PlaylistController {

    private final PlaylistRepository playlistRepository;
    private final MusicaRepository musicaRepository;
    private final UsuarioRepository usuarioRepository;    
    
    public PlaylistController(PlaylistRepository playlistRepository, MusicaRepository musicaRepository, UsuarioRepository usuarioRepository) {
        this.playlistRepository = playlistRepository;
        this.musicaRepository = musicaRepository;
        this.usuarioRepository = usuarioRepository;
    }

    @GetMapping("/playlists/listar")
    public String listar(Model model) {
        List<Playlist> playlists = playlistRepository.listar(); 
        model.addAttribute("playlist", playlists);
        return "playlists/playlistListar";
    }

    @GetMapping("/playlists/novo")
    public String novo(Model model) {
        Playlist playlist = new Playlist();
        playlist.setMusicas(new ArrayList<>()); // Inicializa a lista de músicas vazia
        model.addAttribute("playlist", playlist);
        
        // Obter músicas e usuários para exibir no formulário
        List<Musica> musicasDisponiveis = musicaRepository.listar();
        model.addAttribute("musicasDisponiveis", musicasDisponiveis);

        List<Usuario> usuariosDisponiveis = usuarioRepository.listar(); // Assumindo que existe um método listar
        model.addAttribute("usuarios", usuariosDisponiveis);

        return "playlists/playlistForm";
    }

    @PostMapping("/playlists/novo")
    public String salvar(@ModelAttribute Playlist playlist, 
                        @RequestParam("musicasSelecionadas") List<Integer> idsMusicas, 
                        Model model) {
        // Converter os IDs das músicas para objetos Musica
        List<Musica> musicas = musicaRepository.buscarPorIds(idsMusicas);
        playlist.setMusicas(musicas);

        // Salvar ou atualizar a playlist
        if (playlist.getCodigo() == null) {
            playlistRepository.salvar(playlist);
        } else {
            playlistRepository.atualizar(playlist);
        }

        return listar(model);
    }


    @PostMapping("/playlists/excluir/{codigo}")
    public String excluir(@PathVariable Integer codigo,Model model) {
        playlistRepository.excluir(codigo);
        model.addAttribute("mensagem","Excluido com sucesso");
        return listar(model);
    }
    
    @GetMapping("/playlists/editar/{codigo}")
    public String editar(@PathVariable Integer codigo, Model model) {
        Playlist playlist = playlistRepository.buscarPorCodigo(codigo);
        model.addAttribute("playlist", playlist);
        
        // Obter músicas e usuários disponíveis
        List<Musica> musicasDisponiveis = musicaRepository.listar();
        model.addAttribute("musicasDisponiveis", musicasDisponiveis);
    
        List<Usuario> usuariosDisponiveis = usuarioRepository.listar();
        model.addAttribute("usuariosDisponiveis", usuariosDisponiveis);
    
        return "playlists/playlistForm";
    }
    

    @GetMapping("/playlists/buscar")
    public String buscar(@RequestParam("nome") String nome,Model model) {
        List<Playlist> playlists = playlistRepository.buscarPorNome(nome);
        if (playlists.isEmpty()) {
            model.addAttribute("mensagem", 
                                  "Não tem playlist para o nome informado: "+nome);    
        }
        model.addAttribute("playlist",playlists);
        return "playlists/playlistListar";
    }

}
