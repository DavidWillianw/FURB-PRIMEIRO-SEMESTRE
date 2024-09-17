package Unidade4;

import java.util.Scanner;

public class Uni4Exe02 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Entre com um valor inteiro maior do que 0: ");
        int valor = teclado.nextInt();
        teclado.close();

        if (valor % 2 == 0) {
            System.out.println("Número é par");
        } else {
            System.out.println("Número é impar");
        }
    }
}
