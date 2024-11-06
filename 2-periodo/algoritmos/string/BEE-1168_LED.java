/*--------------*
| ArthurZ7      |
| BEE 1168      |
| LED           |
*--------------*/
import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	    
	    Scanner s = new Scanner (System.in);
        
        // Num de repeticoes
        int n = s.nextInt();
        int leds = 0;
        
        for (int i=0; i<n; i++){
            String texto = s.next();
            
            for (int j=0; j<texto.length(); j++)
            {
                char numero = texto.charAt(j);
                
                if (numero == 49) { // Char = 1
                    leds += 2;
                } else if (numero == 55) { // Char = 7 
                    leds += 3;
                } else if (numero == 52) { // Char = 4
                    leds += 4;
                } else if (numero == 50 || numero == 51 || numero == 53) { // Char = 2 e 3 e 5
                    leds += 5;
                } else if (numero == 54 || numero == 57 || numero == 48) { // Char = 6 e 9 e 0
                    leds += 6;
                } else if (numero == 56) { // Char = 8
                    leds += 7;
                }
            }
            System.out.println(leds + " leds");
            leds=0;
        }
	}
}
