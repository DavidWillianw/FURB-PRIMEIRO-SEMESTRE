package Unidade5;

import java.util.Scanner;

public class Uni5Exe31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número inteiro positivo: ");
        int numero = sc.nextInt();
        
        System.out.println("número | decomposição");
        
        int divisor = 2;
        while (numero != 1) {
            if (numero % divisor == 0) {
                System.out.println(numero + " | " + divisor);
                numero = numero / divisor;
            } else {
                divisor++;
            }
        }
        
        System.out.println(numero + " |");
        
        sc.close();
    }
}
