package Unidade5;

// import java.util.Scanner;

public class Uni5Exe02 {
    
    public static void main(String[] args) {
        // Scanner scanner = new Scanner(System.in);

        // int numero;
        int somaImpares= 0, somaPares = 0;


        
        for (int i = 0; i <= 100; i++) {
            // System.out.print("Digite o primeiro número inteiro: ");
            // numero = scanner.nextInt();
            // System.out.print("Digite o segundo número inteiro: ");
            // // int numero2 = scanner.nextInt();
            if (i % 2 == 0) {
                // System.out.println("O número " + numero + " é par.");
                somaPares += i;
                
            } 
            else {
                // System.out.println("O número " + numero + " é ímpar.");
                somaImpares += i;
            }

            // if (numero2 % 2 == 0) {
            //     System.out.println("O número " + numero2 + " é par.");
            // } 
            // else {
            //     System.out.println("O número " + numero2 + " é ímpar.");
            // }
            // System.out.println("A soma dos números é: " + (numero+numero2) );
            System.out.println("A soma dos pares é: " + somaPares);
            System.out.println("A soma dos impares é: " + somaImpares);
        }

        


        // scanner.close();
    }
}


