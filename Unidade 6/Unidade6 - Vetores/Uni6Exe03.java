    import java.util.Scanner;

    // Descreva um algoritmo que leia 12 valores reais e os coloque em um vetor de 12 posições do tipo real.
    //  Em seguida, modifique o vetor de modo que os valores das posições ímpares sejam aumentados em 5% e os das posições pares
    //   sejam aumentados em 2%. Imprima o vetor resultante. Faça um método para ler os valores, outro para ajustar os 
    //   valores dentro do vetor e outro para escrever os valores atualizados do vetor.



public class Uni6Exe03 {
    public static void main(String[] args) {
        double[] valores = lerValores();
        ajustarValores(valores);
        escreverValores(valores);
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

    // Método para ajustar os valores dentro do vetor
    public static void ajustarValores(double[] valores) {
        for (int i = 0; i < valores.length; i++) {
            if (i % 2 == 0) { // posição par
                valores[i] *= 1.02; // aumenta em 2%
            } else { // posição ímpar
                valores[i] *= 1.05; // aumenta em 5%
            }
        }
    }

    // Método para escrever os valores atualizados do vetor
    public static void escreverValores(double[] valores) {
        System.out.println("Valores atualizados:");
        for (double valor : valores) {
            System.out.println(valor);
        }  
}

}
