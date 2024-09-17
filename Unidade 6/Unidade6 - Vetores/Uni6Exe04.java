import java.util.Scanner;

// Faça um programa para ler os valores de dois vetores de inteiros, cada um contendo 10 elementos. 
// Crie um terceiro vetor em que cada elemento é a soma dos valores contidos nas posições respectivas dos vetores originais. 
// Por exemplo, vetor1 = [1,2,3] vetor2 = [1,5,6] vetor3 = [2,7,9]. Exiba, ao final, os três vetores na tela. 
// Faça três métodos: um método para ler valores dos vetores, outro para somar e outro para escrever os vetores.

public class Uni6Exe04 {
    public static void main(String[] args) {
        int[] vetor1 = new int[10];
        int[] vetor2 = new int[10];
        int[] vetorSoma = new int[10];

        lerValores(vetor1, "primeiro");
        lerValores(vetor2, "segundo");
        somarVetores(vetor1, vetor2, vetorSoma);
        escreverVetores(vetor1, vetor2, vetorSoma);
    }

    // Método para ler os valores dos vetores
    public static void lerValores(int[] vetor, String nomeVetor) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite os 10 valores para o " + nomeVetor + " vetor:");
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = scanner.nextInt();
        }
        scanner.close();
    }

    // Método para somar os valores dos vetores
    public static void somarVetores(int[] vetor1, int[] vetor2, int[] vetorSoma) {
        for (int i = 0; i < vetor1.length; i++) {
            vetorSoma[i] = vetor1[i] + vetor2[i];
        }
    }

    // Método para escrever os vetores na tela
    public static void escreverVetores(int[] vetor1, int[] vetor2, int[] vetorSoma) {
        System.out.println("Vetor 1:");
        escreverVetor(vetor1);
        System.out.println("Vetor 2:");
        escreverVetor(vetor2);
        System.out.println("Vetor Soma:");
        escreverVetor(vetorSoma);
    }

    // Método auxiliar para escrever um vetor
    public static void escreverVetor(int[] vetor) {
        for (int valor : vetor) {
            System.out.print(valor + " ");
        }
        System.out.println();
    }
}

