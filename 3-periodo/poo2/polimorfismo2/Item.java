public class Item {
    Parte parte;
    int quantidade;

    public Item(Parte parte, int quantidade) {
        this.parte = parte;
        this.quantidade = quantidade;
    }

    public float valorTotal() {
        return parte.calculaValor() * quantidade;
    }

    @Override
    public String toString() {
        return "cod:" + parte.cod + " nome:" + parte.nome +
                " quantidade:" + quantidade +
                " valor unitario:" + String.format("%.1f", parte.calculaValor()) +
                " valor:" + String.format("%.1f", valorTotal());
    }
}
