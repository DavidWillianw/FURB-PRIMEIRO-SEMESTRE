package Unidade5;

import java.util.Scanner;

public class Uni5Exe30 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Reading inputs
        System.out.print("Digite o valor de N: ");
        int N = scanner.nextInt();
        System.out.print("Digite o valor de K: ");
        int K = scanner.nextInt();
        System.out.print("Digite o tamanho da mochila (M): ");
        int M = scanner.nextInt();

        int somaNaMochila = 0;
        int somaForaMochila = 0;
        StringBuilder elementos = new StringBuilder();
        StringBuilder naMochila = new StringBuilder();
        StringBuilder foraMochila = new StringBuilder();

        for (int i = N; i > 0; i -= K) {
            elementos.append(i).append(" ");
            if (somaNaMochila + i <= M) {
                naMochila.append(i).append(" ");
                somaNaMochila += i;
            } else {
                foraMochila.append(i).append(" ");
                somaForaMochila += i;
            }
        }

        System.out.println("Elementos a serem colocados na mochila: " + elementos.toString().trim());
        System.out.println("Elementos que entraram na mochila: " + naMochila.toString().trim());
        System.out.println("Elementos que ficaram fora da mochila: " + foraMochila.toString().trim());
        System.out.println("Soma dos elementos que entraram na mochila: " + somaNaMochila);
        System.out.println("Soma dos elementos que não entraram na mochila: " + somaForaMochila);

        scanner.close();
    }
}
