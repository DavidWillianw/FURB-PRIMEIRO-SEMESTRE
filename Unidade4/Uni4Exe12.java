package Unidade4;

import java.util.Scanner;

public class Uni4Exe12 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o comprimento do lado 1: ");
        double lado1 = scanner.nextDouble();

        System.out.print("Informe o comprimento do lado 2: ");
        double lado2 = scanner.nextDouble();

        System.out.print("Informe o comprimento do lado 3: ");
        double lado3 = scanner.nextDouble();

        if (lado1 < lado2 + lado3 && lado2 < lado1 + lado3 && lado3 < lado1 + lado2) {
            if (lado1 == lado2 && lado2 == lado3) {
                System.out.println("Triângulo equilátero");
            } else if (lado1 == lado2 || lado2 == lado3 || lado1 == lado3) {
                System.out.println("Triângulo isósceles");
            } else {
                System.out.println("Triângulo escaleno");
            }
        } else {
            System.out.println("Os lados não formam um triângulo");
        }

        scanner.close();
    }
}