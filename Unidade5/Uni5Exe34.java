package Unidade5;

import java.util.Scanner;

public class Uni5Exe34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int opcao;
        int contasEncerradas = 0;
        
        while (true) {
            System.out.println("\nOpções disponíveis:");
            System.out.println("(1) Encerrar a conta de um hóspede");
            System.out.println("(2) Verificar número de contas encerradas");
            System.out.println("(3) Sair");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();
            
            if (opcao == 1) {
                System.out.print("Informe o nome do hóspede: ");
                String nome = sc.next();
                System.out.print("Informe o número de diárias: ");
                int numDiarias = sc.nextInt();
                
                double taxaServicos;
                if (numDiarias < 15) {
                    taxaServicos = 7.50;
                } else if (numDiarias == 15) {
                    taxaServicos = 6.50;
                } else {
                    taxaServicos = 5.00;
                }
                
                double totalPagar = 50.00 * numDiarias + taxaServicos;
                
                System.out.println("Hóspede: " + nome);
                System.out.printf("Total a ser pago: R$ %.2f\n", totalPagar);
                contasEncerradas++;
                
            } else if (opcao == 2) {
                System.out.println("Número de contas encerradas até agora: " + contasEncerradas);
                
            } else if (opcao == 3) {
                System.out.println("Encerrando o programa.");
                break;
                
            } else {
                System.out.println("Opção incorreta. Por favor, escolha uma opção válida.");
            }
        }
        
        sc.close();
    }
}
