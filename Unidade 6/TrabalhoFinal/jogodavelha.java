package TrabalhoFinal;

import java.util.Random;
import java.util.Scanner;

public class jogodavelha {

    public static void main(String[] args) {
        char[][] tabuleiro = new char[8][8];
        inicializarTabuleiro(tabuleiro);
        jogar(tabuleiro);
    }

    // Método para inicializar o tabuleiro
    public static void inicializarTabuleiro(char[][] tabuleiro) {
        for (int i = 0; i < tabuleiro.length; i++) {
            for (int j = 0; j < tabuleiro[i].length; j++) {
                tabuleiro[i][j] = '~';
            }
        }
    }

    // Método para exibir o tabuleiro
    public static void exibirTabuleiro(char[][] tabuleiro) {
        for (int i = 0; i < tabuleiro.length; i++) {
            for (int j = 0; j < tabuleiro[i].length; j++) {
                System.out.print(tabuleiro[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Método para verificar se há um vencedor
    public static boolean verificarVencedor(char[][] tabuleiro, char jogador) {
        // Verifica linhas
        for (int i = 0; i < 8; i++) {
            if (tabuleiro[i][0] == jogador && tabuleiro[i][1] == jogador && tabuleiro[i][2] == jogador) {
                return true;
            }
        }
        // Verifica colunas
        for (int j = 0; j < 8; j++) {
            if (tabuleiro[0][j] == jogador && tabuleiro[1][j] == jogador && tabuleiro[2][j] == jogador) {
                return true;
            }
        }
        // Verifica diagonais
        if (tabuleiro[0][0] == jogador && tabuleiro[1][1] == jogador && tabuleiro[2][2] == jogador) {
            return true;
        }
        if (tabuleiro[0][2] == jogador && tabuleiro[1][1] == jogador && tabuleiro[2][0] == jogador) {
            return true;
        }
        return false;
    }

    // Método para verificar se o tabuleiro está cheio
    public static boolean verificarEmpate(char[][] tabuleiro) {
        for (int i = 0; i < tabuleiro.length; i++) {
            for (int j = 0; j < tabuleiro[i].length; j++) {
                if (tabuleiro[i][j] == '~') {
                    return false;
                }
            }
        }
        return true;
    }

    // Método principal do jogo
    public static void jogar(char[][] tabuleiro) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        char jogadorAtual = 'X';
        boolean jogoEmAndamento = true;

        while (jogoEmAndamento) {
            exibirTabuleiro(tabuleiro);
            System.out.println("Jogador " + jogadorAtual + ", é a sua vez!");
            int linha = random.nextInt(8);
            int coluna = random.nextInt(8);

            if (jogadorAtual == 'X') {
                // Jogada do jogador
                System.out.print("Escolha a linha (0-8): ");
                linha = scanner.nextInt();
                System.out.print("Escolha a coluna (0-8): ");
                coluna = scanner.nextInt();
            } else {
                // Jogada do computador
                linha = random.nextInt(8);
                coluna = random.nextInt(8);
                System.out.println("Computador escolheu linha " + linha + " e coluna " + coluna);
            }

        //     if (linha >= 0 && linha < 8 && coluna >= 0 && coluna < 8 && tabuleiro[linha][coluna] == '-') {
        //         tabuleiro[linha][coluna] = jogadorAtual;
        //         if (verificarVencedor(tabuleiro, jogadorAtual)) {
        //             exibirTabuleiro(tabuleiro);
        //             System.out.println("Jogador " + jogadorAtual + " venceu!");
        //             jogoEmAndamento = false;
        //         } else if (verificarEmpate(tabuleiro)) {
        //             exibirTabuleiro(tabuleiro);
        //             System.out.println("O jogo empatou!");
        //             jogoEmAndamento = false;
        //         } else {
        //             jogadorAtual = (jogadorAtual == 'X') ? 'O' : 'X';
        //         }
        //     } else {
        //         System.out.println("Movimento inválido. Tente novamente.");
        //     }
        // }

        if (linha >= 0 && linha < 8 && coluna >= 0 && coluna < 8 && tabuleiro[linha][coluna] == '-') {
            tabuleiro[linha][coluna] = jogadorAtual;
            if (verificarVencedor(tabuleiro, jogadorAtual)) {
                exibirTabuleiro(tabuleiro);
                System.out.println("Jogador " + jogadorAtual + " venceu!");
                jogoEmAndamento = false;
            } else if (verificarEmpate(tabuleiro)) {
                exibirTabuleiro(tabuleiro);
                System.out.println("O jogo empatou!");
                jogoEmAndamento = false;
            } else {
                jogadorAtual = (jogadorAtual == 'X') ? 'O' : 'X';
            }
        } else {
            System.out.println("Movimento inválido. Tente novamente.");
        }
    }


        scanner.close();
    }
}
    

