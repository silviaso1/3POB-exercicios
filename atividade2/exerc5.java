//5.  Faça um programa que leia dois números e mostre qual o maior dos dois. O programa deve informar caso sejam iguais.
package atividade2;
import java.util.Scanner;

public class exerc5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o primeiro número: ");
        int num1 = scanner.nextInt();
        System.out.println("Digite o segundo número: ");
        int num2 = scanner.nextInt();
        if (num1 > num2){
            System.out.println("O primeiro número é maior que o segundo número.");
        }
        else{
            if (num1 < num2){
                System.out.println("O segundo número é maior que o primeiro número.");
            }
            else{
                System.out.println("Os números são iguais.");
            }
        }
        scanner.close();
    }
}