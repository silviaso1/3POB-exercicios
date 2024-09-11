//7.  Faça um programa que leia vários números inteiros e ao final escreva o maior.

package atividade3;
import java.util.Scanner;

public class exerc7 {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int maior = Integer.MIN_VALUE;
        int numero;

        do {
            System.out.print("Digite um número inteiro (ou 0 para sair): ");
            numero = scanner.nextInt();

            if (numero != 0 && numero > maior) {
                maior = numero;
            }
        } while (numero != 0);

        if (maior == Integer.MIN_VALUE) {
            System.out.println("Nenhum número foi digitado.");
        } else {
            System.out.println("O maior número digitado foi: " + maior);
        }

        scanner.close();
    
}

}
