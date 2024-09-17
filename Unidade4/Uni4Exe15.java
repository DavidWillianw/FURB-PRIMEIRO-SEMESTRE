package Unidade4;

import java.util.Scanner;

public class Uni4Exe15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a quantidade de meses que o funcionário foi admitido: ");
        int months = scanner.nextInt();
        scanner.close();

        double reajuste = 0;

        if (months < 12) {
            reajuste = 0.05;
        } else if (months >= 13 && months <= 48) {
            reajuste = 0.07;
        }

        System.out.println("O valor de reajuste que o funcionário receberá é de " + reajuste * 100 + "%");
    }
}