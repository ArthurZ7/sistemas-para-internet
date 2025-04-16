public class GeometriaPlana {
    
    private Figuras2D fig;

    public void mudaParaCirculo() {
        fig = new Circulo();
        System.out.println(fig.pegaTexto());
    }
    public void mudaParaTriangulo() {
        fig = new Triangulo();
        System.out.println(fig.pegaTexto());
    }
    public void mudaParaQuadrado() {
        fig = new Quadrado();
        System.out.println(fig.pegaTexto());
    }
}