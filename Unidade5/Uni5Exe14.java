package Unidade5;

import java.util.Scanner;

public class Uni5Exe14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double lucroMenor10 = 0;
        double lucroEntre10e20 = 0;
        double lucroMaior20 = 0;
        double valorTotalCompra = 0;
        double valorTotalVenda = 0;
        
        for (int i = 1; i <= 20; i++) {
            System.out.println("Mercadoria " + i);
            System.out.print("Nome: ");
            String nome = scanner.next();
            
            System.out.print("Preço de compra: ");
            double precoCompra = scanner.nextDouble();
            valorTotalCompra += precoCompra;
            
            System.out.print("Preço de venda: ");
            double precoVenda = scanner.nextDouble();
            valorTotalVenda += precoVenda;
            
            double lucroPercentual = ((precoVenda - precoCompra) / precoCompra) * 100;
            
            if (lucroPercentual < 10) {
                lucroMenor10++;
            } else if (lucroPercentual >= 10 && lucroPercentual <= 20) {
                lucroEntre10e20++;
            } else {
                lucroMaior20++;
            }
        }
        
        System.out.println("Mercadorias com lucro menor que 10%: " + lucroMenor10);
        System.out.println("Mercadorias com lucro entre 10% e 20%: " + lucroEntre10e20);
        System.out.println("Mercadorias com lucro maior que 20%: " + lucroMaior20);
        
        double lucroTotal = valorTotalVenda - valorTotalCompra;
        System.out.println("Valor total de compra: " + valorTotalCompra);
        System.out.println("Valor total de venda: " + valorTotalVenda);
        System.out.println("Lucro total: " + lucroTotal);
        
        scanner.close();
    }
}

