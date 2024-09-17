package AtividadeExtra;
import java.util.Scanner;

public class terceiro {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o sexo (M/F): ");
        String entrada = scanner.nextLine().toUpperCase(); // Convertendo para maiúsculas

        // Verificando o sexo e exibindo o resultado correspondente
        if (entrada.equals("M")) {
            System.out.println("Masculino");
        } else if (entrada.equals("F")) {
            System.out.println("Feminino");
        } else {
            System.out.println("Indefinido");
        }

        scanner.close();
    }
}

