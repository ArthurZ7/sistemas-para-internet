package JogadorDeFutebol;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        
        JogadorDeFutebol jogador = null;

        jogador = leDados();
        jogador.exibe();
        anosAposentar(jogador);
    }
    
    public static JogadorDeFutebol leDados() {
        Scanner s = new Scanner (System.in);
    
        JogadorDeFutebol jogador;

        System.out.print("Digite o nome do jogador: ");
        String nome = s.nextLine();
        System.out.print("Digite o ano de nascimento: ");
        int ano_nasc = s.nextInt();
        System.out.print("Digite a altura: ");
        double altura = s.nextDouble();
        System.out.print("Digite o peso: ");
        double peso = s.nextDouble();
        System.out.print("Digite a nacionalidade: ");
        String nacionalidade = s.next();
        System.out.print("[Atacante = 1] [Defesa = 2] [Meio de Campo = 3]\n");
        System.out.print("Qual a posição: ");
        int posicao = s.nextInt();
        while ((posicao != 1) && (posicao != 2) && (posicao != 3)) {
            System.out.println("Número inválido");
            System.out.print("Qual a posição correta: ");
            posicao = s.nextInt();
        } 

        jogador = new JogadorDeFutebol(nome, ano_nasc, altura, peso, nacionalidade, posicao);
        
        return jogador;
    }
    
    public static void anosAposentar (JogadorDeFutebol jogador) {
        if (jogador == null) {
            System.out.println("Não há cadastro para o jogador!");
        } else {
            int idade = jogador.calcularIdade(jogador.getAno_nasc());
            int aposentadoria = 0;

            if (jogador.getPosicao() == 1) {
                aposentadoria = 35 - idade;
            } else if (jogador.getPosicao() == 2){
                aposentadoria = 40 - idade;
            } else if (jogador.getPosicao() == 3){
                aposentadoria = 38 - idade;
            }
            
            System.out.printf("\nFaltam %d anos para o jogador %s se aposentar.", aposentadoria, jogador.getNome());

        }
    }


}
