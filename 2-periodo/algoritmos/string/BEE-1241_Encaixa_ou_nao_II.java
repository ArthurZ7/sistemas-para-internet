/*---------------------*
| ArthurZ7             |
| BEE 1241             |
| Encaixa ou Não II    |
*---------------------*/
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        int n = s.nextInt();
        
        for (int i=0; i<n; i++) {
            String valorA = s.next();
            String valorB = s.next();
            
            int tamA = valorA.length();
            int tamB = valorB.length();
            
            if (tamB > tamA) {
                System.out.println("nao encaixa");
                continue;
            }
            
            char[] charValorA = valorA.toCharArray();
            char[] charValorB = valorB.toCharArray();

            boolean encaixa = true;
            
            for (int j=0; j<tamB; j++) {
                    if (charValorA[tamA-tamB +j] != charValorB[j]) {
                        encaixa = false;
                        break;
                    }
                }
                
            if (encaixa){
                System.out.println("encaixa");
            } else {
                System.out.println("nao encaixa");
            }
        }

        
        s.close();
    }
}
