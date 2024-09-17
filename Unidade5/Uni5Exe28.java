package Unidade5;

import java.util.Scanner;

public class Uni5Exe28 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int votosNenhumDeNos = 0;
        int votosCPM22 = 0;
        int votosSkank = 0;
        int votosJotaQuest = 0;
        int totalVotos = 0;

        while (true) {
            System.out.print("Digite o código do conjunto (1: Nenhum de Nós, 2: CPM22, 3: Skank, 4: Jota Quest): ");
            int voto = scanner.nextInt();

            switch (voto) {
                case 1:
                    votosNenhumDeNos++;
                    break;
                case 2:
                    votosCPM22++;
                    break;
                case 3:
                    votosSkank++;
                    break;
                case 4:
                    votosJotaQuest++;
                    break;
                default:
                    System.out.println("Código inválido. Tente novamente.");
                    continue;
            }

            totalVotos++;

            System.out.print("Mais um voto: s (SIM) / n (NÃO)? ");
            char continuar = scanner.next().toLowerCase().charAt(0);
            if (continuar != 's') {
                break;
            }
        }

        double percNenhumDeNos = (double) votosNenhumDeNos / totalVotos * 100;
        double percCPM22 = (double) votosCPM22 / totalVotos * 100;
        double percSkank = (double) votosSkank / totalVotos * 100;
        double percJotaQuest = (double) votosJotaQuest / totalVotos * 100;

        System.out.println("Resultado da votação:");
        System.out.printf("Nenhum de Nós: %d votos (%.2f%%)%n", votosNenhumDeNos, percNenhumDeNos);
        System.out.printf("CPM22: %d votos (%.2f%%)%n", votosCPM22, percCPM22);
        System.out.printf("Skank: %d votos (%.2f%%)%n", votosSkank, percSkank);
        System.out.printf("Jota Quest: %d votos (%.2f%%)%n", votosJotaQuest, percJotaQuest);

        if (votosNenhumDeNos > votosCPM22 && votosNenhumDeNos > votosSkank && votosNenhumDeNos > votosJotaQuest) {
            System.out.println("Grupo vencedor: Nenhum de Nós");
        } else if (votosCPM22 > votosNenhumDeNos && votosCPM22 > votosSkank && votosCPM22 > votosJotaQuest) {
            System.out.println("Grupo vencedor: CPM22");
        } else if (votosSkank > votosNenhumDeNos && votosSkank > votosCPM22 && votosSkank > votosJotaQuest) {
            System.out.println("Grupo vencedor: Skank");
        } else if (votosJotaQuest > votosNenhumDeNos && votosJotaQuest > votosCPM22 && votosJotaQuest > votosSkank) {
            System.out.println("Grupo vencedor: Jota Quest");
        } else {
            System.out.println("Houve um empate na votação.");
        }

        scanner.close();
    }
}
