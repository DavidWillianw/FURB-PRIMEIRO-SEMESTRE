package Unidade4;
import java.util.Scanner;

public class Uni4Exe01 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite o número de horas trabalhadas no mês: ");
        int horasTrabalhadas = teclado.nextInt();

        System.out.print("Digite o valor da hora trabalhada: ");
        double valorHora = teclado.nextDouble();

        double salarioTotal = horasTrabalhadas * valorHora;

        if (horasTrabalhadas > 160) {
            double horasExtras = horasTrabalhadas - 160;
            double valorHoraExtra = valorHora * 1.5;
            double salarioExtra = horasExtras * valorHoraExtra;
            salarioTotal += salarioExtra;
        }

        System.out.println("O salário total é: " + salarioTotal);

        teclado.close();
    }
}