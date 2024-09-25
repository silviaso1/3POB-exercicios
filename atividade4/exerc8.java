/* 8.  Faça um programa utilizando listas que leia 9 números inteiros. 
Ao final o programa deve informar o maior número, aquantidade de vezes 
que ele ocorre e em quais posições da lista.*/

package atividade4;

import java.util.ArrayList;
import java.util.Scanner;

public class exerc8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> numeros = new ArrayList<>();

        for (int i = 0; i < 9; i++) {
            System.out.print("Digite um número inteiro: ");
            int numero = scanner.nextInt(); 
            numeros.add(numero);
        }

        int maior = numeros.get(0);
        int ocorrencias = 0;
        ArrayList<Integer> indices = new ArrayList<>();

        for (int i = 0; i < numeros.size(); i++) {
            int atual = numeros.get(i);

            if (atual > maior) {
                maior = atual; 
                ocorrencias = 1; 
                indices.clear(); 
                indices.add(i); 
            } else if (atual == maior) {
                ocorrencias++;
                indices.add(i); 
            }
        }

        System.out.println("O maior número é: " + maior);
        System.out.println("Quantidade de vezes que ocorre: " + ocorrencias);
        System.out.print("Posições: ");

        for (int i = 0; i < indices.size(); i++) {
            System.out.print(indices.get(i));
            if (i < indices.size() - 1) {
                System.out.print(", "); 
            }
        }

        scanner.close();
    }
}

