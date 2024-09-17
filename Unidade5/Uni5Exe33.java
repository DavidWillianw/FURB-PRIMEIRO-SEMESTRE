package Unidade5;

import java.util.Scanner;

public class Uni5Exe33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int voto;
        int candidato1 = 0, candidato2 = 0, candidato3 = 0, candidato4 = 0;
        int votosNulos = 0, votosBranco = 0, totalVotos = 0;
        
        do {
            System.out.print("Informe seu voto (1 a 4 para os candidatos, 5 para voto nulo, 6 para voto em branco, 0 para encerrar): ");
            voto = sc.nextInt();
            
            if (voto >= 1 && voto <= 4) {
                switch (voto) {
                    case 1:
                        candidato1++;
                        break;
                    case 2:
                        candidato2++;
                        break;
                    case 3:
                        candidato3++;
                        break;
                    case 4:
                        candidato4++;
                        break;
                }
                totalVotos++;
            } else if (voto == 5) {
                votosNulos++;
                totalVotos++;
            } else if (voto == 6) {
                votosBranco++;
                totalVotos++;
            } else if (voto != 0) {
                System.out.println("Opção incorreta. Por favor, informe um número válido de voto.");
            }
        } while (voto != 0);
        
        double percentualNulos = (votosNulos * 100.0) / totalVotos;
        double percentualBranco = (votosBranco * 100.0) / totalVotos;
        
        System.out.println("\nResultados da votação:");
        System.out.println("Total de votos para o Candidato 1: " + candidato1);
        System.out.println("Total de votos para o Candidato 2: " + candidato2);
        System.out.println("Total de votos para o Candidato 3: " + candidato3);
        System.out.println("Total de votos para o Candidato 4: " + candidato4);
        System.out.println("Total de votos nulos: " + votosNulos);
        System.out.println("Total de votos em branco: " + votosBranco);
        System.out.printf("Percentual de votos nulos sobre o total: %.2f%%\n", percentualNulos);
        System.out.printf("Percentual de votos em branco sobre o total: %.2f%%\n", percentualBranco);
        
        sc.close();
    }
}

