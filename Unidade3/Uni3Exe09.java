
import java.text.DecimalFormat;
import java.util.Scanner;

public class Uni3Exe09 {    
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        double pi = 3.141592653589793;

        System.out.println("Informe o raio da lata de óleo:");
        double raio = scanner.nextDouble();

        System.out.println("Informe a altura da lata de óleo:");
        double altura = scanner.nextDouble();

        double volume = pi * Math.pow(raio, 2) * altura;

        DecimalFormat formato = new DecimalFormat("#0.###############");
        System.out.println("O volume da lata de óleo é: " + formato.format(volume));

        scanner.close();
}
}