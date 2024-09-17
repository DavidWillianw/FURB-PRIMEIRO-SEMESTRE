package ProjetoCarla;

public class SaldoBancario {
    private double saldo;
    private String nome;
    private double totalSacado;
    private double salario;

    // Método para realizar o saque
    void sacar(double valor) {
        if (valor > 0 && valor <= this.saldo) {
            this.saldo -= valor;
            this.totalSacado += valor;
        }
    }

    // Método para converter salário em saldo
    public void converterSalarioParaSaldo(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    // Método para atualizar o saldo em todas as contas
    public void atualizarSaldo(double saldoConjunto) {
        this.saldo = saldoConjunto;
    }

    // Métodos getters e setters
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setTotalSacado(double totalSacado) {
        this.totalSacado = totalSacado;
    }

    public double getTotalSacado() {
        return totalSacado;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }
}
