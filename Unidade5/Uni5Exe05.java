package Unidade5;

import java.util.Scanner;

public class Uni5Exe05 {
    public static void main(String[] args) {

        int n;
        int valor = 8;

        Scanner scan = new Scanner(System.in);

            System.out.println("Digite a quantidade de elementos desejada: ");
            n = scan.nextInt();
        if(n<=2) {
            System.out.println("O número deve ser superior a 2");
        }
        else{
            for(int i =1; i <= n; i++){
                System.out.println(valor);
                i++;
                if(i<=n)
                System.out.println(valor + 2);
                valor *=2;
            }
        }
scan.close();

    }
}
