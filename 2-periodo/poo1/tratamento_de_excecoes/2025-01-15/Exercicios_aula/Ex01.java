import java.util.Scanner;

public class Ex01 {
    public static final String SENHAMASTER = "Pedro@123";
    public static void main (String[]args) {
        Scanner s = new Scanner(System.in);

        boolean tentativa = true;

        do {
            try {
                System.out.print("Digite a sua senha: ");
                String password = s.nextLine();

                validarSenha(password);

                System.out.println("Senha correta!"); 
                tentativa = false;
            } catch (Exception e) {
                System.err.println(e.getMessage());
            }

        } while (tentativa);
    }

    public static void validarSenha(String password) throws Exception {
        if(!password.equals(SENHAMASTER)) {
            throw new Exception("Senha incorreta!");
        }
    }
}