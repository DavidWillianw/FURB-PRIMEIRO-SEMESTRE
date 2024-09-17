package Unidade4;

import java.util.Scanner;

public class Uni4Exe21 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a massa do indivíduo (em kg): ");
        double massa = scanner.nextDouble();

        System.out.print("Digite a altura do indivíduo (em metros): ");
        double altura = scanner.nextDouble();

        double imc = massa / Math.pow(altura, 2);

        String classificacao;
        if (imc < 18.5) {
            classificacao = "Magreza";
        } else if (imc >= 18.5 && imc <= 24.9) {
            classificacao = "Saudável";
        } else if (imc >= 25.0 && imc <= 29.9) {
            classificacao = "Sobrepeso";
        } else if (imc >= 30.0 && imc <= 34.9) {
            classificacao = "Obesidade Grau I";
        } else if (imc >= 35.0 && imc <= 39.9) {
            classificacao = "Obesidade Grau II (severa)";
        } else {
            classificacao = "Obesidade Grau III (mórbida)";
        }

        System.out.printf("IMC: %.2f%n", imc);
        System.out.println("Classificação: " + classificacao);

        scanner.close();
    }
}