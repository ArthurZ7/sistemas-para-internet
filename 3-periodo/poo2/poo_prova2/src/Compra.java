public class Compra extends Transacao{

    public Compra(Produto produto, int quantidade) {
        super(produto, quantidade);
    }

    //Ele deve atualizar o estoque e retornar uma String contendo a informação: “Compra Realizada: quantidade X produto”
    @Override
    public void executar() throws Exception {
        super.executar();
        System.out.println("Compra Realizada: " + quantidade + "; " + produto.getNome());
        produto.atualizarEstoque(quantidade);
    }

}
