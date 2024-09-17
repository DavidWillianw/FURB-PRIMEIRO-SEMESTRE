import java.util.Scanner;

public class Uni3Exe10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    System.out.println("Informe o comprimento do primeiro cateto:");
        double cateto1 = scanner.nextDouble();

        System.out.println("Informe o comprimento do segundo cateto:");
        double cateto2 = scanner.nextDouble();

        // Calculando o quadrado da hipotenusa
        double quadradoHipotenusa = Math.pow(cateto1, 2) + Math.pow(cateto2, 2);

        // Calculando a hipotenusa
        double hipotenusa = Math.sqrt(quadradoHipotenusa);

        System.out.println("O comprimento da hipotenusa é: " + hipotenusa);

        scanner.close();
    }
}
