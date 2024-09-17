package ProvaQuestoes;
import java.util.Scanner;

public class ProvaQ1 {
    public static void main(String[] args) {
        
    Scanner scan = new Scanner(System.in);

    System.out.println("Digite o valor da multa 1: ");
    int multa1 = scan.nextInt();

    System.out.println("Digte o valor da multa 2");
    int multa2 = scan.nextInt();

    System.out.println("Digte o valor da multa 3");
    int multa3 = scan.nextInt();

    int ValorMulta = (multa1+multa2+multa3)/3;
    
    System.out.println("Digite o valor da Multa");

    System.out.println("MENU: ");
    System.out.println("1 - Multa Mais Alta");
    System.out.println("2- Multa Mais Baixa");
    System.out.println("3 - Multa impressos em ordem crescente");
    System.out.println("4 -Média das Multas Pagas");
    
    System.out.println("Digite o número da opção:");
    int opc = scan.nextInt();

    scan.close();
if(multa1 <= 0){
    System.out.println("Valor não aceito");
    return;

}

if(multa2 <= 0){
    System.out.println("Valor não aceito");
    return;

}    
if(multa3 <= 0){
    System.out.println("Valor não aceito");
    return;

}
if(opc <=0){
        System.out.println("Valor não aceito");
        return;

    }
    

switch(opc) {
    case 1:
        if (multa1 >= multa2 && multa1 >= multa3) {
            System.out.println("A maior multa é a multa 1");
        } else if (multa2 >= multa1 && multa2 >= multa3) {
            System.out.println("A maior multa é a multa 2");
        } else {
            System.out.println("A maior multa é a multa 3");
        }
        break;
        case 2:
                if (multa1 <= multa2 && multa1 <= multa3) {
                    System.out.println("A menor multa é a multa 1 de R$" + multa1);
                } else if (multa2 <= multa1 && multa2 <= multa3) {
                    System.out.println("A menor multa é a multa 2 de R$" + multa2);
                } else {
                    System.out.println("A menor multa é a multa 3 de R$" + multa3);
                }
break;
    
    case 3:
    if (multa1<multa2 && multa2 < multa3 ){
        System.out.println("multa1");
        System.out.println("multa2");
        System.out.println("multa3");

    }
    else if (multa2<multa1 && multa2<multa3 ){
        System.out.println("multa2");
        System.out.println("multa1");
        System.out.println("multa3");
    }
    else if (multa1<multa3 && multa3<multa2 ){
        System.out.println("multa1");
        System.out.println("multa3");
        System.out.println("multa2");
    }
    else if (multa2<multa3 && multa3<multa1 ){
        System.out.println("multa2");
        System.out.println("multa3");
        System.out.println("multa1");
    }
    
    
    else if (multa3<multa2 && multa2<multa1 ){
        System.out.println("multa3");
        System.out.println("multa2");
        System.out.println("multa1");

    }
else  if (multa3<multa2 && multa2<multa1 ){
        System.out.println("multa3");
        System.out.println("multa2");
        System.out.println("multa1");

    }
    

    break;

    case 4:
    System.out.println("A Média é: "+ ValorMulta);



    }

}
}
