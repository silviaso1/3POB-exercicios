//10. Elabore um programa que leia diversos números e ao final escreva: a quantidade de números digitados, a quantidade de números pares, a quantidade de números ímpares.54

package atividade3;
import java.util.Scanner;

public class exerc10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int quantidadeTotal = 0;
        int quantidadePares = 0;
        int quantidadeImpares = 0;

        while (true) {
            System.out.print("Digite um número (ou um número negativo para sair): ");
            int numero = scanner.nextInt();

            if (numero < 0) {
                break;
            }

            quantidadeTotal++;

            if (numero % 2 == 0) {
                quantidadePares++;
            } else {
                quantidadeImpares++;
            }
        }

        System.out.println("Quantidade total de números digitados: " + quantidadeTotal);
        System.out.println("Quantidade de números pares: " + quantidadePares);
        System.out.println("Quantidade de números ímpares: " + quantidadeImpares);
        
        scanner.close();
    }
}
