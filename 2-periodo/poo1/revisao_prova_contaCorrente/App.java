import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        
        ContaCorrente conta1 = new ContaCorrente("Rose Moraes", "3.890-4",1000.00);
        ContaCorrente conta2 = new ContaCorrente("Rose Moraes", "3.890-4", 1000.00, "especial");

        menu(conta1);
        menu(conta2);



    }

    public static void menu (ContaCorrente conta){
        Scanner s = new Scanner(System.in);

        int opcao = 0;

        do {
            System.out.println("  Menu:\n1 - Saque\n2 - Depósito\n3 - Sair\n");

            opcao = s.nextInt();

            if (opcao == 1) {
                System.out.print("Insira o valor do saque: ");
                conta.sacar(s.nextDouble());
                exibir(conta);
            } else if (opcao == 2) {
                System.out.print("Insira o valor do deposito: ");
                conta.depositar(s.nextDouble());
                exibir(conta);
            } else {
                exibir(conta);
            }
              
        } while (opcao != 3);
    }

    public static void exibir (ContaCorrente conta){
        Scanner s = new Scanner(System.in);

        double limiteEspecial;
        
        System.out.println("Nome: " + conta.getNome());
        System.out.println("Número da Conta: " + conta.getNumeroConta());
        System.out.println("Tipo de Conta: " + conta.getTipoConta());
        if (conta.getTipoConta() == "especial") {
            limiteEspecial = s.nextDouble();
            System.out.println("Limite: " + limiteEspecial);
        }
        System.out.println("Saldo: " + conta.getSaldo());
    }
}
