package tspi.pmvc.crud_recomenda_musicas.crud_musica.domain;

public class Playlist {
    
    private int codigo;

    private String nome;
    
    private int qnt_musica;

    public Playlist(){
        
    }

    public Playlist(int codigo, String nome, int qnt_musica) {
        this.codigo = codigo;
        this.nome = nome;
        this.qnt_musica = qnt_musica;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQnt_musica() {
        return qnt_musica;
    }

    public void setQnt_musica(int qnt_musica) {
        this.qnt_musica = qnt_musica;
    }

    
}
