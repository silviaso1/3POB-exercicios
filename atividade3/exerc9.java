//.  A conversão de graus Farenheit para graus centígrados é obtida por : C = 5/9 * (F -32). Faça um programa que calcule e escreva uma tabela de centígrados em função de graus Farenheit, que variam de 100 a 150 de 1 em 1.

package atividade3;

public class exerc9 {
     public static void main(String[] args) {
        System.out.println("Fahrenheit\tCelsius");
        
        for (int f = 100; f <= 150; f++) {
            double celsius = 5.0 / 9.0 * (f - 32);
            System.out.printf("%d\t\t%.2f\n", f, celsius);
        }
    }
}
