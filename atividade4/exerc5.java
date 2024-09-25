/* *5.  Faça um programa utilizando listas que leia 10 números inteiros e ao final escreva estes números 
na ordem crescente e na ordem decrescente.*/

package atividade4;

import java.util.ArrayList;
import java.util.Scanner;

public class exerc5 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        ArrayList<Integer> listaNumeros = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite um número inteiro: ");
            listaNumeros.add(entrada.nextInt());
        }

        for (int i = 0; i < listaNumeros.size() - 1; i++) {
            for (int j = 0; j < listaNumeros.size() - 1 - i; j++) {
                if (listaNumeros.get(j) > listaNumeros.get(j + 1)) {
                    // Troca de posição
                    int auxiliar = listaNumeros.get(j);
                    listaNumeros.set(j, listaNumeros.get(j + 1));
                    listaNumeros.set(j + 1, auxiliar);
                }
            }
        }

        System.out.println("\nNúmeros em ordem crescente:");
        for (int i = 0; i < listaNumeros.size(); i++) {
            int numero = listaNumeros.get(i);
            System.out.println(numero);
        }

        for (int i = 0; i < listaNumeros.size() - 1; i++) {
            for (int j = 0; j < listaNumeros.size() - 1 - i; j++) {
                if (listaNumeros.get(j) < listaNumeros.get(j + 1)) {
                    int auxiliar = listaNumeros.get(j);
                    listaNumeros.set(j, listaNumeros.get(j + 1));
                    listaNumeros.set(j + 1, auxiliar);
                }
            }
        }

        System.out.println("\nNúmeros em ordem decrescente:");
        for (int i = 0; i < listaNumeros.size(); i++) {
            int numero = listaNumeros.get(i);
            System.out.println(numero);
        }

        entrada.close();
    }
}
