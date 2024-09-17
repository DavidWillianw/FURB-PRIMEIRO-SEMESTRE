package Unidade5;
import java.util.Scanner;

public class Uni5Exe12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número inteiro positivo: ");
        int n = scanner.nextInt();
        scanner.close();

        int count = 1;
        int num = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= count; j++) {
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
            count++;
        }
    }
}
