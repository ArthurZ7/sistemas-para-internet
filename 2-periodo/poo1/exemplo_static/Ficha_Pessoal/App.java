import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);

        List<FichaPessoal> cadastros;

        cadastros = new ArrayList<FichaPessoal>();


        char continuar = 's';
        do {
            FichaPessoal ficha = new FichaPessoal();

            System.out.print("Digite o nome: ");
            ficha.setNome(s.nextLine());

            System.out.print("Digite a idade: ");
            ficha.setIdade(s.nextInt());

            cadastros.add(ficha);

            System.out.println("Deseja inserir outro usuario? [Sim = s; Não = n]");
            continuar = s.next().charAt(0);
            s.nextLine();

        } while (continuar == 's');

        exibe(cadastros);
        System.out.println("Pessoas cadastradas: " + cadastros.size());
    }

    public static void exibe (List<FichaPessoal> cadastro) {
        for (FichaPessoal c : cadastro) {
            System.out.println("Nome: " + c.getNome());
            System.out.println("Idade: " + c.getIdade());
        }
    }
}
