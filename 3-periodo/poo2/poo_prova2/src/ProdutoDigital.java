public class ProdutoDigital extends Produto {

    public ProdutoDigital(String nome, double preco) {
        super(nome, preco, Integer.MAX_VALUE);
    }

    @Override
    public void atualizarEstoque(int quantidade) {
        System.out.println("Produto digital não tem controle de estoque.");
    }

    @Override
    public String imprimirDetalhes() {
        return "\n- Produto Digital - \n" + super.imprimirDetalhes();
    }
}
