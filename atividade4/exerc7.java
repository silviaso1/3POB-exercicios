/* 7.  Construa um programa que armazene números inteiros em uma lista de 10 posições, 
calcule o quadrado de cada elemento armazenado nesta lista e armazene o resultado em uma outra lista.
 Ao final os dados da segunda lista devem ser exibidos.*/

package atividade4;

import java.util.ArrayList;
import java.util.Scanner;

public class exerc7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> listaQuadrados = new ArrayList<>();
        ArrayList<Integer> listaNumeros = new ArrayList<>();
    

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite um número inteiro: ");
            int numero = scanner.nextInt();
            listaNumeros.add(numero);
        }

        for (int i = 0; i < listaNumeros.size(); i++) {
            int numeroAtual = listaNumeros.get(i); 
            int quadradoAtual = numeroAtual * numeroAtual; 

            listaQuadrados.add(quadradoAtual); 
        }

        System.out.println("Quadrados dos números:");
        for (int i = 0; i < listaQuadrados.size(); i++) {
            int quadrado = listaQuadrados.get(i);
            int numeroOriginal = listaNumeros.get(i); 
            System.out.println("Quadrado de " + numeroOriginal + " é: " + quadrado);
        }


       scanner.close();
    }
}

