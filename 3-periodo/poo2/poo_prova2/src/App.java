import java.util.Scanner;

public class App {
    
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        GerenciaEstoque gerenciaEstoque = new GerenciaEstoque();

        exibeMenu();
        int opcao = scanner.nextInt();
        scanner.nextLine();

        while (opcao != 5) {
            switch (opcao) {
                case 1:
                    // Sub menu 
                    System.out.println("\n - -  SUB MENU  - - ");
                    System.out.println("1- PRODUTO FISICO");
                    System.out.println("2- PRODUTO DIGITAL");
                    System.out.println("3- VOLTAR");
                    System.out.print("ESCOLHA UMA OPÇÃO: ");
                    int tipo = scanner.nextInt();
                    scanner.nextLine();

                    if (tipo == 1) {
                        System.out.println("\n - -  PRODUTO FÍSICO  - - ");
                        System.out.print("Digite o nome do produto: ");
                        String nome = scanner.nextLine();

                        // Verifica se o produto já existe
                        if (gerenciaEstoque.buscarProduto(nome) != null) {
                            System.out.println("Erro: Produto com o nome '" + nome + "' já está cadastrado.");
                            break;
                        }

                        System.out.print("Digite o preço do produto: ");
                        double preco = scanner.nextDouble();
                        System.out.print("Digite a quantidade do produto: ");
                        int quantidade = scanner.nextInt();
                        scanner.nextLine();

                        Produto produto = new ProdutoFisico(nome, preco, quantidade);
                        System.out.println(produto.imprimirDetalhes());
                        gerenciaEstoque.adicionarProduto(produto);
                        break;
                    } else if (tipo == 2) { 
                        System.out.println("\n - -  PRODUTO DIGITAL  - - ");
                        System.out.print("Digite o nome do produto: ");
                        String nome = scanner.nextLine();

                        // Verifica se o produto já existe
                        if (gerenciaEstoque.buscarProduto(nome) != null) {
                            System.out.println("Erro: Produto com o nome '" + nome + "' já está cadastrado.");
                            break;
                        }

                        System.out.print("Digite o preço do produto: ");
                        double preco = scanner.nextDouble();

                        Produto produto = new ProdutoDigital(nome, preco);
                        gerenciaEstoque.adicionarProduto(produto);
                        System.out.println(produto.imprimirDetalhes());
                        break;
                    } else if (tipo == 3) {
                        System.out.println("Voltando ao menu principal...");
                        continue;
                    } else {
                        break;
                    }

                case 2:
                    System.out.print("Digite o nome do produto: ");
                    String nomeProdutoCompra = scanner.nextLine();
                    System.out.print("Digite a quantidade a comprar: ");
                    int quantidadeCompra = scanner.nextInt();
                    scanner.nextLine();


                    // Realiza a compra
                    Produto produtoCompra = gerenciaEstoque.buscarProduto(nomeProdutoCompra);
                    if (produtoCompra != null) {
                        Compra compra = new Compra(produtoCompra, quantidadeCompra);
                        try {
                            compra.executar();
                        } catch (Exception e) {
                            System.out.println("Erro ao realizar a compra: " + e.getMessage());
                        }
                    } else {
                        System.out.println("--> Produto não encontrado.");
                    }
                    break;

                case 3:
                    System.out.print("Digite o nome do produto: ");
                    String nomeProdutoVenda = scanner.nextLine();
                    System.out.print("Digite a quantidade a vender: ");
                    int quantidadeVenda = scanner.nextInt();
                    scanner.nextLine();

                    // Realiza a venda
                    Produto produtoVenda = gerenciaEstoque.buscarProduto(nomeProdutoVenda);
                    if (produtoVenda != null) {
                        Venda venda = new Venda(produtoVenda, quantidadeVenda);
                        try {
                            venda.executar();
                        } catch (Exception e) {
                            System.out.println("Erro ao realizar a venda: " + e.getMessage());
                        }
                    } else {
                        System.out.println("Produto não encontrado.");
                    }

                    break;

                case 4:
                    System.out.println("Transações realizadas:");
                    System.out.println(gerenciaEstoque.listarProdutos());
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
            System.out.println("----------------------------");
            exibeMenu();
            opcao = scanner.nextInt();
            scanner.nextLine();
        }

        

    }

    public static void exibeMenu() {
        System.out.println(" - -  M E N U  - - ");
        System.out.println("1- ADICIONA PRODUTO");
        System.out.println("2- COMPRA");
        System.out.println("3- VENDA");
        System.out.println("4- EXIBE TRANSAÇÕES");
        System.out.println("5- SAIR");
        System.out.print("ESCOLHA UMA OPÇÃO: ");
    }
}
