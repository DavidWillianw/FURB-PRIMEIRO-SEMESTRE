package Unidade4;

import java.util.Scanner;

public class Uni4Exe08 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe a letra: ");
        char letra = scanner.next().charAt(0);

        if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
            System.out.println("É vogal");
        } else {
            System.out.println("NÃO é vogal");
        }

        scanner.close();
    }
}