package ProjetoCarla;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class App {
    public static void main(String[] args) {
        SaldoBancario[] contas = new SaldoBancario[3]; // Array para armazenar até 3 contas
        boolean continuar = true;
        DecimalFormat df = new DecimalFormat("0.00");
        double saldoConjunto = 0; 
        while (continuar) {
            String menu = "Escolha uma opção:\n" +
                    "A: Adicionar saldo\n" +
                    "V: Ver saldo total\n" +
                    "S: Sacar saldo\n" +
                    "E: Encerrar";
            char opcao = JOptionPane.showInputDialog(menu).charAt(0);

            switch (opcao) {
                case 'A':
                    
                    for (int i = 0; i < contas.length; i++) {
                        if (contas[i] == null) {
                            double novoSalario = Double.parseDouble(JOptionPane.showInputDialog("Informe o salário"));
                            SaldoBancario novaConta = new SaldoBancario();
                            novaConta.setNome(JOptionPane.showInputDialog("Informe seu nome"));
                            novaConta.setSalario(novoSalario);
                            contas[i] = novaConta;
                            
                            saldoConjunto += novoSalario;
                            break;
                        }
                    }

                    for (SaldoBancario conta : contas) {
                        if (conta != null) {
                            conta.atualizarSaldo(saldoConjunto);
                        }
                    }
                    break;

                case 'V':
                    DefaultTableModel tabela = new DefaultTableModel();
                    tabela.addColumn("Nome");
                    tabela.addColumn("Salário Total");
                    tabela.addColumn("Saldo Atual");
                    tabela.addColumn("Saldo Gasto");

                    double saldoTotalGeral = 0;
                    double totalSacadoGeral = 0;

                    for (SaldoBancario conta : contas) {
                        if (conta != null) {
                            saldoTotalGeral += conta.getSaldo();
                            totalSacadoGeral += conta.getTotalSacado();

                            tabela.addRow(new Object[]{
                                conta.getNome(),
                                df.format(conta.getSalario()),
                                df.format(conta.getSaldo()),
                                df.format(conta.getTotalSacado())
                            });
                        }
                    }

                    JTable tabelaFunc = new JTable(tabela);
                    JScrollPane scrollPane = new JScrollPane(tabelaFunc);

                    JOptionPane.showMessageDialog(null, scrollPane, "Lista de Contas",
                            JOptionPane.INFORMATION_MESSAGE);
                    break;

                case 'S':
                    double valorSaque = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor a sacar"));
                    boolean saqueRealizado = false;

                    for (SaldoBancario conta : contas) {
                        if (conta != null) {
                            if (valorSaque <= conta.getSaldo()) {
                                conta.sacar(valorSaque);
                                saqueRealizado = true;
                            } else {
                                JOptionPane.showMessageDialog(null, "Saldo insuficiente em uma das contas.");
                                break;
                            }
                        }
                    }

                    if (saqueRealizado) {
                        // Atualiza o saldo conjunto após o saque
                        saldoConjunto -= valorSaque;
                        for (SaldoBancario conta : contas) {
                            if (conta != null) {
                                conta.atualizarSaldo(saldoConjunto);
                            }
                        }
                        JOptionPane.showMessageDialog(null, "Saque realizado com sucesso!");
                    }
                    break;

                case 'E':
                    continuar = false;
                    JOptionPane.showMessageDialog(null, "Encerrando o aplicativo.");
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida. Tente novamente.");
                    break;
            }
        }
    }
}
