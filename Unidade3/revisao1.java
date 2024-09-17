import java.text.DecimalFormat;
import java.util.Scanner;

public class revisao1 {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");


        String quarto;
        int pessoa;
        int diaria;

        System.out.println("Tipos de quartos");
        System.out.println("1 - Single");
        System.out.println("2 - Double");
        System.out.println("3 - Triple");
        System.out.println("4 - Master");


        System.out.print("Digite o tipo do quarto: ");
        quarto = scan.nextLine().toLowerCase();

        System.out.print("Digite a quantidade de dias: ");
        int dias = scan.nextInt();
        scan.close();

        // switch (dias) {
        //     case 0:
        //         System.out.println("Dia não aceito");
        //         break;
        // default:
        // if (dias >= 0) {
        //     System.out.println("Dia aceito");
        // }

        if (dias == 0) {
            System.out.println("Ei! O número da diaria é inferior a um, corrija! ");
            return;
        }

        if (quarto.equals("single" ) || quarto.equals("1") || quarto.equals("1 - single") || quarto.equals("1 single")) {

            diaria = 120;
            pessoa = 1;

        }

        else if (quarto.equals("double") || quarto.equals("2")|| quarto.equals("2 - double") || quarto.equals("2 double")) {

            diaria = 180;
            pessoa = 2;

        }
        else if (quarto.equals("triple") || quarto.equals("3")|| quarto.equals("3 - triple") || quarto.equals("3 triple")) {

            diaria = 250;
            pessoa = 3;

        }
        else if (quarto.equals("master") || quarto.equals("4")|| quarto.equals("4 - master") || quarto.equals("4 master")) {

            diaria = 320;
            pessoa = 4;

        }

        else {

            System.out.println("Tipo de quarto não aceito");

            return;

        }


    int valorAnt = diaria * dias;
    double taxa = 0.12*valorAnt;

    System.out.println("O Valor do quarto para " + pessoa + (" é de uma diaria de R$") + diaria);
    System.out.println("O Valor da taxa é de : R$" + df.format(taxa));
    System.out.println("O valor total é de: R$" + df.format((valorAnt+taxa)) );

    }
    
}
