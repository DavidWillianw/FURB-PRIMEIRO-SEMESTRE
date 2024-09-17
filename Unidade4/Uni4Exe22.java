package Unidade4;

import java.util.Scanner;

public class Uni4Exe22 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a opção do curso (1 - Ciência da Computação, 2 - Licenciatura da Computação, 3 - Sistemas de Informação): ");
        int opcao = scanner.nextInt();

        String titulacao;
        switch (opcao) {
            case 1:
                titulacao = "Bacharel em Ciência da Computação";
                break;
            case 2:
                titulacao = "Licenciado em Computação";
                break;
            case 3:
                titulacao = "Bacharel em Sistemas de Informação";
                break;
            default:
                titulacao = "Opção inválida";
        }

        System.out.println("Você vai receber o título de: " + titulacao);

        scanner.close();
    }
}