package Unidade4;

import java.util.Scanner;

public class Uni4Exe16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a idade do 1º homem: ");
        int homme1 = scanner.nextInt();

        System.out.print("Digite a idade do 2º homem: ");
        int homme2 = scanner.nextInt();

        System.out.print("Digite a idade da 1ª mulher: ");
        int femme1 = scanner.nextInt();

        System.out.print("Digite a idade da 2ª mulher: ");
        int femme2 = scanner.nextInt();
        scanner.close();
        int hommeMaisVelho = Math.max(homme1, homme2);
        int femmeMaisNova = Math.min(femme1, femme2);

        int hommeMaisNovo = Math.min(homme1, homme2);
        int femmeMaisVelha = Math.max(femme1, femme2);

        int soma = hommeMaisVelho + femmeMaisNova;
        int produto = hommeMaisNovo * femmeMaisVelha;

        System.out.println("A soma das idades do homem mais velho com a mulher mais nova é " + soma);
        System.out.println("O produto das idades do homem mais novo com a mulher mais velha é " + produto);
    }
}