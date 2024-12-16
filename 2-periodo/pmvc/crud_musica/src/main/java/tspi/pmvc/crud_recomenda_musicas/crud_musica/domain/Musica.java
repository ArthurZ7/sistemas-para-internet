package tspi.pmvc.crud_recomenda_musicas.crud_musica.domain;

public class Musica {
    
    private int codigo;

    private String titulo;

    private String ano_lancamento;

    private int duracao;

    public Musica(){
        
    }

    public Musica(int codigo, String titulo, String ano_lancamento, int duracao) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.ano_lancamento = ano_lancamento;
        this.duracao = duracao;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAno_lancamento() {
        return ano_lancamento;
    }

    public void setAno_lancamento(String ano_lancamento) {
        this.ano_lancamento = ano_lancamento;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    

}
