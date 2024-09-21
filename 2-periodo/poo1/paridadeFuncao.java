/*----------------*
| Arthur Borges   |
| 19/09/2024      |
*----------------*/
import java.util.Scanner;

public class paridadeFuncao {

    static int ler() {
        Scanner s = new Scanner (System.in);

        System.out.print("Informe um numero: ");
        return s.nextInt();
    }


    static void restricao() {
        System.out.println("Número menor que 0!");
    }

    static boolean paridade(int num) {
        if ((num % 2) == 0) {
            return true;
        } else {
            return false;
        }
    }

    static void exibe(boolean paridade){
        if (paridade == true) {
            System.out.println("Esse número é par");
        } else {
            System.out.println("Esse número é ímpar");
        }
    }

    public static void main(String[] args){
        
        int num = ler();

        if (num < 0) {
            restricao();
        } else {
            exibe(paridade(num));
        }

    }
}