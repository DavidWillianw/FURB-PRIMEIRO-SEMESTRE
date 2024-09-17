import java.util.Scanner;

//  Descreva um algoritmo que leia 10 números inteiros e os coloque em um vetor 
// de 10 posições do tipo inteiro. Escreva na ordem inversa em que foram lidos.
//  Faça um método para ler e outro para escrever.
public class Uni6Exe01 {
    public static void main(String[] args) {
        int[] numeros = new int[10];
        lerNumeros(numeros);
        escreverInverso(numeros);
    }
    
    public static void lerNumeros(int[] vetor) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite 10 números inteiros:");
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = scanner.nextInt();
        }
        scanner.close();
    }
    
    public static void escreverInverso(int[] vetor) {
        System.out.println("Números na ordem inversa:");
        for (int i = vetor.length - 1; i >= 0; i--) {
            System.out.println(vetor[i]);
        }
    }
}
