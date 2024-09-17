package Unidade5;

public class Uni5Exe11 {
    public static void main(String[] args) {
        int totalBiscoitos = 4;
        int biscoitosQuebrados = 0;
        
        for (int i = 1; i <= 16; i++) {
            biscoitosQuebrados += Math.pow(3, i - 1);
        }
        
        System.out.println("Total de biscoitos quebrados em um dia: " + biscoitosQuebrados);
    }
}
