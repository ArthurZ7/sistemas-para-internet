package tspi.pmvc.crud_recomenda_musicas.crud_musica.domain;

import java.util.List;

public class Playlist {
    
    private Integer codigo;
    private String nome;
    private List<Musica> musicas; // Alterado para uma lista de músicas
    private Usuario usuario;

    public Playlist() {
    }

    public Playlist(Integer codigo, String nome, List<Musica> musicas, Usuario usuario) {
        this.codigo = codigo;
        this.nome = nome;
        this.musicas = musicas;
        this.usuario = usuario;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Musica> getMusicas() {
        return musicas;
    }

    public void setMusicas(List<Musica> musicas) {
        this.musicas = musicas;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    // Método para calcular a quantidade de músicas
    public int getQuantidadeMusicas() {
        return (musicas != null) ? musicas.size() : 0;
    }
}
