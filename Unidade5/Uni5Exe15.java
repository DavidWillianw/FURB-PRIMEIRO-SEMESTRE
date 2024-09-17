package Unidade5;

import java.util.Scanner;

public class Uni5Exe15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Digite o nome do aluno (ou 'fim' para encerrar): ");
            String nome = scanner.nextLine();

            if (nome.equalsIgnoreCase("fim")) {
                break;
            }

            System.out.print("Digite a nota da primeira prova: ");
            double nota1 = scanner.nextDouble();

            System.out.print("Digite a nota da segunda prova: ");
            double nota2 = scanner.nextDouble();

            scanner.nextLine();

            double media = (nota1 + nota2) / 2.0;
            System.out.printf("A média de %s é %.2f%n", nome, media);
        }

        scanner.close();
    }
}
