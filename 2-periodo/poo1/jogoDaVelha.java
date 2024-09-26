/*----------------*
| Arthur Borges   |
| 25/09/2024      |
*----------------*/
import java.util.Scanner;

public class jogoDaVelha {

    static int tabuleiro [][] = new int [3][3];

        public static void main(String[] args){

        // Preenche matriz "tabuleiro" com 0 (vazio)
        for (int i=0; i<3; i++) {
            for (int j=0; j<3; j++) {
                tabuleiro[i][j] = 0;
            }
        }
        
        int jogador = 1;
        int posicao = 0;
        int contJogadas = 1;
        
        while ((vitoria() != true) && (empate() != true)) {
            posicao = interfaceTabuleiro(jogador);
            
            // Se a posição estiver vazia [0], ele preenche de acordo com o respectivo jogador
            if (validacao(posicao)) {
                contJogadas++;
        
                // Após recebida a jogada, verifica cada uma das 9 posições para preencher no tabuleiro
                if (posicao == 1) {
                    if (jogador == 1) {
                    tabuleiro[0][0] = 1; 
                    }
                    else {
                        tabuleiro[0][0] = 2; 
                    }
                }
                else if (posicao == 2) {
                    if (jogador == 1) {
                    tabuleiro[0][1] = 1; 
                    }
                    else {
                        tabuleiro[0][1] = 2; 
                    }
                }
                else if (posicao == 3) {
                    if (jogador == 1) {
                    tabuleiro[0][2] = 1; 
                    }
                    else {
                        tabuleiro[0][2] = 2; 
                    }
                }
                else if (posicao == 4) {
                    if (jogador == 1) {
                    tabuleiro[1][0] = 1; 
                    }
                    else {
                        tabuleiro[1][0] = 2; 
                    }
                }
                else if (posicao == 5) {
                    if (jogador == 1) {
                    tabuleiro[1][1] = 1; 
                    }
                    else {
                        tabuleiro[1][1] = 2; 
                    }
                }
                else if (posicao == 6) {
                    if (jogador == 1) {
                    tabuleiro[1][2] = 1; 
                    }
                    else {
                        tabuleiro[1][2] = 2; 
                    }
                }
                else if (posicao == 7) {
                    if (jogador == 1) {
                    tabuleiro[2][0] = 1; 
                    }
                    else {
                        tabuleiro[2][0] = 2; 
                    }
                }
                else if (posicao == 8) {
                    if (jogador == 1) {
                    tabuleiro[2][1] = 1; 
                    }
                    else {
                        tabuleiro[2][1] = 2; 
                    }
                }
                else if (posicao == 9) {
                    if (jogador == 1) {
                    tabuleiro[2][2] = 1; 
                    }
                    else {
                        tabuleiro[2][2] = 2; 
                    }
                }

                // Alterna jogador
                // Se o jogador for = 1, recebe o '2', e se for = 2, recebe o '1'
                jogador = (jogador == 1) ? 2 : 1;


            } else {
                restricao();
            }

        }
        exibeFim(jogador == 1 ? 2 : 1);  // O jogador que fez a última jogada é o vencedor
    }


    // 1)
    static int interfaceTabuleiro(int jogador) {
        Scanner s = new Scanner (System.in);

        System.out.println("Tabuleiro Atual: ");
        
        for (int i=0; i<3; i++) {
            for (int j=0; j<3; j++) {
                if (tabuleiro[i][j] == 1) {
                    System.out.print(" X");
                } 
                else if (tabuleiro[i][j] == 2) {
                    System.out.print(" O");
                } 
                else {
                    System.out.print(" -");
                }
            }
            System.out.println();
        }

        System.out.println("\n 1 2 3");
        System.out.println(" 4 5 6");
        System.out.println(" 7 8 9\n");


        if (jogador == 1) {
            System.out.println("Jogador 'X' é a sua vez de jogar!");
        } else {
            System.out.println("Jogador 'O' é a sua vez de jogar!");
        }

        
        System.out.print("Escolha uma posição: ");
        int jogada = s.nextInt();

        return jogada;
    }

    // 2)
    static boolean validacao(int jogada) {

        // Verifica cada uma das jogadas se a posição da matriz está vazia [0]
        if (jogada == 1) {
            if (tabuleiro [0][0] == 0) {
                return true;
            } else {
                return false;
            }
        } 
        else if (jogada == 2){
            if (tabuleiro [0][1] == 0) {
                return true;
            } else {
                return false;
            }
        }
        else if (jogada == 3){
            if (tabuleiro [0][2] == 0) {
                return true;
            } else {
                return false;
            }
        }
        else if (jogada == 4){
            if (tabuleiro [1][0] == 0) {
                return true;
            } else {
                return false;
            }
        }
        else if (jogada == 5){
            if (tabuleiro [1][1] == 0) {
                return true;
            } else {
                return false;
            }
        }
        else if (jogada == 6){
            if (tabuleiro [1][2] == 0) {
                return true;
            } else {
                return false;
            }
        }
        else if (jogada == 7){
            if (tabuleiro [2][0] == 0) {
                return true;
            } else {
                return false;
            }
        }
        else if (jogada == 8){
            if (tabuleiro [2][1] == 0) {
                return true;
            } else {
                return false;
            }
        }
        else if (jogada == 9){
            if (tabuleiro [2][2] == 0) {
                return true;
            } else {
                return false;
            }
        }
        return false;
    }

    // 3)
    static void restricao() {
        System.out.println("\n- - JOGADA INVÁLIDA - -\n");
    }

    // 4)
    static boolean empate(){
        // Verificamos se o tabuleiro está cheio
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (tabuleiro[i][j] == 0) {  // 0 representa uma célula vazia
                    return false;  // Jogo ainda não acabou, há células vazias
                }
            }
        }

        // Jogo deu empate (velha)
        return true;   
    }

    // 5)
    static boolean vitoria() {
        for (int i = 0; i < 3; i++) {
            // Se o primeiro elemento é dif de 0 e o restante da LINHA forem iguais
            if ((tabuleiro[i][0] != 0) && (tabuleiro[i][0] == tabuleiro[i][1]) && (tabuleiro[i][1] == tabuleiro[i][2])) {
                return true;
            }
    
            // Se o primeiro elemento é dif de 0 e o restante da COLUNA forem iguais
            if ((tabuleiro[0][i] != 0) && (tabuleiro[0][i] == tabuleiro[1][i]) && (tabuleiro[1][i] == tabuleiro[2][i])) {
                return true;
            }
        }
    
        // Se o primeiro elemento é dif de 0 e o restante PRIMEIRA DIAGONAL forem iguais
        if ((tabuleiro[0][0] != 0) && (tabuleiro[0][0] == tabuleiro[1][1]) && (tabuleiro[1][1] == tabuleiro[2][2])) {
            return true;
        }
    
        // Se o primeiro elemento é dif de 0 e o restante SEGUNDA DIAGONAL forem iguais
        if ((tabuleiro[2][0] != 0) && (tabuleiro[2][0] == tabuleiro[1][1]) && (tabuleiro[1][1] == tabuleiro[0][2])) {
            return true;
        }
    
        return false;
    }

    // 6)
    static void exibeFim(int jogador){

        System.out.println("\n  __ FIM __");
        for (int i=0; i<3; i++) {
            System.out.print("  |");
            for (int j=0; j<3; j++) {
                if (tabuleiro[i][j] == 1) {
                    System.out.print(" X");
                } 
                else if (tabuleiro[i][j] == 2) {
                    System.out.print(" O");
                } 
                else {
                    System.out.print(" -");
                }
            }
            System.out.print(" |");
            System.out.println();
        }

        if (empate()) {
            System.out.println("--> DEU VELHA :/\n");
        }
        else if (jogador == 1){
            System.out.println( "\n--> PARABENS!! JOGADOR 'X' GANHOU\n");

        } 
        else if (jogador == 2) {
            System.out.println("\n--> PARABENS!! JOGADOR 'O' GANHOU\n");
        }
    }

    
}
