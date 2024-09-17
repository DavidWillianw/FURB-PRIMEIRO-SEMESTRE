package Unidade5;

import java.util.Scanner;

public class Uni5Exe18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] audiencias = new int[5];
        int totalPessoas = 0;

        while (true) {
            System.out.print("Digite o número do canal (ou 0 para encerrar): ");
            int canal = scanner.nextInt();
            if (canal == 0) {
                break;
            }

            System.out.print("Digite o número de pessoas assistindo: ");
            int pessoas = scanner.nextInt();

            if (canal == 4) {
                audiencias[0] += pessoas;
            } else if (canal == 5) {
                audiencias[1] += pessoas;
            } else if (canal == 9) {
                audiencias[2] += pessoas;
            } else if (canal == 12) {
                audiencias[3] += pessoas;
            }
            totalPessoas += pessoas;
        }

        for (int i = 0; i < 4; i++) {
            double percentual = (totalPessoas > 0) ? (audiencias[i] * 100.0 / totalPessoas) : 0;
            System.out.printf("Canal %d: %.2f%%%n", (i == 0 ? 4 : i == 1 ? 5 : i == 2 ? 9 : 12), percentual);
        }

        scanner.close();
    }
}
