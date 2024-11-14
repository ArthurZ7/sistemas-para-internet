package etapa_1;

import java.util.Scanner;

public class App {
    
    public static boolean valida (double x1, double y1, double x2, double y2) {
        if (x1 == x2 && y1 == y2) {
            return false;
            
        } else {
            return true;
        }
    }

    public static double leCoordenada (int num) {
        Scanner s = new Scanner(System.in);
        
        if (num == 1) {
            System.out.print("Digite o valor de x1: ");
            return s.nextDouble();
        } if (num == 2) {
            System.out.print("Digite o valor de y1: ");
            return s.nextDouble();
        } if (num == 3) {
            System.out.print("Digite o valor de x2: ");
            return s.nextDouble();
        } else {
            System.out.print("Digite o valor de y2: ");
            return s.nextDouble();
        } 
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        double x1, y1, x2, y2;
        

        int repete = 1;
        int cont = 0;
        while (repete == 1) {
            
            x1 = leCoordenada(1);
            y1 = leCoordenada(2);
            x2 = leCoordenada(3);
            y2 = leCoordenada(4);
            
            if (valida(x1, y1, x2, y2)) {
                Retas r = new Retas(x1, y1, x2, y2);
                
                System.out.println(r.comprimento());
                cont ++;

                System.out.println(r.exibe());

                System.out.println("Se deseja repetir digite '1': ");
                repete = s.nextInt();
            } else {
                System.out.println("Não é uma reta!");
            }
        }
        System.out.printf("\nForam calculadas o comprimento de %d retas", cont);
    }
}
