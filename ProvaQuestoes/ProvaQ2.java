package ProvaQuestoes;
import java.util.Scanner;

public class ProvaQ2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite o setor da roupa");
        String setor = scan.nextLine().toLowerCase();

        scan.close();

        if(setor.equals("a")){
            System.out.println("Setor A");

        }
        else if(setor.equals("c")){
            System.out.println("Setor C");

        }
        else if(setor.equals("e")){
            System.out.println("Setor E");

        }
        else {
            System.out.println("Entrada Inválida");
            return;
        }

    }
}
