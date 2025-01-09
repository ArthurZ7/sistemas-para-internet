package academia;

import java.util.Random;

public class Utilitaria {

    public static String geraCodigo() {
        // Gera um vetor alfabeto
        char[] alfabeto = new char[26]; 
        for (int i = 0; i < 26; i++) { 
            alfabeto[i] = (char)('a' + i);
        }
        
        Random random = new Random();
        String cod = "";

        // Insere 3 letras aleatórias
        for (int x=0; x < 3; x++) {
            cod += alfabeto[random.nextInt(alfabeto.length)];
        }

        // Insere 3 letras aleatórias
        for (int x=0; x < 2; x++) {
            cod +=  ""+random.nextInt(10);
        }

        return cod;
    }


    public static boolean validaTel (String telefone) {
        if (telefone.matches("^\\(3[1-57-9]\\) 9[8-9]\\d{3}-\\d{4}")) {
            return true;
        } else {
            return false;
        }
    }

}
