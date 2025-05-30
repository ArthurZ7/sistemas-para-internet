import java.util.ArrayList;
import java.util.List;

public class GerenciaEstoque {
    private List<Produto> produtos;

    public GerenciaEstoque() {
        this.produtos = new ArrayList<>();
    }

    public void adicionarProduto(Produto produto) {
        produtos.add(produto);
    }

    public Produto buscarProduto(String nome) {
        for (Produto produto : produtos) {
            if (produto.getNome().equals(nome)) {
                return produto;
            }
        }
        return null;
    }

    public String listarProdutos () {
        StringBuilder sb = new StringBuilder();
        for (Produto produto : produtos) {
            sb.append(produto.imprimirDetalhes()).append("\n\n");
        }
        return sb.toString();
    }
}
