package Unidade4;

import java.util.Scanner;

class Uni4Exe25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha uma opção:");
        System.out.println("1 - Soma de dois números.");
        System.out.println("2 - Diferença entre dois números.");
        System.out.println("3 - Produto entre dois números.");
        System.out.println("4 - Divisão entre dois números.");
        int opcao = scanner.nextInt();

        switch (opcao) {
            case 1:
                System.out.print("Entre com o número 1: ");
                int num1 = scanner.nextInt();

                System.out.print("Entre com o número 2: ");
                int num2 = scanner.nextInt();

                System.out.println("A soma é: " + (num1 + num2));
                break;
            case 2:
                System.out.print("Entre com o número 1: ");
                num1 = scanner.nextInt();

                System.out.print("Entre com o número 2: ");
                num2 = scanner.nextInt();

                System.out.println("A diferença é: " + (num1 - num2));
                break;
            case 3:
                System.out.print("Entre com o número 1: ");
                num1 = scanner.nextInt();

                System.out.print("Entre com o número 2: ");
                num2 = scanner.nextInt();

                System.out.println("O produto é: " + (num1 * num2));
                break;
            case 4:
                System.out.print("Entre com o número 1: ");
                num1 = scanner.nextInt();

                System.out.print("Entre com o número 2: ");
                num2 = scanner.nextInt();

                if (num2 != 0) {
                    System.out.println("A divisão é: " + (num1 / num2));
                } else {
                    System.out.println("Erro: divisão por zero");
                }
                break;
            default:
                System.out.println("Opção inválida");
        }

        scanner.close();
    }
}