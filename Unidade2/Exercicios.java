// import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicios {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

    //   // Uni2Exe01
    //   int num1 = scanner.nextInt();
    //   int num2 = scanner.nextInt();
    //   System.out.println(num1 + num2);

    //   // Uni2Exe02
    //   num1 = scanner.nextInt();
    //   num2 = scanner.nextInt();
    //   System.out.println(num1 * num2);

    //   // Uni2Exe03
    //   double raio = scanner.nextDouble();
    //   double areaCirculo = Math.PI * Math.pow(raio, 2);
    //   System.out.printf("%.4f\n", areaCirculo);

    //   // Uni2Exe04
    //   double notaA = scanner.nextDouble();
    //   double notaB = scanner.nextDouble();
    //   double media = (notaA * 3.5 + notaB * 7.5) / 11;
    //   System.out.printf("MEDIA = %.5f\n", media);

    //   // Uni2Exe05
    //   int A = scanner.nextInt();
    //   int B = scanner.nextInt();
    //   int C = scanner.nextInt();
    //   int D = scanner.nextInt();
    //   int diferenca = (A * B - C * D);
    //   System.out.println("DIFERENCA = " + diferenca);

    //   // Uni2Exe06
    //   int numeroFuncionario = scanner.nextInt();
    //   int horasTrabalhadas = scanner.nextInt();
    //   double valorPorHora = scanner.nextDouble();
    //   double salario = horasTrabalhadas * valorPorHora;
    //   System.out.println("NUMBER = " + numeroFuncionario);
    //   System.out.printf("SALARY = U$ %.2f\n", salario);

    //   // Uni2Exe07
    //   String nomeVendedor = scanner.next();
    //   double salarioFixo = scanner.nextDouble();
    //   double totalVendas = scanner.nextDouble();
    //   double salarioFinal = salarioFixo + (totalVendas * 0.15);
    //   System.out.printf("TOTAL = R$ %.2f\n", salarioFinal);

    //   // Uni2Exe08
    //   int codigoPeca1 = scanner.nextInt();
    //   int numPecas1 = scanner.nextInt();
    //   double valorUnitario1 = scanner.nextDouble();
    //   int codigoPeca2 = scanner.nextInt();
    //   int numPecas2 = scanner.nextInt();
    //   double valorUnitario2 = scanner.nextDouble();
    //   double totalPagar = (numPecas1 * valorUnitario1) + (numPecas2 * valorUnitario2);
    //   System.out.printf("VALOR A PAGAR: R$ %.2f\n", totalPagar);

    //   // Uni2Exe09 

    // System.out.println("Informe o valor em dólares:");
    // double valorDolares = scanner.nextDouble();

    // double cotação = 5.00;

    // double valorReais = valorDolares * cotação;

    // DecimalFormat formato = new DecimalFormat("#0.00");
    // System.out.println("O atendente deve devolver " + formato.format(valorReais) + " reais.");

    //   // Uni2Exe10
    //   int tempoSegundos = scanner.nextInt();
    //   int horas = tempoSegundos / 3600;
    //   int minutos = (tempoSegundos % 3600) / 60;
    //   int segundos = (tempoSegundos % 3600) % 60;
    //   System.out.printf("%d:%d:%d\n", horas, minutos, segundos);

    //   // Uni2Exe11
    //   double valorA = scanner.nextDouble();
    //   double valorB = scanner.nextDouble();
    //   double valorC = scanner.nextDouble();
    //   double areaTriangulo = (valorA * valorC) / 2;
    //   double areaCirc = Math.PI * Math.pow(valorC, 2);
    //   double areaTrapezio = ((valorA + valorB) * valorC) / 2;
    //   double areaQuadrado = Math.pow(valorB, 2);
    //   double areaRetangulo = valorA * valorB;
    //   System.out.printf("TRIANGULO: %.3f\n", areaTriangulo);
    //   System.out.printf("CIRCULO: %.3f\n", areaCirc);
    //   System.out.printf("TRAPEZIO: %.3f\n", areaTrapezio);
    //   System.out.printf("QUADRADO: %.3f\n", areaQuadrado);
    //   System.out.printf("RETANGULO: %.3f\n", areaRetangulo);

    //   // Uni2Exe12
    //   double x1 = scanner.nextDouble();
    //   double y1 = scanner.nextDouble();
    //   double x2 = scanner.nextDouble();
    //   double y2 = scanner.nextDouble();
    //   double distancia = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    //   System.out.printf("%.4f\n", distancia);

    //   // Uni2Exe13
    //   int distanciaCarroY = scanner.nextInt();
    //   int tempoMinutos = (distanciaCarroY * 60) / 30;
    //   System.out.println(tempoMinutos);

    //   // Uni2Exe14 
//     int VALOR, AUX;

// int C100, C50, C20, C10, C5, C2, C1;

// VALOR = scanner.nextInt();

// AUX = VALOR;

// C100 = VALOR/100;

// AUX = AUX - (C100*100);

// C50 = AUX/50;

// AUX = AUX - (C50*50);

// C20 = AUX/20;

// AUX = AUX - (C20*20);

// C10 = AUX/10;

// AUX = AUX - (C10*10);

// C5 = AUX/5;

// AUX = AUX - (C5*5);

// C2 = AUX/2;

// AUX = AUX - (C2*2);

// C1 = AUX;

// System.out.println(VALOR);

// System.out.println(C100 + " nota(s) de R$ 100,00");
// System.out.println(C50 + " nota(s) de R$ 50,00");
// System.out.println(C20 + " nota(s) de R$ 20,00");
// System.out.println(C10 + " nota(s) de R$ 10,00");
// System.out.println(C5 + " nota(s) de R$ 5,00");
// System.out.println(C2 + " nota(s) de R$ 2,00");
// System.out.println(C1 + " nota(s) de R$ 1,00");

    //   // Uni2Exe15
    //   double valorMonetario = scanner.nextDouble();
    //   int notas100 = (int) (valorMonetario / 100);
    //   valorMonetario %= 100;
    //   int notas50 = (int) (valorMonetario / 50);
    //   valorMonetario %= 50;
    //   int notas20 = (int) (valorMonetario / 20);
    //   valorMonetario %= 20;
    //   int notas10 = (int) (valorMonetario / 10);
    //   valorMonetario %= 10;
    //   int notas5 = (int) (valorMonetario / 5);
    //   valorMonetario %= 5;
    //   int notas2 = (int) (valorMonetario / 2);
    //   valorMonetario %= 2;
    //   int moedas1 = (int) (valorMonetario / 1);
    //   valorMonetario %= 1;
    //   int moedas050 = (int) (valorMonetario / 0.50);
    //   valorMonetario %= 0.50;
    //   int moedas025 = (int) (valorMonetario / 0.25);
    //   valorMonetario %= 0.25;
    //   int moedas010 = (int) (valorMonetario / 0.10);
    //   valorMonetario %= 0.10;
    //   int moedas005 = (int) (valorMonetario / 0.05);
    //   valorMonetario %= 0.05;
    //   int moedas001 = (int) (valorMonetario / 0.01);
    //   System.out.println("NOTAS:");
    //   System.out.println(notas100 + " nota(s) de R$ 100.00");
    //   System.out.println(notas50 + " nota(s) de R$ 50.00");
    //   System.out.println(notas20 + " nota(s) de R$ 20.00");
    //   System.out.println(notas10 + " nota(s) de R$ 10.00");
    //   System.out.println(notas5 + " nota(s) de R$ 5.00");
    //   System.out.println(notas2 + " nota(s) de R$ 2.00");
    //   System.out.println("MOEDAS:");
    //   System.out.println(moedas1 + " moeda(s) de R$ 1.00");
    //   System.out.println(moedas050 + " moeda(s) de R$ 0.50");
    //   System.out.println(moedas025 + " moeda(s) de R$ 0.25");
    //   System.out.println(moedas010 + " moeda(s) de R$ 0.10");
    //   System.out.println(moedas005 + " moeda(s) de R$ 0.05");
    //   System.out.println(moedas001 + " moeda(s) de R$ 0.01");

    //   // Uni2Exe16
    //   int latas = scanner.nextInt();
    //   int garrafas600ml = scanner.nextInt();
    //   int garrafas2litros = scanner.nextInt();
    //   double litrosTotais = (latas * 0.35) + (garrafas600ml * 0.6) + (garrafas2litros * 2);
    //   System.out.println(litrosTotais);

    //   // Uni2Exe17
    //   String nomeFuncionario = scanner.next();
    //   int horasTrabalhadas = scanner.nextInt();
    //   int dependentes = scanner.nextInt();
    //   double salarioTrabalho = horasTrabalhadas * 10.00;
    //   double salarioFamilia = dependentes * 60.00;
    //   double salarioBruto = salarioTrabalho + salarioFamilia;
    //   double inss = salarioTrabalho * 0.085;
    //   double impostoRenda = salarioTrabalho * 0.05;
    //   double salarioLiquido = salarioBruto - inss - impostoRenda;
    //   System.out.println("NOME: " + nomeFuncionario);
    //   System.out.printf("SALARIO BRUTO: R$ %.2f\n", salarioBruto);
    //   System.out.printf("INSS: R$ %.2f\n", inss);
    //   System.out.printf("IMPOSTO DE RENDA: R$ %.2f\n", impostoRenda);
    //   System.out.printf("SALARIO LIQUIDO: R$ %.2f\n", salarioLiquido);

    //   // Uni2Exe18
    //   double comprimento = scanner.nextDouble();
    //   double altura = scanner.nextDouble();
    //   double areaParede = comprimento * altura;
    //   int quantidadeAzulejos = (int) (areaParede / 1); // 1 metro quadrado é formado por 9 azulejos
    //   double valorGasto = quantidadeAzulejos * 12.50;
    //   System.out.printf("VALOR GASTO: R$ %.2f\n", valorGasto);

    //   // Uni2Exe19
    //   double B = scanner.nextDouble();
    //   double C = scanner.nextDouble();
    //   double D = scanner.nextDouble();
    //   double A = B;
    //   System.out.println("Valor de A: " + A);

    // UNI2Exe20 

    // int numDobras = scanner.nextInt();
    // int numQuadrados = (int) Math.pow(2, numDobras / 2);

    // System.out.println("Número de quadrados visíveis: " + numQuadrados);

    scanner.close();
    }
}