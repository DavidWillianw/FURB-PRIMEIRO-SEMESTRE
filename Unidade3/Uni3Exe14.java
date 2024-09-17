import java.util.Scanner;

public class Uni3Exe14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe a distância percorrida (em km):");
        double distancia = scanner.nextDouble();

        System.out.println("Informe o tempo gasto na viagem (em horas):");
        double tempo = scanner.nextDouble();

        int kmPorLitro = 12;

        double velocidadeMedia = distancia / tempo;

        double combustivelGasto = distancia / kmPorLitro;

        System.out.println("Velocidade média: " + velocidadeMedia + " km/h");
        System.out.println("Quantidade de combustível gasto: " + combustivelGasto + " litros");

        scanner.close();
    }
}
