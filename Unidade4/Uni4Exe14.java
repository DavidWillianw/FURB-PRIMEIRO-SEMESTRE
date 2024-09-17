package Unidade4;

import java.util.Scanner;

class Uni4Exe14 {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o dia: ");
        int dia = scanner.nextInt();

        System.out.print("Digite o mês: ");
        int mes = scanner.nextInt();

        System.out.print("Digite o ano: ");
        int ano = scanner.nextInt();
        scanner.close();

        if (dia <= 0 || dia > 32 || mes <= 0 || mes > 13 || ano <= 0) {
            System.out.println("Data inválida.");
            return;
        }

        if (mes == 2) {
            if (dia > 29) {
                System.out.println("Data inválida.");
                return;
            } else if (dia == 29 && ((ano % 4 != 0) || (ano % 100 == 0 && ano % 400 != 0))) {
                System.out.println("Data inválida.");
                return;
            }
        } else {
            if ((mes == 4 || mes == 6 || mes == 9 || mes == 11) && dia > 30) {
                System.out.println("Data inválida.");
                return;
            }
        }

        System.out.println("Data válida.");
    }
}