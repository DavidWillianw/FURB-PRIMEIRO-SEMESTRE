package Chart;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ProgramaChart {
    public static class Musica {
        private String nomeArtista;
        private String nomeMusica;
        private int quantidadeLive;
        private int quantidadeCdFisico;
        private int quantidadeVersoesDigitais;
        private int quantidadeLiveProgramas;
        private int quantidadeDivulgacaoMarcas;
        private int quantidadeEntrevistasRadio;

        public Musica(String nomeArtista, String nomeMusica, int quantidadeLive, int quantidadeCdFisico,
                      int quantidadeVersoesDigitais, int quantidadeLiveProgramas, int quantidadeDivulgacaoMarcas,
                      int quantidadeEntrevistasRadio) {
            this.nomeArtista = nomeArtista;
            this.nomeMusica = nomeMusica;
            this.quantidadeLive = quantidadeLive;
            this.quantidadeCdFisico = quantidadeCdFisico;
            this.quantidadeVersoesDigitais = quantidadeVersoesDigitais;
            this.quantidadeLiveProgramas = quantidadeLiveProgramas;
            this.quantidadeDivulgacaoMarcas = quantidadeDivulgacaoMarcas;
            this.quantidadeEntrevistasRadio = quantidadeEntrevistasRadio;
        }

        public String getNomeArtista() {
            return nomeArtista;
        }

        public String getNomeMusica() {
            return nomeMusica;
        }

        public int getQuantidadeLive() {
            return quantidadeLive;
        }

        public int getQuantidadeCdFisico() {
            return quantidadeCdFisico;
        }

        public int getQuantidadeVersoesDigitais() {
            return quantidadeVersoesDigitais;
        }

        public int getQuantidadeLiveProgramas() {
            return quantidadeLiveProgramas;
        }

        public int getQuantidadeDivulgacaoMarcas() {
            return quantidadeDivulgacaoMarcas;
        }

        public int getQuantidadeEntrevistasRadio() {
            return quantidadeEntrevistasRadio;
        }
    }

    private List<Musica> musicas;

    public ProgramaChart() {
        this.musicas = new ArrayList<>();
    }

    public void adicionarMusica(Musica musica) {
        musicas.add(musica);
    }

    public List<Musica> gerarTop10() {
        // Ordenar as músicas com base na pontuação
        Collections.sort(musicas, (m1, m2) -> calcularPontuacao(m2) - calcularPontuacao(m1));

        // Retornar as 10 primeiras músicas (ou menos, se houver menos de 10 músicas)
        return musicas.subList(0, Math.min(10, musicas.size()));
    }

    private int calcularPontuacao(Musica musica) {
        // Definir a lógica de pontuação com base nos critérios fornecidos
        int pontuacao = musica.getQuantidadeLive() * 5 +
                        musica.getQuantidadeCdFisico() * 3 +
                        musica.getQuantidadeVersoesDigitais() * 2 +
                        musica.getQuantidadeLiveProgramas() * 4 +
                        musica.getQuantidadeDivulgacaoMarcas() * 3 +
                        musica.getQuantidadeEntrevistasRadio() * 3;
        return pontuacao;
    }

    public static void main(String[] args) {
        // Criar um programa chart
        ProgramaChart programaChart = new ProgramaChart();

        // Utilizar Scanner para entrada de dados do usuário
        Scanner scanner = new Scanner(System.in);

        // Loop para adicionar várias músicas
        boolean continuar = true;
        while (continuar) {
            System.out.println("Digite o nome do artista:");
            String nomeArtista = scanner.nextLine();

            System.out.println("Digite o nome da música:");
            String nomeMusica = scanner.nextLine();

            System.out.println("Digite a quantidade de lives:");
            int quantidadeLive = scanner.nextInt();
            scanner.nextLine(); // Consumir a quebra de linha após o nextInt()

            System.out.println("Digite a quantidade de CDs físicos:");
            int quantidadeCdFisico = scanner.nextInt();
            scanner.nextLine(); // Consumir a quebra de linha após o nextInt()

            System.out.println("Digite a quantidade de versões digitais lançadas pelo artista:");
            int quantidadeVersoesDigitais = scanner.nextInt();
            scanner.nextLine(); // Consumir a quebra de linha após o nextInt()

            System.out.println("Digite a quantidade de lives em programas de música:");
            int quantidadeLiveProgramas = scanner.nextInt();
            scanner.nextLine(); // Consumir a quebra de linha após o nextInt()

            System.out.println("Digite a quantidade de divulgações com marcas:");
            int quantidadeDivulgacaoMarcas = scanner.nextInt();
            scanner.nextLine(); // Consumir a quebra de linha após o nextInt()

            System.out.println("Digite a quantidade de entrevistas em rádio:");
            int quantidadeEntrevistasRadio = scanner.nextInt();
            scanner.nextLine(); // Consumir a quebra de linha após o nextInt()

            // Criar e adicionar a música à lista
            Musica musica = new Musica(nomeArtista, nomeMusica, quantidadeLive, quantidadeCdFisico,
                                        quantidadeVersoesDigitais, quantidadeLiveProgramas,
                                        quantidadeDivulgacaoMarcas, quantidadeEntrevistasRadio);
            programaChart.adicionarMusica(musica);

            // Verificar se deseja adicionar mais músicas
            System.out.println("Deseja adicionar outra música? (s/n)");
            String resposta = scanner.nextLine();
            if (!resposta.equalsIgnoreCase("s")) {
                continuar = false;
            }
        }

        // Gerar e exibir o top 10
        List<Musica> top10 = programaChart.gerarTop10();
        System.out.println("\nTop 10 do Programa Chart:");
        for (int i = 0; i < top10.size(); i++) {
            Musica musica = top10.get(i);
            int pontos = programaChart.calcularPontuacao(musica);
            System.out.println((i + 1) + ". " + musica.getNomeArtista() + " - " + musica.getNomeMusica() + " (" + pontos + " pontos)");
        }

        // Fechar o scanner
        scanner.close();
    }
}
