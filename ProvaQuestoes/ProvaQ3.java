package ProvaQuestoes;
// import java.util.Scanner;

public class ProvaQ3 {
    public static void main(String[] args) {
                
        String animal = "buldog";

        String especie = "Cachorro";



        if (animal.equals(especie)) {
            System.out.println("Nao é possivel informar os dados");
            System.out.println("Vazio");

            return;
        }

        else { 
            System.out.println("animal: " + animal);

    }
    if (especie.equals(animal)){
        System.out.println("Especie vazio");
        return;
    }

    else {
        System.out.println("especie: " + especie);
        return;
            
        }




    
    }
}
