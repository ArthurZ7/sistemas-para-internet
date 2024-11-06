/*---------------------*
| ArthurZ7             |
| BEE 1238             |
| Combinador           |
*---------------------*/
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        int n = s.nextInt();
        
        for (int i=0; i<n; i++) {
            String str1 = s.next();
            String str2 = s.next();
            
            String[] str1vet = str1.split("");
            String[] str2vet = str2.split("");
            
            String strResult = "";
            String resto = "";
            
            int tam = 0;
            String[] strMaior = new String[tam];
            
            if (str1vet.length > str2vet.length){
                tam = str2vet.length;
                strMaior = str1vet;
            } else if (str2vet.length > str1vet.length) {
                tam = str1vet.length;
                strMaior = str2vet;
            }else {
                tam = str1vet.length;
            }
            
            // Adicionar os caracteres alternadamente
            for (int j=0; j<tam; j++) {
                strResult += str1vet[j];
                strResult += str2vet[j];
            }
            
            // Adicionar o resto dos caracteres do vetor maior
            for (int j = tam; j < strMaior.length; j++) {
                resto += strMaior[j];
            }
            
            strResult += resto;
            System.out.println(strResult);
        }

        
        s.close();
    }
}
