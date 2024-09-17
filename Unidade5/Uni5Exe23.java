package Unidade5;

import java.util.Scanner;

public class Uni5Exe23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char continuar;

        do {
            System.out.print("Digite o nome do vendedor: ");
            String nome = scanner.nextLine();

            System.out.print("Digite o número de produtos vendidos: ");
            int numProdutos = scanner.nextInt();

            double totalVendas = 0;

            for (int i = 0; i < numProdutos; i++) {
                System.out.print("Digite o preço unitário do produto: ");
                double precoUnitario = scanner.nextDouble();

                System.out.print("Digite a quantidade vendida: ");
                int quantidade = scanner.nextInt();

                totalVendas += precoUnitario * quantidade;
            }

            double salario = totalVendas * 0.30;

            System.out.printf("Nome: %s, Total de vendas: R$%.2f, Salário: R$%.2f%n", nome, totalVendas, salario);

            System.out.print("Deseja digitar os dados de mais um vendedor: s (SIM) / n (NÃO)? ");
            continuar = scanner.next().charAt(0);
            scanner.nextLine(); 

        } while (continuar == 's' || continuar == 'S');

        scanner.close();
    }
}
