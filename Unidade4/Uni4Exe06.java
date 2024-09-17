package Unidade4;

import java.util.Scanner;

public class Uni4Exe06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um caractere (M, F ou I): ");
        char caractere = scanner.next().toUpperCase().charAt(0);
        scanner.close();

        switch (caractere) {
            case 'M':
                System.out.println("Masculino");
                break;
            case 'F':
                System.out.println("Feminino");
                break;
            case 'I':
                System.out.println("Não Informado");
                break;
            default:
                System.out.println("Entrada Incorreta");
        }
    }
}
