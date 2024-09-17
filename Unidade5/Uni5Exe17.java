package Unidade5;

import java.util.Scanner;

public class Uni5Exe17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int inscricaoMaisAlto = 0, inscricaoMaisBaixo = 0;
        double alturaMaisAlta = 0, alturaMaisBaixa = Double.MAX_VALUE;
        double somaAlturas = 0;
        int countAtletas = 0;

        while (true) {
            System.out.print("Digite o número de inscrição (ou 0 para encerrar): ");
            int inscricao = scanner.nextInt();
            if (inscricao == 0) {
                break;
            }
            
            System.out.print("Digite a altura do atleta: ");
            double altura = scanner.nextDouble();

            if (altura > alturaMaisAlta) {
                alturaMaisAlta = altura;
                inscricaoMaisAlto = inscricao;
            }
            
            if (altura < alturaMaisBaixa) {
                alturaMaisBaixa = altura;
                inscricaoMaisBaixo = inscricao;
            }

            somaAlturas += altura;
            countAtletas++;
        }

        double mediaAlturas = (countAtletas > 0) ? somaAlturas / countAtletas : 0;

        System.out.printf("Atleta mais alto: Inscrição %d, Altura %.2f%n", inscricaoMaisAlto, alturaMaisAlta);
        System.out.printf("Atleta mais baixo: Inscrição %d, Altura %.2f%n", inscricaoMaisBaixo, alturaMaisBaixa);
        System.out.printf("Altura média do grupo: %.2f%n", mediaAlturas);

        scanner.close();
    }
}
