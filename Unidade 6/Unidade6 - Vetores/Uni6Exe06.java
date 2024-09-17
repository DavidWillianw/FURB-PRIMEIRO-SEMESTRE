import java.util.Scanner;

public class Uni6Exe06 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe a quantidade de valores a serem armazenados: ");
        int tamanho = scanner.nextInt();

        double[] vetor = new double[tamanho];

        // Preenchendo o vetor
        lerVetor(scanner, vetor);

        // Solicitando um valor para busca
        System.out.print("Informe um valor para buscar no vetor: ");
        double valorBusca = scanner.nextDouble();

        // Verificando se o valor está no vetor
        boolean encontrado = encontrarValor(vetor, valorBusca);

        if (encontrado) {
            System.out.println("O valor " + valorBusca + " está presente no vetor.");
        } else {
            System.out.println("O valor " + valorBusca + " não está presente no vetor.");
        }

        scanner.close();
    }

    // Método para ler os valores e preencher o vetor
    public static void lerVetor(Scanner scanner, double[] vetor) {
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Informe o valor real " + (i + 1) + ": ");
            vetor[i] = scanner.nextDouble();
        }
    }

    // Método para verificar se um valor está presente no vetor
    public static boolean encontrarValor(double[] vetor, double valor) {
        for (double elemento : vetor) {
            if (elemento == valor) {
                return true;
            }
        }
        return false;
    }
}
