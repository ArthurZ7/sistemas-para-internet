import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int numerador, denominador;
        boolean continua = true;

        do {
            try {
                System.out.print("Numerador: ");
                numerador = s.nextInt();
    
                System.out.print("Denominador: ");
                denominador = s.nextInt();

                int resultado = divisao(numerador, denominador);
                System.out.println("\nResultado: " + resultado);
                continua = false;
            }catch (ArithmeticException e) {
                System.err.println("Impossível dividir por 0.\n\n");
                s.nextLine();
    
            }catch (InputMismatchException e) {
                System.err.println("Digite apenas números inteiros.\n\n");
                s.nextLine();
            }
        } while (continua);
        
    }


    public static int divisao(int numerador, int denominador) {
        
        if(denominador == 0) {
            throw new ArithmeticException ();
        }
        int resultado = numerador / denominador;
        return resultado;
    }
}
