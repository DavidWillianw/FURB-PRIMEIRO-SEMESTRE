package Unidade4;

import java.util.Scanner;

public class Uni4Exe07 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entre com peso da carta: ");
        double peso = scanner.nextDouble();
        scanner.close();
        
        double valorPagar = 0;

        if (peso <= 50) {
            valorPagar = 0.45;
        } else {
            double pesoExcedido = peso - 50;
            int qtAdicional = (int) Math.ceil(pesoExcedido / 20);
            valorPagar = 0.45 + 0.45 * qtAdicional;
        }

        System.out.println("Custo do selo: " + valorPagar);
    }
}