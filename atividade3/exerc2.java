//2.  Faça um programa que calcule e escreva no vídeo o somatório dos números inteiros de 1 até 50.

package atividade3;
import java.util.Scanner;

public class exerc2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int soma = 0;
        for (int i = 1; i <= 50; i++){
            soma += i;
            
        }
        System.out.println("A soma dos números de 1 a 50 é: " + soma);
        
        scanner.close();       
    }
}
