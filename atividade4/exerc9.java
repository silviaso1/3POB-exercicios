/*9.  Elabore um programa que contenha três listas de 10 posições A, B e C.
 O objetivo do programa é armazenar números nas listas A e B e fazer com que 
 a lista C receba a soma dos elementos correspondentes de A e B. Ao final o 
 programa deve exibir no vídeo o conteúdo da lista C. */

package atividade4;

import java.util.ArrayList;
import java.util.Scanner;

public class exerc9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> listaA = new ArrayList<>();
        ArrayList<Integer> listaB = new ArrayList<>();
        ArrayList<Integer> listaC = new ArrayList<>();

        System.out.println("lista A:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            int numero = scanner.nextInt();
            listaA.add(numero);
        }

        System.out.println("lista B:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            int numero = scanner.nextInt();
            listaB.add(numero);
        }

        for (int i = 0; i < 10; i++) {
            int soma = listaA.get(i) + listaB.get(i);
            listaC.add(soma);
        }

        System.out.println("lista C:");
        for (int i = 0; i < 10; i++) {
            System.out.println("Soma na posição " + (i + 1) + ": " + listaC.get(i));
        }


        scanner.close();
    }
}
 
