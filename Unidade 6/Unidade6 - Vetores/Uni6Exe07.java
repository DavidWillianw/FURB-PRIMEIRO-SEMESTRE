import java.util.Scanner;

public class Uni6Exe07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Lê o tamanho do vetor
        System.out.print("Digite o tamanho do vetor (máximo 20): ");
        int n = scanner.nextInt();
        if (n > 20) {
            System.out.println("O tamanho máximo permitido é 20.");
            scanner.close();
            return;
        }

        int[] vetor = new int[n];

        // Inserir valores no vetor
        inserirValores(vetor, scanner);

        // Ordenar o vetor
        ordenarVetor(vetor);

        // Exibir o vetor ordenado
        exibirVetor(vetor);

        scanner.close();
    }

    // Método para inserir valores no vetor
    public static void inserirValores(int[] vetor, Scanner scanner) {
        int count = 0;
        while (count < vetor.length) {
            System.out.print("Digite um número inteiro: ");
            int numero = scanner.nextInt();

            if (!existeNoVetor(vetor, count, numero)) {
                vetor[count] = numero;
                count++;
            } else {
                System.out.println("O número já existe no vetor. Digite outro número.");
            }
        }
    }

    // Método para verificar se um número já existe no vetor
    public static boolean existeNoVetor(int[] vetor, int count, int numero) {
        for (int i = 0; i < count; i++) {
            if (vetor[i] == numero) {
                return true;
            }
        }
        return false;
    }

    // Método para ordenar o vetor usando bubble sort
    public static void ordenarVetor(int[] vetor) {
        int n = vetor.length;
        boolean trocado;
        for (int i = 0; i < n - 1; i++) {
            trocado = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (vetor[j] > vetor[j + 1]) {
                    // Troca vetor[j] e vetor[j + 1]
                    int temp = vetor[j];
                    vetor[j] = vetor[j + 1];
                    vetor[j + 1] = temp;
                    trocado = true;
                }
            }
            // Se não houve troca, o vetor já está ordenado
            if (!trocado) break;
        }
    }

    // Método para exibir o vetor
    public static void exibirVetor(int[] vetor) {
        System.out.print("Vetor ordenado: ");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }
        System.out.println();
    }
}
