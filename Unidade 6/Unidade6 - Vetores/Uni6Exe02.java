    import java.util.Scanner;

    // Descreva um algoritmo que leia 12 valores reais e os coloque em um vetor de 12 posições do tipo real. 
    // Imprima quais valores desses informados são maiores que a média dos valores. 
    // Faça um método para ler os valores, outro para calcular a média e outro para informar os valores maiores que a média.

public class Uni6Exe02 {
    public static void main(String[] args) {
        double[] valores = lerValores();
        double media = calcularMedia(valores);
        imprimirMaioresQueMedia(valores, media);
    }

    // Método para ler os valores
    public static double[] lerValores() {
        Scanner scanner = new Scanner(System.in);
        double[] valores = new double[12];
        System.out.println("Digite os 12 valores reais:");
        for (int i = 0; i < valores.length; i++) {
            valores[i] = scanner.nextDouble();
        }
        scanner.close();
        return valores;
    }

    // Método para calcular a média
    public static double calcularMedia(double[] valores) {
        double soma = 0;
        for (double valor : valores) {
            soma += valor;
        }
        return soma / valores.length;
    }

    // Método para imprimir os valores maiores que a média
    public static void imprimirMaioresQueMedia(double[] valores, double media) {
        System.out.println("Valores maiores que a média:");
        for (double valor : valores) {
            if (valor > media) {
                System.out.println(valor);
            }
        }
    }
}


