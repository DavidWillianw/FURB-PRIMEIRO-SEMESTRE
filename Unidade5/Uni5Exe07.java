package Unidade5;

import java.util.Scanner;

public class Uni5Exe07 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite o valor de N: ");
        int n = scan.nextInt();

        int maiorNumero = Integer.MIN_VALUE;
        int menorNumero = Integer.MAX_VALUE;

scan.close();
        for (int i = 0; i < n; i++) {
            System.out.print("Digite o número: ");
            int num = scan.nextInt();

            if (num > maiorNumero) {
                maiorNumero = num;
            }
            if (num < menorNumero) {
                menorNumero = num;
            }

            scan.close();
        }

        System.out.println("O menor número é: " + menorNumero);
        System.out.println("O maior numero é: " + maiorNumero);


        }


    }
    
