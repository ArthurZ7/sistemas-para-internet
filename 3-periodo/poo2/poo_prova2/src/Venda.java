public class Venda extends Transacao {

    public Venda(Produto produto, int quantidade) {
        super(produto, quantidade);
    }

    @Override
    public void executar() throws Exception {
        super.executar();
        System.out.println("Venda Realizada: " + quantidade + "; " + produto.getNome());
        produto.atualizarEstoque(-quantidade);
    }
    


}
