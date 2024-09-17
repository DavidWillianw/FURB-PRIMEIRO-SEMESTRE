package Unidade5;

import java.util.Scanner;

public class Uni5Exe26 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Valor máximo de pedágio: R$ ");
        double maxPedagio = scanner.nextDouble();

        int trechosAcimaValor = 0;
        int totalTrechos = 0;
        int trechosAceitaveisLongos = 0;

        while (true) {
            System.out.print("Valor do pedágio: R$ ");
            double valorPedagio = scanner.nextDouble();
            if (valorPedagio < 0) {
                break;
            }

            System.out.print("Distância do trecho (em km): ");
            double distancia = scanner.nextDouble();

            totalTrechos++;

            if (valorPedagio > maxPedagio) {
                trechosAcimaValor++;
            } else if (distancia > 150) {
                trechosAceitaveisLongos++;
            }
        }

        System.out.printf("%d trechos com valor acima do qual Astolfo nega-se a pagar.%n", trechosAcimaValor);
        System.out.printf("%d trechos foram informados.%n", totalTrechos);
        System.out.printf("%d trechos acima de 150 km possuem um valor de pedágio que Astolfo concorda em pagar.%n", trechosAceitaveisLongos);

        scanner.close();
    }
}
