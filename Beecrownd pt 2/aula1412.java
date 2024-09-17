import java.util.Scanner;

public class aula1412 {

    public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    
    int t;
    int i = scan.nextInt();
    int f = scan.nextInt();
    
    if (i >= f){
        t = (24 + f) - i;
    }
    
    else {
    t = f - i;
    }
    scan.close();
        System.out.print("O JOGO DUROU " + t + " HORA(S)");
    }
}

