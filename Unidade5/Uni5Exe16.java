package Unidade5;
import java.util.Scanner;

public class Uni5Exe16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countMulheres = 0;
        double somaAlturaMulheres = 0;
        double somaAlturaTotal = 0;
        int countTotal = 0;

        while (true) {
            System.out.print("Digite a altura (ou 0 para encerrar): ");
            double altura = scanner.nextDouble();
            if (altura == 0) {
                break;
            }
            
            System.out.print("Digite o sexo (M/F): ");
            char sexo = scanner.next().charAt(0);

            somaAlturaTotal += altura;
            countTotal++;

            if (sexo == 'F' || sexo == 'f') {
                somaAlturaMulheres += altura;
                countMulheres++;
            }
        }

        double mediaAlturaMulheres = (countMulheres > 0) ? somaAlturaMulheres / countMulheres : 0;
        double mediaAlturaTotal = (countTotal > 0) ? somaAlturaTotal / countTotal : 0;

        System.out.printf("Média da altura das mulheres: %.2f%n", mediaAlturaMulheres);
        System.out.printf("Média da altura do grupo: %.2f%n", mediaAlturaTotal);

        scanner.close();
    }
}
