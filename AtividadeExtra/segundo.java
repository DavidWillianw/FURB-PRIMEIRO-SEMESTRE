package AtividadeExtra;
import java.util.Scanner;

public class segundo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome da fruta: ");
        String Fruta = scanner.nextLine().toLowerCase(); 

        if (Fruta.equals("amora") || Fruta.equals("nectarina") ||
            Fruta.equals("ameixa") || Fruta.equals("goiaba")) {
            System.out.println(Fruta + " eu gosto");
        } else {
            System.out.println(Fruta + " eu como mas não gosto");
        }

        scanner.close();
    }
}


