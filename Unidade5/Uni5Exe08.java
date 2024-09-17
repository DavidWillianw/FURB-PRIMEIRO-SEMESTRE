package Unidade5;

import java.util.Scanner;

public class Uni5Exe08 {


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite o valor de N: ");
        int n = scan.nextInt();

        int menorNumero = Integer.MIN_VALUE;
        int soma = 0;
        int contadorPositivos= 0;
        
        for (int i = 0; i < n; i++) {
            System.out.print("Digite o número: ");
            int num = scan.nextInt();

            if (num % 2 == 0) {
                soma += num;
                contadorPositivos++;       
                        } 
            if (num < 0 && num < menorNumero) {
                menorNumero = num; {
            
        }
    }
        }
        double media = soma/contadorPositivos;

        System.out.println("A média dos numeros positivos: " + media);
        System.out.println("O menor número negativo: " + menorNumero);

        scan.close();

        
}}