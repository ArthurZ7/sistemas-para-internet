package aplicação;

public class Aluno {

    private String codigo;
    private String nome;
    private String telefone;
    private int acessos;
    int categoria;

    public Aluno() {
    }

    public Aluno(String codigo, String nome, String telefone, int categoria) {
        this.codigo = codigo;
        this.nome = nome;
        this.telefone = telefone;
        this.acessos = 0;
        this.categoria = categoria;
    }

    public Aluno(String codigo, String nome, String telefone, int acessos, int categoria) {
        this.codigo = codigo;
        this.nome = nome;
        this.telefone = telefone;
        this.acessos = acessos;
        this.categoria = categoria;
    }


    public void exibe() { 
        System.out.println("Código: " + codigo); 
        System.out.println("Nome: " + nome); 
        System.out.println("Telefone: " + telefone); 
        System.out.println("Categoria: " + categoria); 
        if (categoria != 1) { 
            System.out.println("Acessos: " + acessos); 
        } 
        System.out.println(); }

    // public String exibe (int categoria) {
    //     if (categoria == 1) {
    //         return exibe();
    //     } else if (categoria == 2) {
    //         return "Código: " + codigo + "\nNome: " + nome + "\nTelefone: " + telefone + "\nCategoria: " + categoria + "Acessos: 1";
    //     } else if (categoria == 3) {
    //         return "Código: " + codigo + "\nNome: " + nome + "\nTelefone: " + telefone + "\nCategoria: " + categoria + "Acessos: 2";
    //     } else {
    //         return "Essa categoria não existe!";
    //     }
    // }
    
}
