import java.util.Scanner;

public class Uni3Exe15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe um número inteiro de até 3 dígitos:");
        int numero = scanner.nextInt();

        int centenas = numero / 100;
        int dezenas = (numero % 100) / 10;
        int unidades = numero % 10;

        System.out.println(centenas + " centena(s)  " + dezenas + " dezena(s) " + unidades + " unidade(s)");

        scanner.close();
    }
}
