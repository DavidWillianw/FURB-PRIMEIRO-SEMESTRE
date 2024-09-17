package Unidade5;

import java.util.Scanner;

public class Uni5Exe27 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int diaMaiorProducao = 0;
        int maiorProducao = 0;
        int totalProducaoManha = 0;
        int totalProducaoTarde = 0;

        while (true) {
            int dia;
            while (true) {
                System.out.print("Dia do mês de abril: ");
                dia = scanner.nextInt();
                if (dia >= 1 && dia <= 30) {
                    break;
                } else {
                    System.out.println("Dia inválido");
                }
            }

            System.out.print("Total de peças produzidas no turno da manhã: ");
            int pecasManha = scanner.nextInt();
            System.out.print("Total de peças produzidas no turno da tarde: ");
            int pecasTarde = scanner.nextInt();

            int producaoTotal = pecasManha + pecasTarde;
            if (producaoTotal > maiorProducao) {
                maiorProducao = producaoTotal;
                diaMaiorProducao = dia;
            }

            totalProducaoManha += pecasManha;
            totalProducaoTarde += pecasTarde;

            double valorDiario;
            if (dia >= 1 && dia <= 15) {
                if (producaoTotal > 100 && pecasManha >= 30 && pecasTarde >= 30) {
                    valorDiario = producaoTotal * 0.80;
                } else {
                    valorDiario = producaoTotal * 0.50;
                }
            } else {
                valorDiario = pecasManha * 0.40 + pecasTarde * 0.30;
            }

            System.out.printf("R$ %.2f (valor recebido)%n", valorDiario);

            System.out.print("Novo funcionário (1.sim 2.não)? ");
            int novoFuncionario = scanner.nextInt();
            if (novoFuncionario != 1) {
                break;
            }
        }

        System.out.printf("Dia com maior produção: %d%n", diaMaiorProducao);
        if (totalProducaoManha > totalProducaoTarde) {
            System.out.printf("Maior produção foi no turno da manhã: %d peças%n", totalProducaoManha);
        } else {
            System.out.printf("Maior produção foi no turno da tarde: %d peças%n", totalProducaoTarde);
        }

        scanner.close();
    }
}

