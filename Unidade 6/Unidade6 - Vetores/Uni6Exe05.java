import java.util.Scanner;

// Com o objetivo de determinar o índice de afinidade entre um rapaz e uma moça cada um respondeu um questionário com
//  5 perguntas, como por exemplo:
// Gosta de música sertaneja?
// Gosta de futebol?
// Gosta de seriados?
// Gosta de redes sociais?
// Gosta da Oktoberfest?
// A resposta a cada pergunta pode ser: SIM, NÃO ou IND (indiferente). O índice de afinidade é medido da seguinte maneira:
// se ambos deram a mesma resposta soma-se 3 pontos ao índice;
// se um respondeu IND e o outro SIM ou NÃO soma-se 1;
// se um respondeu SIM e o outro NÃO subtrai-se 2 ao índice.
// Crie um vetor para armazenar as respostas do rapaz e outro para armazenar as respostas da moça.
//  Crie um método que possa ler tanto as respostas do rapaz como da moça, e outro para calcular e retornar a afinidade.
//   Por fim, escreva a afinidade considerando os seguintes intervalos:
// Afinidade	Mensagem
// 15	“Casem!
// 10 a 14	“Vocês têm muita coisa em comum!”
// 5 a 9	“Talvez não dê certo :(”
// 0 a 4	“Vale um encontro.”
// -1 a -9	“Melhor não perder tempo”
// -10	“Vocês se odeiam!”

public class Uni6Exe05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Vetores para armazenar as respostas do rapaz e da moça
        char[] respostasRapaz = new char[5];
        char[] respostasMoca = new char[5];

        // Perguntas
        String[] perguntas = {
            "Gosta de música sertaneja?",
            "Gosta de futebol?",
            "Gosta de seriados?",
            "Gosta de redes sociais?",
            "Gosta da Oktoberfest?"
        };

        // Leitura das respostas do rapaz
        System.out.println("Respostas do rapaz:");
        for (int i = 0; i < 5; i++) {
            System.out.print(perguntas[i] + " (S/N/I): ");
            respostasRapaz[i] = Character.toUpperCase(scanner.next().charAt(0));
        }

        // Leitura das respostas da moça
        System.out.println("Respostas da moça:");
        for (int i = 0; i < 5; i++) {
            System.out.print(perguntas[i] + " (S/N/I): ");
            respostasMoca[i] = Character.toUpperCase(scanner.next().charAt(0));
        }

        // Cálculo da afinidade
        int afinidade = calcularAfinidade(respostasRapaz, respostasMoca);

        // Exibição da mensagem de afinidade
        escreverAfinidade(afinidade);

        scanner.close();
    }

    // Método para calcular a afinidade entre o rapaz e a moça
    public static int calcularAfinidade(char[] respostasRapaz, char[] respostasMoca) {
        int afinidade = 0;
        for (int i = 0; i < 5; i++) {
            if (respostasRapaz[i] == respostasMoca[i]) {
                afinidade += 3;
            } else if (respostasRapaz[i] == 'I' || respostasMoca[i] == 'I') {
                afinidade += 1;
            } else {
                afinidade -= 2;
            }
        }
        return afinidade;
    }

    // Método para exibir a mensagem de afinidade com base no valor calculado
    public static void escreverAfinidade(int afinidade) {
        System.out.print("Afinidade entre o rapaz e a moça: ");
        if (afinidade == 15) {
            System.out.println("Casem!");
        } else if (afinidade >= 10 && afinidade <= 14) {
            System.out.println("Vocês têm muita coisa em comum!");
        } else if (afinidade >= 5 && afinidade <= 9) {
            System.out.println("Talvez não dê certo :(");
        } else if (afinidade >= 0 && afinidade <= 4) {
            System.out.println("Vale um encontro.");
        } else if (afinidade >= -9 && afinidade <= -1) {
            System.out.println("Melhor não perder tempo.");
        } else if (afinidade == -10) {
            System.out.println("Vocês se odeiam!");
        }
    }
}
