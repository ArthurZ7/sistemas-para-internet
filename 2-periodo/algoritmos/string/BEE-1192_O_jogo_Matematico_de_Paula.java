/*---------------------*
| ArthurZ7             |
| BEE 1168             |
| O jogo Matemático    | 
|   de Paula           |
*---------------------*/
import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	    
	    Scanner s = new Scanner (System.in);
        
        // Num de repeticoes
        int n = s.nextInt();
        s.nextLine();
        
        for (int i=0; i<n; i++){
           // Lê a linha inteira
            String input = s.nextLine();
            String[] parts = input.split(" ");
            
            int num1 = input.charAt(0) - '0';
            char letra = input.charAt(1);
            int num2 = input.charAt(2) - '0';
            
            // Manipulação
            int resultado = 0;
            if (num1 == num2) {
                resultado += num1 * num2;
            } else if (letra >= 'A' && letra <= 'Z') {
                resultado += num2 - num1;
            } else if (letra >= 'a' && letra <= 'z'){
                resultado += num1 + num2;
            }
            
            System.out.println(resultado);
        }
	}
}
