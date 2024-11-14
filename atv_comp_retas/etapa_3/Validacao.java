package etapa_3;

public class Validacao {
    
    public static boolean valida (double x1, double y1, double x2, double y2) {
        if (x1 == x2 && y1 == y2) {
            return false;
        } else {
            return true;
        }
    }
}
