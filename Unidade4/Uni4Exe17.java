package Unidade4;

import java.util.Scanner;

public class Uni4Exe17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a renda anual: ");
        double rendaAnual = scanner.nextDouble();

        System.out.print("Digite o número de dependentes: ");
        int dependentes = scanner.nextInt();
        scanner.close();

        double rendaLiquida = rendaAnual - (rendaAnual * 0.02 * dependentes);

        double imposto = 0;

        if (rendaLiquida <= 2000) {
            imposto = 0;
        } else if (rendaLiquida > 2000 && rendaLiquida <= 5000) {
            imposto = rendaLiquida * 0.05;
        } else if (rendaLiquida > 5000 && rendaLiquida <= 10000) {
            imposto = rendaLiquida * 0.10;
        } else {
            imposto = rendaLiquida * 0.15;
        }

        System.out.println("O imposto de renda a ser pago é de R$ " + imposto);
    }
}