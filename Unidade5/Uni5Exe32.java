package Unidade5;

import java.util.Scanner;

public class Uni5Exe32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite p (dia da semana em que o mês começa, 1=Domingo, 2=Segunda,...,7=Sábado): ");
        int p = sc.nextInt();
        System.out.print("Digite n (número de dias do mês): ");
        int n = sc.nextInt();
        
        int semanas = (int) Math.ceil((p + n - 1) / 7.0);
        
        String[][] calendario = new String[semanas][7];
        
        int dia = 1;
        int semana = 0;
        int diaSemana = p;
        
        while (dia <= n) {
            if (diaSemana > 7) {
                diaSemana = 1;
                semana++; 
            }
            
            calendario[semana][diaSemana - 1] = String.format("%2d", dia);
            dia++;
            diaSemana++;
        }
        
        String[] diasSemana = {"D", "S", "T", "Q", "Q", "S", "S"};
        for (String diaSemanaStr : diasSemana) {
            System.out.print(diaSemanaStr + "\t");
        }
        System.out.println();
        
        semana = 0; 
        
        while (semana < semanas) {
            diaSemana = 0; 
            
            while (diaSemana < 7) {
                if (calendario[semana][diaSemana] == null) {
                    System.out.print("  \t");
                } else {
                    System.out.print(calendario[semana][diaSemana] + "\t");
                }
                diaSemana++;
            }
            System.out.println();
            semana++;
        }
        
        sc.close();
    }
}
