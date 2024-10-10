//2.  Faça um programa que dado o valor da temperatura em graus FARENHEIT, calcular e escrever o valor da temperatura em graus CELSIUS. Fórmula: C = 5/9 * (F - 32)

package atividade1;

import java.util.Scanner;

public class exerc2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a temperatura em graus Fahrenheit: ");
        double fahrenheit = scanner.nextDouble();
        double celsius = 5.0 / 9.0 * (fahrenheit - 32);
        System.out.printf("A temperatura em graus Celsius é: %.2f°C%n", celsius);
        scanner.close();
    }
}

