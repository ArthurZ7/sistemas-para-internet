public class EGrau2 {
    
    public double a, b, c;

    public EGrau2(double x, double y, double z) {
        a = x;
        b = y;
        c = z;
    }

    public double delta() {
        double delta = (b*b) - 4*a*c;
        return delta;
    }

    public double calculaX1(double delta){
        double x1;
        x1 = (-b + Math.sqrt(delta)) / (2*a);
        return x1;
    }
    
    public double calculaX2(double delta){
        double x2;
        x2 = (-b - Math.sqrt(delta)) / (2*a);
        return x2;
    }
}
