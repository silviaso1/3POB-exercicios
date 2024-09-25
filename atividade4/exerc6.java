/* 6.  Elabore um programa utilizando listas para armazenar 10 números e ao final escreva a quantidade 
de números negativos, positivos e nulos.*/

package atividade4;

import java.util.ArrayList;
import java.util.Scanner;

public class exerc6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> numeros = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite um número: ");
            numeros.add(scanner.nextInt());
        }

        int positivos = 0;
        int negativos = 0;
        int nulos = 0;

        for (int i = 0; i < numeros.size(); i++) {
            int numero = numeros.get(i);
            if (numero > 0) {
                positivos++;
            } else if (numero < 0) {
                negativos++;
            } else {
                nulos++;
            }
        }
        System.out.println("Positivos: " + positivos);
        System.out.println("Negativos: " + negativos);
        System.out.println("Nulos: " + nulos);

        scanner.close();
    }
}

