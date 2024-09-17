package AtividadeExtra;
import java.util.Scanner;

public class b1017 {

    public static void main(String[] args) {
    	Scanner scan = new Scanner(System.in);
    	int N = scan.nextInt();
    	for (int i = 0; i < N; i++) {
    		int x = scan.nextInt();
    		if (x == 0) System.out.println("NULL");
    		else if (x % 2 == 0 && x > 0) System.out.println("EVEN POSITIVE");
    		else if (x % 2 == 0 && x < 0) System.out.println("EVEN NEGATIVE");
    		else if (x % 2 != 0 && x > 0) System.out.println("ODD POSITIVE");
    		else if (x % 2 != 0 && x < 0) System.out.println("ODD NEGATIVE");
    	}
        scan.close();
	}
	
}