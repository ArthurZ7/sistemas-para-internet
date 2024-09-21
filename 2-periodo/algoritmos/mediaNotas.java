/*----------------*
| Arthur Borges   |
| 20/09/2024      |
*----------------*/
import java.util.Scanner;

public class mediaNotas {
    
    static double media(double[] valores, int qnt) {
        double soma = 0;

        for (int i=0; i<qnt; i++){
            soma += valores[i];
        }

        return soma/qnt;
    }
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);


        System.out.print("Quantas notas você tem? ");
        int qnt = ler.nextInt();

        double notas[] = new double[qnt];

        for (int i=0; i<qnt; i++){
            System.out.printf("Nota %d: ", i+1);
            notas[i] = ler.nextDouble();
        }

        System.out.printf("A média das suas notas é: %.2f\n", media(notas, qnt));
        

    }
}