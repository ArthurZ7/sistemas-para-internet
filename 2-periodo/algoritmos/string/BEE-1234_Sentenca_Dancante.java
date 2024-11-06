/*---------------------*
| ArthurZ7             |
| BEE 1234             |
| Sentença Dançante    |
*---------------------*/
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String texto = scanner.nextLine();
        char[] caracteres = texto.toCharArray();

        boolean maiuscula = true;

        for (int i = 0; i < caracteres.length; i++) {
            char c = caracteres[i];

            if (c != ' ') {
                if (i == 0) {
                    if (c >= 'a' && c <= 'z') {
                        c -= 32; // Converte para maiúscula
                    }
                } else {
                    // Alterna entre maiúscula e minúscula
                    if (maiuscula) {
                        if (c >= 'a' && c <= 'z') {
                            c -= 32; // Converte para maiúscula
                        }
                    } else {
                        if (c >= 'A' && c <= 'Z') {
                            c += 32; // Converte para minúscula
                        }
                    }
                }
                caracteres[i] = c;
                maiuscula = !maiuscula; // Alterna o estado
            }
        }

        String resultado = new String(caracteres);
        System.out.println(resultado);
        
        scanner.close();
    }
}
