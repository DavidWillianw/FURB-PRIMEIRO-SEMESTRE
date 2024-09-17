import java.util.Scanner;

public class Uni6Exe08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite os números: ");
        int N = scanner.nextInt();

        while (N > 20) {
            System.out.println(" O valor é inválido. Por favor, informe novamente:");
            N = scanner.nextInt();
        }

        double[] numbers = new double[N];

        System.out.println("Digite " + N + " números reais:");
        for (int i = 0; i < N; i++) {
            numbers[i] = scanner.nextDouble();
        }

        double[] uniqueValues = new double[N];
        int[] frequencies = new int[N];
        int uniqueCount = 0;

        for (int i = 0; i < N; i++) {
            double currentValue = numbers[i];
            boolean found = false;
            for (int j = 0; j < uniqueCount; j++) {
                if (uniqueValues[j] == currentValue) {
                    frequencies[j]++;
                    found = true;
                    break;
                }
            }
            if (!found) {
                uniqueValues[uniqueCount] = currentValue;
                frequencies[uniqueCount] = 1;
                uniqueCount++;
            }
        }

        System.out.println("VALOR\tFREQUÊNCIA");
        for (int i = 0; i < uniqueCount; i++) {
            System.out.printf("%.2f\t%d%n", uniqueValues[i], frequencies[i]);
        }
        scanner.close();
    }
}

