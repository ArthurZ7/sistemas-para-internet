
import java.util.Scanner;

public class SistemaBancario {
    public static void main(String[] args) {
        menu();
    }

    public void menu(){
        Scanner scanner = new Scanner(System.in);
        int opcao = 0;
        // do {
        //     System.out.println("1 - Criar Conta Corrente");
        //     System.out.println("3 - Criar Conta Poupança");
        //     System.out.println("4 - Depositar");
        //     System.out.println("5 - Sacar");
        //     System.out.println("6 - Aplicar Rendimento");
        //     System.out.println("7 - Exibir Saldo");
        //     System.out.println("8 - Exibir Limite Cheque Especial");
        //     System.out.println("9 - Exibir Benefício Premium");
        //     System.out.println("10 - Exibir Taxa de Rendimento");
        //     System.out.println("0 - Sair");
        //     System.out.print("Escolha uma opção: ");
        //     opcao = scanner.nextInt();
        //     switch (opcao) {
        //         case 1:
        //             criarContaCorrente();
        //             break;
        //         case 2:
        //             criarContaCorrentePremium();
        //             break;
        //         case 3:
        //             criarContaPoupanca();
        //             break;
        //         case 4:
        //             depositar();
        //             break;
        //         case 5:
        //             sacar();
        //             break;
        //         case 6:
        //             aplicarRendimento();
        //             break;
        //         case 7:
        //             exibirSaldo();
        //             break;
        //         case 8:
        //             exibirLimiteChequeEspecial();
        //             break;
        //         case 9:
        //             exibirBeneficioPremium();
        //             break;
        //         case 10:
        //             exibirTaxaRendimento();
        //             break;
        //         case 0:
        //             System.out.println("Saindo...");
        //             break;
        //         default:
        //             System.out.println("Opção inválida!");
        //             break;
        //     }
        // } while (opcao != 0);
    }
}