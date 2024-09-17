
import java.util.Scanner;

public class Uni3Exe08 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe a quantidade depositada: ");
        Double real = sc.nextDouble();

        double cotacao = real/5.04;

        System.out.println("Valor recebido para o cliente é: " + cotacao);
    sc.close();
}
}

