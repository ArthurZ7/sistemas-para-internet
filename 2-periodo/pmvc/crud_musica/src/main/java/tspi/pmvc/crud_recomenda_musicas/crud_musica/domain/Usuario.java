package tspi.pmvc.crud_recomenda_musicas.crud_musica.domain;

public class Usuario {

    private int codigo;

    private String nome;

    private String data_nasc;

    private String endereco;

    private String email;

    private int senha;

    public Usuario() {

    }

    public Usuario(int codigo, String nome, String data_nasc, String endereco, String email, int senha) {
        this.codigo = codigo;
        this.nome = nome;
        this.data_nasc = data_nasc;
        this.endereco = endereco;
        this.email = email;
        this.senha = senha;
    }

    public Usuario(int codigo) {
        this.codigo = codigo;
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

    public String getData_nasc() {
        return data_nasc;
    }

    public void setData_nasc(String data_nasc) {
        this.data_nasc = data_nasc;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getSenha() {
        return senha;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }

    
    
    
}
