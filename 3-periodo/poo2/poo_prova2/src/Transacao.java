public abstract class Transacao implements Operacao {
    protected Produto produto;
    protected int quantidade;

    public Transacao(Produto produto, int quantidade) {
        this.produto = produto;
        this.quantidade = quantidade;
    }

    public void executar() throws Exception {
        if (quantidade > produto.getQuantidade()) {
            throw new Exception("Quantidade insuficiente em estoque.");
        }
        //produto.atualizarEstoque(-quantidade);
    }

}
