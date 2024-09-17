import java.util.Scanner;

public class Uni3Exe12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o nome do funcionário:");
        String nomeFuncionario = scanner.nextLine();

        System.out.println("Informe o número de horas trabalhadas mensais:");
        int horasTrabalhadas = scanner.nextInt();

        System.out.println("Informe o número de dependentes:");
        int dependentes = scanner.nextInt();

        double salarioHora = 10.00;
        double salarioDependente = 60.00;

        double salarioBruto = (horasTrabalhadas * salarioHora) + (dependentes * salarioDependente);

        double inss = salarioBruto * 0.085;
        double impostoRenda = salarioBruto * 0.05;

        double salarioLiquido = salarioBruto - inss - impostoRenda;

        System.out.println("Nome do funcionário: " + nomeFuncionario);
        System.out.println("Salário bruto: R$ " + salarioBruto);
        System.out.println("Salário líquido: R$ " + salarioLiquido);

        scanner.close();
    }
}
