package Unidade5;

import java.util.Scanner;

public class Uni5Exe29 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] notas = {20, 10, 5, 2, 1};

        System.out.print("Digite o valor a ser sacado: ");
        int valor = scanner.nextInt();

        System.out.println("Quantidade mínima de cédulas:");
        for (int nota : notas) {
            int qtdNotas = valor / nota;
            if (qtdNotas > 0) {
                System.out.printf("%d cédulas de R$ %d%n", qtdNotas, nota);
                valor %= nota;
            }
        }

        scanner.close();
    }
}
