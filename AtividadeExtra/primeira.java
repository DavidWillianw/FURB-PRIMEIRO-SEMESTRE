package AtividadeExtra;
import java.util.Scanner;

public class primeira {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu nome completo: ");
        String nomeCompleto = scanner.nextLine();

        String iniciais = extractInitials(nomeCompleto);

        System.out.println("Iniciais: " + iniciais);

        String nomeMaiusculo = nomeCompleto.toUpperCase();
        System.out.println("Nome em maiúsculas: " + nomeMaiusculo);

        scanner.close();
    }

    private static String extractInitials(String nomeCompleto) {
        StringBuilder iniciais = new StringBuilder();
        String[] partesNome = nomeCompleto.split(" ");
        for (String parte : partesNome) {
            if (!parte.isEmpty()) {
                iniciais.append(parte.charAt(0));
            }
        }
        return iniciais.toString();
    }
}

