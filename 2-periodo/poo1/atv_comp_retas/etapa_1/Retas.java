package etapa_1;

public class Retas {
    
    private double x1;
    private double y1;
    private double x2;
    private double y2;

    public Retas() {

    }

    public Retas(double x1, double y1, double x2, double y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    public double comprimento() {
        // Raiz de (x1-x2)^2 + (y1-y2)^2
        return Math.sqrt(Math.pow(x1-x2, 2) + Math.pow(y1-y2, 2));
    }

    public String exibe() {
        String result = "O comprimento da reta é: " + comprimento();
        return result;
    }

    public double getX1() {
        return x1;
    }

    public void setX1(double x1) {
        this.x1 = x1;
    }

    public double getY1() {
        return y1;
    }

    public void setY1(double y1) {
        this.y1 = y1;
    }

    public double getX2() {
        return x2;
    }

    public void setX2(double x2) {
        this.x2 = x2;
    }

    public double getY2() {
        return y2;
    }

    public void setY2(double y2) {
        this.y2 = y2;
    }

    
        
}
