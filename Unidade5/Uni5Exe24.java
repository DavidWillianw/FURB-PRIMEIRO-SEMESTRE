package Unidade5;

import java.util.Scanner;

public class Uni5Exe24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o limite diário de pesca (em kg): ");
        double limiteDiario = scanner.nextDouble() * 1000; 
        double pesoTotal = 0;
        char continuar;

        do {
            System.out.print("Digite o peso do peixe (em gramas): ");
            double pesoPeixe = scanner.nextDouble();

            pesoTotal += pesoPeixe;

            if (pesoTotal > limiteDiario) {
                System.out.println("Limite diário de pesca excedido.");
                break;
            }

            System.out.printf("Peso total da pesca até agora: %.2f gramas%n", pesoTotal);

            System.out.print("Deseja informar o peso de mais um peixe: s (SIM) / n (NÃO)? ");
            continuar = scanner.next().charAt(0);
        } while (continuar == 's' || continuar == 'S');

        scanner.close();
    }
}
