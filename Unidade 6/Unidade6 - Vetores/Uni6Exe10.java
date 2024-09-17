import java.util.Scanner;

public class Uni6Exe10 {
    private static final int CAPACIDADE = 50;
    private static int[] vetor = new int[CAPACIDADE];
    private static int tamanho = 0;

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int opcao;
        
        do {
            mostrarMenu();
            opcao = teclado.nextInt();
            switch (opcao) {
                case 1:
                    incluirValor(teclado);
                    break;
                case 2:
                    pesquisarValor(teclado);
                    break;
                case 3:
                    alterarValor(teclado);
                    break;
                case 4:
                    excluirValor(teclado);
                    break;
                case 5:
                    mostrarValores();
                    break;
                case 6:
                    ordenarValores();
                    break;
                case 7:
                    inverterValores();
                    break;
                case 8:
                    System.out.println("Saindo do sistema...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        }while (opcao != 6);
        teclado.close();
    }
    private static void mostrarMenu() {
        System.out.println("Menu:");
        System.out.println("1) Incluir valor");
        System.out.println("2) Pesquisar valor");
        System.out.println("3) Alterar valor");
        System.out.println("4) Excluir valor");
        System.out.println("5) Mostrar valores");
        System.out.println("6) Ordenar valores");
        System.out.println("7) Inverter valores");
        System.out.println("8) Sair do sistema");
        System.out.print("Escolha uma opção: ");
    }

    private static void incluirValor(Scanner teclado) {
        if (tamanho < CAPACIDADE) {
            System.out.print("Informe o valor a ser incluído: ");
            int valor = teclado.nextInt();
            vetor[tamanho++] = valor;
            System.out.println("Valor incluído no vetor.");
        } else
            System.out.println("Não há espaço disponível no vetor.");
    }

    private static void pesquisarValor(Scanner teclado) {
        System.out.print("Informe o valor a ser pesquisado: ");
        int valor = teclado.nextInt();
        boolean achou = false;
        for (int i = 0; i < tamanho; i++) {
            if (vetor[i] == valor) {
                achou = true;
                break;
            }
        }
        if (achou)
            System.out.println("Valor encontrado no vetor.");
        else
            System.out.println("Valor não encontrado no vetor.");
    }

    private static void alterarValor(Scanner teclado) {
        System.out.print("Informe o valor a ser alterado: ");
        int valorAntigo = teclado.nextInt();
        System.out.print("Informe o novo valor: ");
        int valorNovo = teclado.nextInt();
        boolean encontrado = false;
        for (int i = 0; i < tamanho; i++) {
            if (vetor[i] == valorAntigo) {
                vetor[i] = valorNovo;
                encontrado = true;
                break;
            }
        }
        if (encontrado)
            System.out.println("Valor alterado com sucesso.");
        else
            System.out.println("Número não encontrado.");
    }

    private static void excluirValor(Scanner teclado) {
        System.out.print("Informe o valor a ser excluído: ");
        int valor = teclado.nextInt();
        boolean achou = false;
        for (int i = 0; i < tamanho; i++) {
            if (vetor[i] == valor) {
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

    private static void mostrarValores() {
        System.out.print("Valores armazenados no vetor: ");
        for (int i = 0; i < tamanho; i++)
            System.out.print(vetor[i] + " ");
        System.out.println();
    }

    private static void ordenarValores() {
        for (int i = 0; i < tamanho - 1; i++) {
            for (int j = 0; j < tamanho - 1 - i; j++) {
                if (vetor[j] > vetor[j + 1]) {
                    int temp = vetor[j];
                    vetor[j] = vetor[j + 3];
                    vetor[j + 1] = temp;
                }
            }
        }
        System.out.println("Valores ordenados com sucesso.");
    }

    private static void inverterValores() {
        for (int i = 0; i < tamanho / 2; i++) {
            int temp = vetor[i];
            vetor[i] = vetor[tamanho - 1 - i];
            vetor[tamanho - 1 - i] = temp;
        }
        System.out.println("Valores invertidos com sucesso.");
    }
}