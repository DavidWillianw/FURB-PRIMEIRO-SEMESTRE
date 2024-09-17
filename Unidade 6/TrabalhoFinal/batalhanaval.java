package TrabalhoFinal;

import java.util.Random;
import java.util.Scanner;

public class batalhanaval {

    public static final int NUMERO_NAVIOS = 10;
    public static final char EMBARCACAO = 'N';
    public static final char TIRO_CERTO = 'X';
    public static final char TIRO_ERRADO = 'O';
    public static int jogadas = 0;

    public static void main(String[] args) {
        char[][] tabuleiro = new char[8][8];
        inicializarTabuleiro(tabuleiro);
        posicionarNavios(tabuleiro);
        interagirComJogador(tabuleiro);
    }

    public static void inicializarTabuleiro(char[][] tabuleiro) {
        for (int i = 0; i < tabuleiro.length; i++) {
            for (int j = 0; j < tabuleiro[i].length; j++) {
                tabuleiro[i][j] = '~';
            }
        }
    }

    public static void exibirTabuleiro(char[][] tabuleiro) {
        System.out.print("  ");
        for (int col = 0; col < tabuleiro[0].length; col++) {
            System.out.print(col + " ");
        }
        System.out.println();

        for (int linha = 0; linha < tabuleiro.length; linha++) {
            System.out.print(linha + " ");
            for (int coluna = 0; coluna < tabuleiro[linha].length; coluna++) {
                if (tabuleiro[linha][coluna] == EMBARCACAO) {
                    System.out.print('~' + " "); 
                } else {
                    System.out.print(tabuleiro[linha][coluna] + " ");
                }
            }
            System.out.println();
        }
    }

    public static void exibirTabuleiroFinal(char[][] tabuleiro) {
        System.out.println("\nTabuleiro completo:");
        System.out.print("  ");
        for (int col = 0; col < tabuleiro[0].length; col++) {
            System.out.print(col + " ");
        }
        System.out.println();

        for (int linha = 0; linha < tabuleiro.length; linha++) {
            System.out.print(linha + " ");

            for (int coluna = 0; coluna < tabuleiro[linha].length; coluna++) {
                if (tabuleiro[linha][coluna] == EMBARCACAO) {
                    System.out.print('N' + " ");
                } else {
                    System.out.print(tabuleiro[linha][coluna] + " ");
                }
            }
            System.out.println();
        }
    }

    public static void posicionarNavios(char[][] tabuleiro) {
        Random random = new Random();
        int naviosColocados = 0;
        while (naviosColocados < NUMERO_NAVIOS) {
            int linha = random.nextInt(tabuleiro.length);
            int coluna = random.nextInt(tabuleiro.length);
            if (tabuleiro[linha][coluna] == '~') {
                tabuleiro[linha][coluna] = EMBARCACAO;
                naviosColocados++;
            }
        }
    }

    public static void interagirComJogador(char[][] tabuleiro) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            exibirTabuleiro(tabuleiro);
            System.out.print("Digite a linha (0 a " + (tabuleiro.length - 1) + "): ");
            int linha = scanner.nextInt();
            System.out.print("Digite a coluna (0 a " + (tabuleiro.length - 1) + "): ");
            int coluna = scanner.nextInt();

            if (linha < 0 || linha >= tabuleiro.length || coluna < 0 || coluna >= tabuleiro.length) {
                System.out.println("\nCoordenadas inválidas. Tente novamente.");
                continue;
            }

            feedbackDosAtaques(tabuleiro, linha, coluna);
            jogadas++;

            if (naviosRestantes(tabuleiro) == 0) {
                System.out.println("Parabéns! Você afundou todos os navios.");
                exibirTabuleiroFinal(tabuleiro);
                break;
            } else if (jogadas >= 30) {
                System.out.println("Você excedeu o número máximo de jogadas. Fim de jogo.");
                System.out.println("Navios restantes: " + naviosRestantes(tabuleiro));
                exibirTabuleiroFinal(tabuleiro);
                break;
            }
        }
        scanner.close();
    }

    public static void feedbackDosAtaques(char[][] tabuleiro, int linha, int coluna) {
        if (tabuleiro[linha][coluna] == TIRO_CERTO || tabuleiro[linha][coluna] == TIRO_ERRADO) {
            System.out.println("Você já atacou esta posição. Tente novamente.");
            return;
        }

        if (tabuleiro[linha][coluna] == EMBARCACAO) {
            System.out.println("\nAcertou um navio!");
            tabuleiro[linha][coluna] = TIRO_CERTO;
        } else {
            System.out.println("\nErrou o tiro.");
            tabuleiro[linha][coluna] = TIRO_ERRADO;
        }
    }

    public static int naviosRestantes(char[][] tabuleiro) {
        int count = 0;
        for (int i = 0; i < tabuleiro.length; i++) {
            for (int j = 0; j < tabuleiro[i].length; j++) {
                if (tabuleiro[i][j] == EMBARCACAO) {
                    count++;
                }
            }
        }
        return count;
    }
}
