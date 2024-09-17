package Unidade4;

import java.util.Scanner;

public class Uni4Exe04 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Entre com um número de ponto flutuante maior do que 0: ");
        double num = teclado.nextDouble();
        teclado.close();
        
        if (num % 1 == 0) {
            System.out.println("Não foram digitadas casas decimais no número");
        } else {
            System.out.println("Foram digitadas casas decimais no número");
        }
    }
}