/*---------------------*
| ArthurZ7             |
| BEE 1253             |
| Cifra de César       |
*---------------------*/
import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	    
	    Scanner s = new Scanner (System.in);
        
        int n = s.nextInt();
        s.nextLine();
        
        for (int i=0; i<n; i++){
            
            String cod = s.nextLine();
            int deslocamento = s.nextInt();
             s.nextLine();
            
            String resultado = "";
            
            for (int j=0; j<cod.length(); j++){
                int r = cod.charAt(j) - deslocamento;
                
                if (r < 'A') {
                    r += 26;
                }
                
                resultado += (char) r;
            }
                
            System.out.println(resultado);
        }
	}
}
