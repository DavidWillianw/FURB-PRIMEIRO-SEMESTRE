package ExerciciosDeVetoresCurso;

import java.util.Scanner;

// Criar um vetor A com 15 elementos inteiros. Construir um vetor B de
// mesmo tipo e tamanho, sendo que cada elemento do vetor B deverá
// ser o quadrado do respectivo elemento de A, ou seja:
// B[i] = A[i] * A[i]. Imprima os vetores A e B

public class Exercicios1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int vetorA[] = new int[15];
        int vetorB[] = new int[15];

        // Preenchendo o vetor A com valores fornecidos pelo usuário
        for (int i = 0; i < vetorA.length; i++) {
            System.out.print("Informe o valor " + (i + 1) + " para o vetor A: ");
            vetorA[i] = scan.nextInt();
        }

        // Calculando os quadrados e preenchendo o vetor B
        for (int i = 0; i < vetorA.length; i++) {
            vetorB[i] = vetorA[i] * vetorA[i];
        }

        // Imprimindo os vetores A e B
        System.out.println("Vetor A:");
        for (int i = 0; i < vetorA.length; i++) {
            System.out.print(vetorA[i] + " ");
        }
        System.out.println(); // Adiciona uma linha em branco para separar os vetores
        System.out.println("Vetor B:");
        for (int i = 0; i < vetorB.length; i++) {
            System.out.print(vetorB[i] + " ");
        }

        scan.close();
    }
}
