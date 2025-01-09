package aplicação;

import java.util.ArrayList;
import java.util.Scanner;

import academia.Utilitaria;

public class App {

    public static void main(String[] args) {
        menu();
    }

    public static void menu () {
        Scanner s = new Scanner(System.in);

        ArrayList<String> funcionarios = new ArrayList();
        funcionarios.add("Arthur");
        funcionarios.add("1");
        funcionarios.add("Laura");
        funcionarios.add("111");
        funcionarios.add("João");
        funcionarios.add("54321");
        
        // Criação de uma lista de ALUNOS
        ArrayList<Aluno> alunos = new ArrayList();

        int opcao = 0;
        do {
            System.out.println("        MENU        ");

            System.out.println("1- ACADEMIA");
            System.out.println("2- PERSONAL");
            System.out.println("3- SAIR");
            System.out.print("\nDIGITE A OPÇÃO: ");
            
            opcao = s.nextInt();

            if (opcao == 1) {
                // Validação do funcionário
                int tentativa = 0;
                if (tentativa < 3) {
                    System.out.print("Usuário: ");
                    String user = s.next();
                    System.out.print("Senha: ");
                    String senha = s.next();
                    
                    // Caso o funcionario exista, entra no sub menu
                    int opcaoSubMenu = 0;
                    
                    
                    if (funcionarios.contains(user) && funcionarios.contains(senha)){
                    do {
                        System.out.println("\n    Sub MENU        ");
        
                        System.out.println("1- CADASTRO");
                        System.out.println("2- RELATÓRIO");
                        System.out.println("3- VOLTAR");
                        System.out.print("\nDIGITE A OPÇÃO: ");
                        opcaoSubMenu = s.nextInt();
                        

                    
                        if (opcaoSubMenu == 1) {
                            System.out.println("\n  Cadastro Aluno:");
                            System.out.print("Nome: ");
                            String nomeAluno = s.next();
                            // Valida o telefone
                            String telAluno = "";
                            boolean validaTelefone = false;
                            // do { 
                                System.out.print("Telefone: "); 
                                telAluno = s.next(); 
                            //     validaTelefone = Utilitaria.validaTel(telAluno); 
                            //     if (!validaTelefone) { 
                            //         System.out.println("Telefone invalido!\nVoltando..."); 
                            //     } else { 
                            //         break; 
                            //     } 
                            // } while (!validaTelefone);
                            System.out.print("Categoria: ");
                            int catAluno = s.nextInt();

                            // Valida a categoria
                            if (catAluno <= 0 || catAluno > 3) {
                                System.out.println("Categoria invalida!\nvoltando...");
                                break;
                            } else {
                                // Se a categoria for 1, usa um construtor, se não usa o segundo construtor
                                if (catAluno == 1) {
                                    Aluno aluno = new Aluno(Utilitaria.geraCodigo(), nomeAluno, telAluno, catAluno);
                                    alunos.add(aluno);
                                } else {
                                    System.out.print("Acessos: ");
                                    int acessosAluno = s.nextInt();
                                    Aluno aluno = new Aluno(Utilitaria.geraCodigo(), nomeAluno, telAluno, catAluno, acessosAluno);
                                    alunos.add(aluno);
                                }
                            }
                            System.out.println();
                        } else if (opcaoSubMenu == 2) {
                            System.out.println("    RELATÓRIO   \n");
                            for (Aluno aluno : alunos) { 
                                aluno.exibe();
                            }
                            System.out.println("TOTAL DE ALUNOS = " + alunos.size());
                        }
                    } while (opcaoSubMenu != 3);
                         
                    } else {
                        tentativa++;
                    }
                } else {
                    System.out.println("Seu numero de tentativas esgotou!\nsaindo...");
                    break;
                }
            }
        } while (opcao != 3);
    }
}
