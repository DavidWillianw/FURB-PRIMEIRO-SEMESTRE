package Unidade4;

import java.util.Scanner;

public class Uni4Exe03 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Entre com o primeiro número inteiro: ");
        int num1 = teclado.nextInt();

        System.out.print("Entre com o segundo número inteiro: ");
        int num2 = teclado.nextInt();
        teclado.close();

        if (num1 > num2) {
            System.out.println("O maior valor é: " + num1);
        } else if (num2 > num1) {
            System.out.println("O maior valor é: " + num2);
        } else {
            System.out.println("Os números são iguais");
        }
    }
}