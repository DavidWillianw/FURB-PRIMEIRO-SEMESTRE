package Unidade4;

import java.util.Scanner;

public class Uni4Exe26 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha uma opção:");
        System.out.println("T: calcular a área de um triângulo de base b e altura h");
        System.out.println("Q: calcular a área de um quadrado de lado l");
        System.out.println("R: calcular a área de um retângulo de base b e altura h");
        System.out.println("C: calcular a área de um círculo de raio r");

        char opcao = scanner.next().charAt(0);

        switch (opcao) {
            case 'T':
                System.out.println("Digite a base e a altura do triângulo: ");
                double base = scanner.nextDouble();
                double altura = scanner.nextDouble();
                double areaTriangulo = (base * altura) / 2;
                System.out.println("Área do triângulo: " + areaTriangulo);
                break;
            case 'Q':
                System.out.println("Digite o lado: ");
                double lado = scanner.nextDouble();
                double areaQuadrado = lado * lado;
                System.out.println("Área do quadrado: " + areaQuadrado);
                break;
            case 'R':
                System.out.println("Digite a base e a altura do retângulo: ");
                double baseRetangulo = scanner.nextDouble();
                double alturaRetangulo = scanner.nextDouble();
                double areaRetangulo = baseRetangulo * alturaRetangulo;
                System.out.println("Área do retângulo: " + areaRetangulo);
                break;
            case 'C':
                System.out.println("Digite o raio: ");
                double raio = scanner.nextDouble();
                double areaCirculo = Math.PI * Math.pow(raio, 2);
                System.out.println("Área do círculo: " + areaCirculo);
                break;
            default:
                System.out.println("Opção inválida.");
        }
        scanner.close();
    }
}