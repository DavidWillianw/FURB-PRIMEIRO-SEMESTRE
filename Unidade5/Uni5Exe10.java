package Unidade5;

public class Uni5Exe10 {
        public static void main(String[] args) {
            int contador = 0; 
    
            for (int i = 10; contador < 10; i++) {
                int dezena = i / 10; // Extrai o dígito da dezena
                int unidade = i % 10; // Extrai o dígito da unidade
    
                int soma = dezena + unidade;
    
                int numero = soma * 100 + 25;
    
                double raizQuadrada = Math.sqrt(numero);
    
                if (raizQuadrada == i) {
                    System.out.println(i);
                    contador++;
                }
            }
        }
    }