package Unidade5;
import java.util.Scanner;

public class Uni5Exe09 {        
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite o número de alunos: ");
        int n = scan.nextInt();
        scan.nextLine(); 

        String alunosDezoitoAnos = ""; 
        int contadorMaisVinte = 0;
        
        for (int i = 1; i <= n; i++) {
            System.out.println("Aluno " + i + ":");

            System.out.print("Digite o nome do aluno: ");
            String nome = scan.nextLine();

            System.out.print("Digite a idade do aluno: ");
            int idade = scan.nextInt();
            scan.nextLine(); 
            
            if (idade == 18) {
                alunosDezoitoAnos += nome + "\n";
            } 
            
            if (idade >= 20) {
                contadorMaisVinte++;
            }
        }

        if (!alunosDezoitoAnos.isEmpty()) {
            System.out.println("\nNomes dos alunos com 18 anos:\n" + alunosDezoitoAnos);
        } else {
            System.out.println("Nenhum aluno com 18 anos encontrado.");
        }

        System.out.println("Quantidade de alunos com mais de 20 anos: " + contadorMaisVinte);

        scan.close();
    }
}
