package Unidade5;

import java.util.Scanner;

public class Uni5Exe01 {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            
            int numero; 

            for (int i = 0; i < 20; i++) {
                System.out.print("Digite um número inteiro: ");
                numero = scanner.nextInt();
                
                if (numero % 2 == 0) {
                    System.out.println("O número " + numero + " é par.");
                } else {
                    System.out.println("O número " + numero + " é ímpar.");
                }
            }
            
            scanner.close();
        }
    }
    
