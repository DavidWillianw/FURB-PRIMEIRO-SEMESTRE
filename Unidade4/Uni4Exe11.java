package Unidade4;

import java.util.Scanner;

public class Uni4Exe11 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o ano de nascimento do primeiro irmão: ");
        int anoNascimento1 = scanner.nextInt();

        System.out.print("Informe o ano de nascimento do segundo irmão: ");
        int anoNascimento2 = scanner.nextInt();

        System.out.print("Informe o ano de nascimento do terceiro irmão: ");
        int anoNascimento3 = scanner.nextInt();

        if (anoNascimento1 == anoNascimento2 && anoNascimento2 == anoNascimento3) {
            System.out.println("Eles são TRIGÊMEOS");
        } else if (anoNascimento1 == anoNascimento2 || anoNascimento2 == anoNascimento3 || anoNascimento1 == anoNascimento3) {
            System.out.println("Eles são GÊMEOS");
        } else {
            System.out.println("Eles são APENAS IRMÃOS");
        }

        scanner.close();
    }
}