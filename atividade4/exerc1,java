//1.  Faça um programa utilizando listas que leia o nome e a altura de 50 pessoas e ao final escreva o nome e a altura das pessoas com mais de 1,70 metros.

package atividade4;

import java.util.ArrayList;
import java.util.Scanner;

public class exerc1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> nomes = new ArrayList<>();  
        ArrayList<Double> alturas = new ArrayList<>();

        for (int i = 0; i < 50; i++) {
            System.out.print("Digite o nome da pessoa " + (i + 1) + ": ");
            nomes.add(scanner.nextLine()); 

            System.out.print("Digite a altura da pessoa " + (i + 1) + " (em metros): ");
            alturas.add(scanner.nextDouble()); 
            scanner.nextLine(); 
        }

        System.out.println("\nPessoas com mais de 1,70 metros:");
        for (int i = 0; i < nomes.size(); i++) {
            if (alturas.get(i) > 1.70) { 
                System.out.println("Nome: " + nomes.get(i) + ", Altura: " + alturas.get(i) + " metros");
            }
        }

        scanner.close(); 
    }
}
