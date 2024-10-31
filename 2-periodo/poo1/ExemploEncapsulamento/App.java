
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        
        int opcao;
        Pessoa p = null;
        Formacao f = null;

        do { 
            Scanner s = new Scanner (System.in);
            System.out.println("\n-- MENU --");
            System.out.println("  1 - Cadastrar Pessoa");
            System.out.println("  2 - Cadastrar Formação");
            System.out.println("  3 - Exibir");
            System.out.println("  4 - Atualizar Idade");
            System.out.println("  5 - SAIR");
            System.out.print("-- Digite sua opção: ");
            opcao = s.nextInt();

            if (opcao == 1){
                p = lePessoa();
            } else if (opcao == 2){
                f = leFormacao();
            } else if (opcao == 3){
                if (p != null) {
                    System.out.println(p.exibe());
                } else {
                    System.out.println("NÃO HÁ CADASTRO DE PESSOA");
                }
                if (f != null) {
                    System.out.println(f.exibe());
                } else {
                System.out.println("NÃO HÁ CADASTRO DE FORMAÇÃO");
                }
            } else if (opcao == 4){
                if (p != null) {
                    System.out.print("Qual a idade atualizada: ");
                    p.setIdade(s.nextInt());
                } else {
                    System.out.println("\nNÃO TEM IDADE CADASTRADA");
                }
            } else if (opcao == 5){
                System.out.println("Saindo...");
            } else {
                System.out.println("NÚMERO INVÁLIDO");
            }
        } while (opcao != 5);
    }

    public static Pessoa lePessoa() {
        Scanner s = new Scanner (System.in);
        
        Pessoa p;

        System.out.print("Digite o nome da pessoa: ");
        String nome = s.nextLine();
        System.out.print("Digite o sexo (m/f): ");
        char sexo = s.next().charAt(0);
        System.out.print("Digite a idade: ");
        int idade = s.nextInt();
        
        p = new Pessoa (nome, sexo, idade);

        return p;
    }

    public static Formacao leFormacao() {
        Scanner s = new Scanner (System.in);

        Formacao f;

        String nivel;
        boolean concluido;
        int ano;
        String instituicao;


        System.out.print("Qual o nivel de escolaridade: ");
        nivel = s.nextLine();
        System.out.print("Ja concluiu? (s/n)");
        char resp = s.nextLine().charAt(0);
        if ((resp == 's') || (resp == 'S')){
            concluido=true;
        } else {
            concluido=false;
        }
        System.out.print("Digite a instituicao: ");
        instituicao = s.nextLine();
        System.out.print("Digite o ano: ");
        ano = s.nextInt();

        f = new Formacao(nivel, concluido, instituicao, ano);

        return f;

    }

    

}
