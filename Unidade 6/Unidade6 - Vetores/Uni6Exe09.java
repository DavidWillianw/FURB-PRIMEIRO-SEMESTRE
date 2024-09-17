import java.util.Scanner;

public class Uni6Exe09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] dados = new int[30][3]; 

        for (int i = 0; i < 30; i++) {
            System.out.print("Informe o sexo (1=feminino, 2=masculino): ");
            dados[i][0] = scanner.nextInt();
            while (dados[i][0]!= 1 && dados[i][0]!= 2) {
                System.out.println(" O valor é inválido. Por favor, informe novamente:");
                dados[i][0] = scanner.nextInt();
            }
            System.out.print("Informe a nota (0-10): ");
            dados[i][1] = scanner.nextInt();
            while (dados[i][1] < 0 || dados[i][1] > 10) {
                System.out.println(" O valor é inválido. Por favor, informe novamente:");
                dados[i][1] = scanner.nextInt();
            }
            System.out.print("Informe a idade: ");
            dados[i][2] = scanner.nextInt();
            while (dados[i][2] < 1) {
                System.out.println(" O valor é inválido. Por favor, informe novamente:");
                dados[i][2] = scanner.nextInt();
            }
        }

        int somaNotas = 0;
        for (int i = 0; i < 30; i++) {
            somaNotas += dados[i][1];
        }
        double notaMediaCinema = (double) somaNotas / 30;
        System.out.println("Nota média recebida pelo cinema: " + notaMediaCinema);

        int somaNotasHomens = 0;
        int contadorHomens = 0;
        for (int i = 0; i < 30; i++) {
            if (dados[i][0] == 2) { 
                somaNotasHomens += dados[i][1];
                contadorHomens++;
            }
        }
        double notaMediaHomens = (double) somaNotasHomens / contadorHomens;
        System.out.println("Nota média atribuída pelos homens: " + notaMediaHomens);

        int idadeMulherMaisJovem = Integer.MAX_VALUE;
        int notaMulherMaisJovem = 0;
        for (int i = 0; i < 30; i++) {
            if (dados[i][0] == 1 && dados[i][2] < idadeMulherMaisJovem) { 
                idadeMulherMaisJovem = dados[i][2];
                notaMulherMaisJovem = dados[i][1];
            }
        }
        System.out.println("Nota atribuída pela mulher mais jovem: " + notaMulherMaisJovem);

        int contadorMulheresMais50 = 0;
        for (int i = 0; i < 30; i++) {
            if (dados[i][0] == 1 && dados[i][2] > 50 && dados[i][1] > notaMediaCinema) { 
                contadorMulheresMais50++;
            }
        }
        System.out.println("Mulheres com mais de 50 anos que deram nota superior a média: " + contadorMulheresMais50);

        scanner.close();
    }
}