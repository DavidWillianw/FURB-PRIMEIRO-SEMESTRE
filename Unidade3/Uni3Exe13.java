import java.util.Scanner;

public class Uni3Exe13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o comprimento da parede em metros:");
        double comprimento = scanner.nextDouble();

        System.out.println("Informe a altura da parede em metros:");
        double altura = scanner.nextDouble();

        int azulejosPorMetroQuadrado = 9;
        double valorAzulejo = 12.50;

        double area = comprimento * altura;

        int quantidadeAzulejos = (int) Math.ceil(area * azulejosPorMetroQuadrado);

        double valorTotal = quantidadeAzulejos * valorAzulejo;


        System.out.println("Valor gasto com a compra de azulejos: R$ " + valorTotal);

        scanner.close();
    }
}
