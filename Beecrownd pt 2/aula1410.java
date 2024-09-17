import java.util.Scanner;

public class aula1410 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Escreva o número do eixo X");
        double x = scan.nextDouble();
        
        System.out.println("Escreva o número do eixo Y");
        double y = scan.nextDouble();

        if (x == 0) {
            if (y == 0) {
                System.out.println("Origem");
            }
            if (y != 0) {
                System.out.println("Eixo Y");
            }
        }
        if (y == 0) {
            if (x != 0) {
                System.out.println("Eixo X");
            }
        }
        if (x > 0) {
            if (y > 0) {
                System.out.println("Q1");
            }
            if (y < 0) {
                System.out.println("Q4");
            }
        }
        if (x < 0) {
            if (y > 0) {
                System.out.println("Q2");
            }
            if (y < 0) {
                System.out.println("Q3");
            }
        }
            
            scan.close();
        }
    }


