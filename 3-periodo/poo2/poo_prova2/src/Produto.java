public abstract class Produto implements Imprimivel{
    protected String nome;
    protected double preco;
    protected int quantidade;

    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public void atualizarEstoque(int quantidade) {
        this.quantidade += quantidade;
    }

    public String imprimirDetalhes() {
        return "Nome: " + nome + "\nPreço: " + preco + "\nQuantidade: " + quantidade;
    }

    public int getQuantidade() {
        return quantidade;    
    }

    public Object getNome() {
        return nome;
    }
}
