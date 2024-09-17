package Unidade4;

import java.util.Scanner;

class Uni4Exe24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entre com o valor 1: ");
        int valor1 = scanner.nextInt();

        System.out.print("Entre com o valor 2: ");
        int valor2 = scanner.nextInt();

        System.out.print("Entre com o valor 3: ");
        int valor3 = scanner.nextInt();

        System.out.print("Escolha uma opção: ");
        System.out.println("1 - Ordem crescente");
        System.out.println("2 - Ordem decrescente");
        System.out.println("3 - Maior valor no meio");
        int opcao = scanner.nextInt();

        switch (opcao) {
            case 1:
                int menor = Math.min(valor1, Math.min(valor2, valor3));
                int medio = (valor1 + valor2 + valor3) - menor - Math.max(valor1, Math.max(valor2, valor3));
                int maior = Math.max(valor1, Math.max(valor2, valor3));

                System.out.println(menor + " " + medio + " " + maior);
                break;
            case 2:
                maior = Math.max(valor1, Math.max(valor2, valor3));
                medio = (valor1 + valor2 + valor3) - maior - Math.min(valor1, Math.min(valor2, valor3));
                menor = Math.min(valor1, Math.min(valor2, valor3));

                System.out.println(maior + " " + medio + " " + menor);
                break;
            case 3:
                maior = Math.max(valor1, Math.max(valor2, valor3));
                int menor1 = Math.min(valor1, valor2);
                int menor2 = (valor1 + valor2 + valor3) - maior - menor1;

                System.out.println(menor1 + " " + maior + " " + menor2);
                break;
            default:
                System.out.println("Opção inválida");
        }

        scanner.close();
    }
}