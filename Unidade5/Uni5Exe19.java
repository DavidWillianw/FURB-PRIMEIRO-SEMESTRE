package Unidade5;

import java.util.Scanner;

public class Uni5Exe19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double totalRecebido = 0;

        while (true) {
            System.out.print("Digite o valor da compra (ou 0 para encerrar): ");
            double valorCompra = scanner.nextDouble();
            if (valorCompra == 0) {
                break;
            }

            double desconto = (valorCompra > 500) ? 0.20 : 0.15;
            double valorAPagar = valorCompra * (1 - desconto);
            System.out.printf("Valor a pagar: %.2f%n", valorAPagar);

            totalRecebido += valorAPagar;
        }

        System.out.printf("Total recebido pela loja: %.2f%n", totalRecebido);

        scanner.close();
    }
}
