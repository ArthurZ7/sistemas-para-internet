package JogadorDeFutebol;

import java.time.LocalDate;

public class JogadorDeFutebol {

    private String nome;
    private int ano_nasc;
    private double altura;
    private double peso;
    private String nacionalidade;
    private int posicao;

    public JogadorDeFutebol(String nome, int ano_nasc, double altura, double peso, String nacionalidade,
    int posicao) {
        this.nome = nome;
        this.ano_nasc = ano_nasc;
        this.altura = altura;
        this.peso = peso;
        this.nacionalidade = nacionalidade;
        this.posicao = posicao;
    }

    public int calcularIdade (int ano_nasc){
        int anoAtual = LocalDate.now().getYear();

        return anoAtual - ano_nasc;
    }

    public void exibe (){
        System.out.printf(
            "\nNome: %s" +
            "\nData de Nascimento: %d" +
            "\nAltura: %.2f"+
            "\nPeso: %.1f" +
            "\nNacionalidade: %s" +
            "\nPosição: %s", 
            this.nome, this.ano_nasc, this.altura, this.peso, this.nacionalidade, this.posicao);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAno_nasc() {
        return ano_nasc;
    }

    public void setAno_nasc(int ano_nasc) {
        this.ano_nasc = ano_nasc;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public int getPosicao() {
        return posicao;
    }

    public void setPosicao(int posicao) {
        this.posicao = posicao;
    }

}
