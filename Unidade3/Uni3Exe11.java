import java.util.Scanner;

public class Uni3Exe11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe a temperatura em graus Celsius:");
        double temperaturaCelsius = scanner.nextDouble();

        // Convertendo para Fahrenheit usando a fórmula
        double temperaturaFahrenheit = (9.0 / 5.0) * temperaturaCelsius + 32;

        System.out.println("A temperatura em graus Fahrenheit é: " + temperaturaFahrenheit);

        scanner.close();
    }
}
