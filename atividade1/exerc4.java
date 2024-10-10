/*4.  O camelô Zé da banca vende diariamente, games, calculadoras e canetas. Faça um programa para solicitar o total de
games, o total de calculadoras   e o  total de canetas vendidas ao término do dia. O programa deve solicitar também o
preço de cada um dos produtos e ao final calcular e informar o total do faturamento com cada produto e o faturamento total.
 */


package atividade1;

import java.util.Scanner;

public class exerc4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o total de games vendidos: ");
        int totalGames = scanner.nextInt();

        System.out.print("Digite o preço de cada game: ");
        double precoGames = scanner.nextDouble();

        System.out.print("Digite o total de calculadoras vendidas: ");
        int totalCalculadoras = scanner.nextInt();

        System.out.print("Digite o preço de cada calculadora: ");
        double precoCalculadoras = scanner.nextDouble();

        System.out.print("Digite o total de canetas vendidas: ");
        int totalCanetas = scanner.nextInt();

        System.out.print("Digite o preço de cada caneta: ");
        double precoCanetas = scanner.nextDouble();
        double faturamentoGames = totalGames * precoGames;
        double faturamentoCalculadoras = totalCalculadoras * precoCalculadoras;
        double faturamentoCanetas = totalCanetas * precoCanetas;
        double faturamentoTotal = faturamentoGames + faturamentoCalculadoras + faturamentoCanetas;

        System.out.printf("Faturamento com games: R$ %.2f%n", faturamentoGames);
        System.out.printf("Faturamento com calculadoras: R$ %.2f%n", faturamentoCalculadoras);
        System.out.printf("Faturamento com canetas: R$ %.2f%n", faturamentoCanetas);
        System.out.printf("Faturamento total: R$ %.2f%n", faturamentoTotal);

        scanner.close(); 
    }
}
