//5.  Elabore um programa para solicitar o nome de uma equipe de futebol, a quantidade de derrotas, empates e vitórias obtidas por ela no campeonato. Calcular e informar: a quantidade de pontos ganhos e a quantidade de pontos perdidos.

package atividade1;

import java.util.Scanner;

public class exerc5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome da equipe de futebol: ");
        String nomeEquipe = scanner.nextLine();

        System.out.print("Digite a quantidade de vitórias: ");
        int vitorias = scanner.nextInt();

        System.out.print("Digite a quantidade de empates: ");
        int empates = scanner.nextInt();

        System.out.print("Digite a quantidade de derrotas: ");
        int derrotas = scanner.nextInt();

        int pontosGanhos = (vitorias * 3) + empates; 
        int pontosPerdidos = derrotas; 

        System.out.printf("A equipe %s obteve:%n", nomeEquipe);
        System.out.printf("Pontos ganhos: %d%n", pontosGanhos);
        System.out.printf("Pontos perdidos: %d%n", pontosPerdidos);

        scanner.close(); 
    }
}
