package Unidade4;

import java.util.Scanner;

public class Uni4Exe05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("A cor é azul? (Digite 'true' ou 'false'): ");
        boolean resposta = scanner.nextBoolean();
        scanner.close();

        if (resposta) {
            System.out.println("Sim");
        } else {
            System.out.println("Não");
        }
    }
}