package Revis;

public class vetores2 {

    //criando metodo para imprimir elementos do vetor
public static void imprimir (int vetor[]){
    for(int i=0; i<vetor.length; i++){

        System.out.println(vetor[i] + " ");
    }
}

    public static void main(String[] args) {
        
    int vetor[] = {5,6,7,8,1}; //Encaixa os elementos direto no Vetor

    //chamando o metodo que irá imprimir os elementos do vetor
    imprimir(vetor);
// somar mais 3 em cada elemento do vetor
for(int i =0; i<vetor.length; i++){

    vetor[i] = vetor[i] + 3;

}
    //chamando o metodo que irá imprimir os elementos do vetor
imprimir(vetor);
}
}


