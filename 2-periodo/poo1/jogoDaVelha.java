/*----------------*
| Arthur Borges   |
| 25/09/2024      |
*----------------*/
import java.util.Scanner;

public class jogoDaVelha {

    static int tabuleiro [][] = new int [3][3];

    public static void main(String[] args){
        for (int i=0; i<3; i++) {
            for (int j=0; j<3; j++) {
                tabuleiro[i][j] = 0;
            }
        }
        
        int jogador = 1;

        int contJogadas = 0;
        
        while () {
            int posicao = interfaceTabuleiro(jogador);
            
            // Se a posição estiver vazia [0], ele preenche de acordo com o respectivo jogador
            if (validacao(posicao)) {
                contJogadas++;
                
                // Caso a qnt de jogadas válidas for PAR é o jogador 1, caso for IMPAR é o jogador 2
                if (contJogadas%2 == 0) {
                    jogador = 1;
                } else {
                    jogador = 2;
                }
                
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
            }
        }
    }


    // 1)
    static int interfaceTabuleiro(int jogador) {
        Scanner s = new Scanner (System.in);

        System.out.println("Tabuleiro Atual: ");
        
        for (int i=0; i<3; i++) {
            for (int j=0; j<3; j++) {
                System.out.printf(" %d ", tabuleiro[i][j]);
                if (tabuleiro[i][j] == 1) {
                    System.out.print("X");
                } 
                else if (tabuleiro[i][j] == 2) {
                    System.out.print("O");
                } 
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        System.out.println("\n1 2 3");
        System.out.println("4 5 6");
        System.out.println("7 8 9\n");

        System.out.printf("Jogador '%d' é a sua vez de jogar!\n", jogador);
        
        System.out.println("Escolha uma posição: ");
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
    }

    // // 3)
    // static void restricao() {

    // }

    // // 4)
    // static boolean empate(){

    // }

    // // 5)
    // static boolean vitoria(){

    // }

    // // 6)
    // static void exibeFim(int){

    // }

    
}