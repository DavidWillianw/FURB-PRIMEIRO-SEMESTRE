package Unidade5;
import java.util.Scanner;

public class Uni5Exe13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o número total de reabastecimentos feitos: ");
        int numReabastecimentos = scanner.nextInt();
        
        double distanciaTotal = 0;
        double combustivelTotal = 0;
        
        for (int i = 1; i <= numReabastecimentos; i++) {
            System.out.print("Digite a quilometragem registrada no odômetro: ");
            double quilometragem = scanner.nextDouble();
            
            System.out.print("Digite a quantidade de combustível comprada: ");
            double combustivel = scanner.nextDouble();
            
            double quilometragemPorLitro = quilometragem / combustivel;
            distanciaTotal += quilometragemPorLitro;
            combustivelTotal += combustivel;
            
            System.out.println("Quilometragem obtida por litro: " + quilometragemPorLitro);
        }
        
        double quilometragemMedia = distanciaTotal / numReabastecimentos;
        System.out.println("Quilometragem média obtida por litro em toda a viagem: " + quilometragemMedia);
        
        scanner.close();
    }
}
