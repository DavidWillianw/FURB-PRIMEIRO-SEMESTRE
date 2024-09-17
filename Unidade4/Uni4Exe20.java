package Unidade4;

import java.util.Scanner;

public class Uni4Exe20 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a nota da prova 1: ");
        double notaProva1 = scanner.nextDouble();

        System.out.print("Digite a nota da prova 2: ");
        double notaProva2 = scanner.nextDouble();

        System.out.print("Digite a nota da prova 3: ");
        double notaProva3 = scanner.nextDouble();

        System.out.print("Digite a nota dos exercícios: ");
        double notaExercicios = scanner.nextDouble();

        double media = (notaProva1 + notaProva2 + notaProva3 + notaExercicios) / 7;

        String conceito;
        if (media >= 9.0) {
            conceito = "A";
        } else if (media >= 7.5 && media < 9.0) {
            conceito = "B";
        } else if (media >= 6.0 && media < 7.5) {
            conceito = "C";
        } else if (media >= 4.0 && media < 6.0) {
            conceito = "D";
        } else {
            conceito = "E";
        }

        String resultado;
        if (conceito.equals("A") || conceito.equals("B") || conceito.equals("C")) {
            resultado = "aprovado";
        } else {
            resultado = "reprovado";
        }

        System.out.printf("Média de aproveitamento: %.2f%n", media);
        System.out.println("Conceito: " + conceito);
        System.out.println("Resultado: " + resultado);

        scanner.close();
    }
}