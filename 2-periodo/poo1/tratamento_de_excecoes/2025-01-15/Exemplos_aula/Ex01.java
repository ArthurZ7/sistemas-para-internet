import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int num1, num2;

        try {
            System.out.print("Digite o primeiro número da divisão:");
            num1 = s.nextInt();

            System.out.print("Digite o segundo número da divisão:");
            num2 = s.nextInt();

            System.out.println("\n" + num1 + " / " + num2 + " = " + (num1/num2));

        } catch (ArithmeticException e) {
            System.err.println("Impossível dividir por 0.");
            s.nextLine();

        }catch (InputMismatchException e) {
            System.err.println("Digite apenas números inteiros.");
        }

    }
}