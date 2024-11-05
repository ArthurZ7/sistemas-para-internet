/*----------------*
| Arthur Borges   |
| 20/09/2024      |
*----------------*/
import java.util.Scanner;

public class Fibonacci {
    public static int calcularFib(int n){
        if (n==0) {
            return 0;
        } else if (n==1){
            return 1;
        } else {
            int v = calcularFib(n-1) + calcularFib(n-2);
            return v;
        }
    }
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);

        System.out.print("Digite a posição da série de fibonacci: ");
        int n = s.nextInt();

        System.out.printf("O valor da sequencia é: %d\n", calcularFib(n));
    }
}
