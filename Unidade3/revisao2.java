import java.util.Scanner;

public class revisao2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        
        int num1;

        System.out.println("Escreva o primeiro número: ");
        num1 = scan.nextInt();

        scan.close();

        if(num1 > 4){
            System.out.println("Não pode número maior que 4");
            return;
        }
        else if (num1 < 1){
            System.out.println("Não pode número menor que 1");
        }

        switch (num1) {

            case 1:
            System.out.println("Um");
            break;
            case 2:
            System.out.println("Dois");
            break;
            case 3:
            System.out.println("Três");
            break;
            case 4:
            System.out.println("Quatro");
            break;



        }

    }
}
