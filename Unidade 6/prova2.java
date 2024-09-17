import java.util.Scanner;

public class prova2 {

    private static final int CAPACIDADE = 5;

    private static int[] vetor = new int[CAPACIDADE];
    private static String[] vetorB = new String[CAPACIDADE];

    private static int tamanho = 0;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
            int opcao;
            scan.nextLine();
            do {
                mostrarMenu();
                opcao = scan.nextInt();
                switch (opcao) {
                    case 1:
                    incluirValor(scan);
                    break;
                case 2:
                    imprimirMochila();
                    break;
                case 3:
                    ordenarItensPorPeso();
                    break;
                case 4:
                    ordenarItensDaMochila();
                    break;
                case 5:
                    excluirItemDaMochila(scan);
                    break;
                case 6:
                    System.out.println("Saindo do programa...");
                    return;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                }
            } while (opcao != 6);
            scan.close();
    }

    public static void mostrarMenu(){
        System.out.println("Menu:");
        System.out.println("1) Inserir item");
        System.out.println("2) Imprimir Mochila");
        System.out.println("3) Mostrar ordem do mais pesado pro mais leve");
        System.out.println("4) Ordenar itens da mochila");
        System.out.println("5) Excluir item da Mochila");
        System.out.println("6) Sair da mochila");
        System.out.print("Escolha uma opção: ");
    }

    private static void incluirValor(Scanner scan) {
        if (tamanho < CAPACIDADE) {
            System.out.print("Informe o Nome do item a ser incluído: ");
            String a = scan.nextLine();
            System.out.print("Informe o peso a ser incluído: ");
            int valor = scan.nextInt();
            if(valor<15){
                System.out.println("Item incluído na mochila.");
                vetor[tamanho] = valor;
                vetorB[tamanho] = a;
            tamanho++;
            }
            else {
                System.out.println("Item pesado para mochila");
            }
            
        } else
            System.out.println("A mochila está cheia.");
    }

    private static void imprimirMochila() {
        System.out.println("Itens na mochila:");
    
        for (int i = 0; i < tamanho / 2; i++) {
            int temp = vetor[i];
            vetor[i] = vetor[tamanho - 1 - i];
            vetor[tamanho - 1 - i] = temp;
    
            String tempB = vetorB[i];
            vetorB[i] = vetorB[tamanho - 1 - i];
            vetorB[tamanho - 1 - i] = tempB;
        }
    
        for (int i = 0; i < tamanho; i++) {
            System.out.println(vetorB[i] + " - CAPACIDADE: " + vetor[i]);
        }
    }
    private static void ordenarItensPorPeso() {
        for (int i = 0; i < tamanho; i++) {
            for (int j = i + 1; j < tamanho; j++) {
                if (vetor[i] < vetor[j]) {
                    int temp = vetor[i];
                    vetor[i] = vetor[j];
                    vetor[j] = temp;

                    String tempB = vetorB[i];
                    vetorB[i] = vetorB[j];
                    vetorB[j] = tempB;
                }
            }
        }
        System.out.println("Itens ordenados por peso:");
        for (int i = 0; i < tamanho; i++) {
            System.out.println(vetorB[i] + " - peso: " + vetor[i]);
        }
    }
    private static void ordenarItensDaMochila() {
        for (int i = 0; i < tamanho; i++) {
            for (int j = i + 1; j < tamanho; j++) {
                if (vetor[i] > vetor[j]) {
                    int temp = vetor[i];
                    vetor[i] = vetor[j];
                    vetor[j] = temp;

                    String tempB = vetorB[i];
                    vetorB[i] = vetorB[j];
                    vetorB[j] = tempB;
                }
            }
        }
        System.out.println("Itens ordenados da mochila:");
        for (int i = 0; i < tamanho; i++) {
            System.out.println(vetorB[i] + " - CAPACIDADE: " + vetor[i]);
        }
    }

    private static void excluirItemDaMochila(Scanner scan) {
        System.out.print("Informe o nome a ser excluído: ");
        String a = scan.nextLine();
        boolean achou = false;
        for (int i = 0; i < tamanho; i++) {
            if (vetorB[i] == a) {
                achou = true;
                for (int j = i; j < tamanho - 1; j++)
                    vetor[j] = vetor[j + 1];
                tamanho--;
                break;
            }
        }
        if (achou)
            System.out.println("Valor excluído do vetor.");
        else
            System.out.println("Valor não encontrado no vetor.");
    }

}

