package Unidade5;

public class Uni5Exe04 {
    public static void main(String[] args) {
        double S = 0;

        int cima = 3, baixo = 2, IcBaixo = 2 ;

        for (int i = 1; i <= 20; i++) {
            S = S +(cima/(baixo*1.0));
            cima += 2;
            IcBaixo += 2;
            baixo += IcBaixo;
        }
        
System.out.println(S);

    }
}
