import java.util.Scanner;

public class Uni3Exe16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o valor da compra:");
        int valorCompra = scanner.nextInt();

        System.out.println("Informe o valor pago:");
        int valorPago = scanner.nextInt();

        int troco = valorPago - valorCompra;

        int notas100 = troco / 100;
        troco %= 100;

        int notas10 = troco / 10;
        troco %= 10;

        int notas1 = troco;

        System.out.println("Troco: " + (notas100 + notas10 + notas1) + " notas");
        System.out.println("Notas de 100: " + notas100);
        System.out.println("Notas de 10: " + notas10);
        System.out.println("Notas de 1: " + notas1);

        scanner.close();
    }
}
