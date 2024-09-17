package Unidade5;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Uni5Exe06 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");
            
            double soma = 0;
            
            

            for (int i = 0; i < 20; i++) {
                System.out.print("Digite a altura: ");
                double alt = scanner.nextDouble();
                 soma += alt; // Isso adiciona o numero para a soma, ou seja, todo valor adicionado em alt vai ser somado no +=

            }

            System.out.println("A média das alturas das 20 pessoas é: " + df.format(soma/20));

            
            scanner.close();
        }
    
}
