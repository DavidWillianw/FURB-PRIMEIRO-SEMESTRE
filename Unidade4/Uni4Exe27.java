package Unidade4;

import java.util.Scanner;

public class Uni4Exe27 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o horário de chegada (hora e minuto):");
        int horaChegada = scanner.nextInt();
        int minutoChegada = scanner.nextInt();

        System.out.println("Digite o horário de partida (hora e minuto):");
        int horaPartida = scanner.nextInt();
        int minutoPartida = scanner.nextInt();
        scanner.close();


        if (horaChegada < 0 || horaChegada > 23 || minutoChegada < 0 || minutoChegada > 59 ||
                horaPartida < 0 || horaPartida > 23 || minutoPartida < 0 || minutoPartida > 59) {
            System.out.println("Horário inválido!");
            return;
        }

        int tempoTotalMinutos = (horaPartida - horaChegada) * 60 + (minutoPartida - minutoChegada);
        if (tempoTotalMinutos < 0) {
            tempoTotalMinutos += 24 * 60;
        }

        int horas = tempoTotalMinutos / 60;
        int minutos = tempoTotalMinutos % 60;

        if (minutos >= 30) {
            horas++;
        }

        double preco = 0;
        if (horas <= 2) {
            preco = horas * 5.0;
        } else if (horas <= 4) {
            preco = 2 * 5.0 + (horas - 2) * 7.5;
        } else {
            preco = 2 * 5.0 + 2 * 7.5 + (horas - 4) * 10.0;
        }

        System.out.println("Tempo de estacionamento: " + horas + " hora(s)");
        System.out.println("Preço a ser cobrado: R$ " + preco);
    }
}