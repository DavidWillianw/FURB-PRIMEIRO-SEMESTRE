package Unidade5;

import java.util.Scanner;

public class Uni5Exe20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a massa inicial em kg: ");
        double massaInicial = scanner.nextDouble();
        double massaFinal = massaInicial * 1000;  
        int tempo = 0;

        while (massaFinal >= 0.5) {
            massaFinal /= 2;
            tempo += 50;
        }

        System.out.printf("Massa inicial: %.2f kg%n", massaInicial);
        System.out.printf("Massa final: %.2f g%n", massaFinal);
        System.out.printf("Tempo necessário: %d segundos%n", tempo);

        scanner.close();
    }
}
