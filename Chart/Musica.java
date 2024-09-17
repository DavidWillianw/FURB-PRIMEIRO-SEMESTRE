package Chart;

public class Musica {
    private String nomeArtista;
    private String nomeMusica;
    private int quantidadeLive;
    private int quantidadeCdFisico;
    private int quantidadeDownloadDigital;
    private int quantidadeLiveProgramas;
    private int quantidadeDivulgacaoMarcas;
    private int quantidadeRadio;

    // Construtor
    public Musica(String nomeArtista, String nomeMusica, int quantidadeLive, int quantidadeCdFisico,
                int quantidadeDownloadDigital, int quantidadeLiveProgramas, int quantidadeDivulgacaoMarcas,
                int quantidadeRadio) {
        this.nomeArtista = nomeArtista;
        this.nomeMusica = nomeMusica;
        this.quantidadeLive = quantidadeLive;
        this.quantidadeCdFisico = quantidadeCdFisico;
        this.quantidadeDownloadDigital = quantidadeDownloadDigital;
        this.quantidadeLiveProgramas = quantidadeLiveProgramas;
        this.quantidadeDivulgacaoMarcas = quantidadeDivulgacaoMarcas;
        this.quantidadeRadio = quantidadeRadio;
    }

    // Getters
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

    public int getQuantidadeDownloadDigital() {
        return quantidadeDownloadDigital;
    }

    public int getQuantidadeLiveProgramas() {
        return quantidadeLiveProgramas;
    }

    public int getQuantidadeDivulgacaoMarcas() {
        return quantidadeDivulgacaoMarcas;
    }

    public int getQuantidadeRadio() {
        return quantidadeRadio;
    }
}

