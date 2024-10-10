import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner (System.in);
        double a, b, c;
        String repetir = "s";

        while ((repetir.equals("s")) || (repetir.equals("S"))) { 
            do {
                a = le(1);
            } while (a<=0);
            b = le(2);
            c = le(3);

            EGrau2 obj = new EGrau2(a, b, c);

            double delta, x1, x2;

            

            delta = obj.delta();
            x1 = obj.calculaX1(delta);
            x2 = obj.calculaX2(delta);

            if (delta <= 0){
                System.out.println("-- Não é possível calcular as raízes pois o delta é menor do quer 0!");
            } else {
                System.out.println(exibe(x1, x2));
            }

            System.out.print("\nDeseja resolver uma nova equação do 2º grau? [Sim = S; Não = N]: ");
            repetir = s.next();
        }
    }

    public static double le (int x) {
        Scanner s = new Scanner (System.in);

        if (x == 1){
            System.out.print("Digite o valor do coeficiente A [A > 0]: ");
            return s.nextDouble();
        }else if (x == 2) {
            System.out.print("Digite o valor do coeficiente B: ");
            return s.nextDouble();
        } else {
            System.out.print("Digite o valor do coeficiente C: ");
            return s.nextDouble();
        }
    }

    public static String exibe(double x1, double x2){
        String result;

        result = "O valor das raízes são:\nX1 = " + x1 + "\nX2 = " + x2;

        return result;
    }
}
