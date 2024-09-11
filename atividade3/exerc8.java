package atividade3;
//8. Crie um programa que leia o nome e a altura de 10 pessoas e ao final escreva: a altura média do grupo, o nome e a altura da pessoa mais alta.

import java.util.Scanner;

public class exerc8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nomeMaisAlto = "";
        double alturaMaisAlto = 0;
        double somaAlturas = 0;
        int contador = 0;

        while (contador < 10) {
            System.out.print("Digite o nome da pessoa " + (contador + 1) + ": ");
            String nome = scanner.nextLine();

            System.out.print("Digite a altura da pessoa " + (contador + 1) + " (em metros): ");
            double altura = scanner.nextDouble();
            scanner.nextLine();

            somaAlturas += altura;

            if (altura > alturaMaisAlto) {
                alturaMaisAlto = altura;
                nomeMaisAlto = nome;
            }

            contador++;
        }

        double alturaMedia = somaAlturas / 10;

        System.out.println("A altura média do grupo é: " + alturaMedia + " metros");
        System.out.println("A pessoa mais alta é " + nomeMaisAlto + " com " + alturaMaisAlto + " metros.");
        
        scanner.close();
    }
}
