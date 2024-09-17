package Unidade4;

import java.util.Scanner;

public class Uni4Exe18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o dia do vencimento: ");
        int diaVencimento = scanner.nextInt();

        System.out.print("Digite o dia do pagamento: ");
        int diaPagamento = scanner.nextInt();

        System.out.print("Digite o valor da prestação: ");
        double valorPrestacao = scanner.nextDouble();
        scanner.close();

        double valorAPagar = valorPrestacao;

        if (diaPagamento <= diaVencimento) {
            valorAPagar *= 0.90;
            System.out.println("Pagamento em dia! Você ganhou 10% de desconto.");
        } else if (diaPagamento <= diaVencimento + 5) {
            System.out.println("Pagamento realizado até 5 dias após o vencimento.");
        } else {
            int diasAtraso = diaPagamento - diaVencimento - 5;
            valorAPagar += valorPrestacao * 0.02 * diasAtraso;
            System.out.println("Pagamento atrasado em " + diasAtraso + " dias. Você foi multado em " + valorPrestacao * 0.02 * diasAtraso + " reais.");
        }

        System.out.println("O valor a ser pago é de R$ " + valorAPagar);
    }
}