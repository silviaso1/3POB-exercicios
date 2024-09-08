//3.  Faça um programa que leia a idade de 10 pessoas. Ao final escreva a média das idades.
package atividade3;
import java.util.Scanner;

public class exerc3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] idades = new int[10];
        int somaIdades = 0;

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite a idade da pessoa " + (i + 1) + ": ");
            idades[i] = scanner.nextInt();
            somaIdades += idades[i];
        }

        double mediaIdades = (double) somaIdades / 10;
        System.out.println("A média das idades é: " + mediaIdades);

        scanner.close();
    }
}
