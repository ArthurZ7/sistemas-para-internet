/*----------------*
| Arthur Borges   |
| 20/09/2024      |
*----------------*/
import java.util.Scanner;

public class notaMaior {

    static double maiorNota (double nota1, double nota2) {
        if (nota1 > nota2) {
            return nota1;
        } else {
            return nota2;
        }
    }
    public static void main(String[] args) throws Exception {
        Scanner ler = new Scanner(System.in);
        
        double a, b;

        a = ler.nextDouble();
        b = ler.nextDouble();

        System.out.println(maiorNota(a, b));

        ler.close();
    }

}
