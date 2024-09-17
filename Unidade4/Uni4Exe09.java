package Unidade4;

import java.util.Scanner;

public class Uni4Exe09 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o primeiro valor: ");
        int valor1 = scanner.nextInt();

        System.out.print("Informe o segundo valor: ");
        int valor2 = scanner.nextInt();

        if (valor1 % valor2 == 0 || valor2 % valor1 == 0) {
            System.out.println("Os valores são múltiplos");
        } else {
            System.out.println("Os valores não são múltiplos");
        }

        scanner.close();
    }
}