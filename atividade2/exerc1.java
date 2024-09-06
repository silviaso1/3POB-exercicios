//1.  Faça um programa para solicitar o nome e a idade de uma pessoa. Se sua idade for menor que 18 anos, escrever a mensagem: "É menor".


package atividade2;
import java.util.Scanner;

public class exerc1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nome = scanner.nextLine();

        System.out.println("Digite sua idade: ");
        int idade = scanner.nextInt();

        if (idade < 18) {
            System.out.println(nome + " é menor.");
        } else {
            System.out.println(nome + " é maior.");
        }

        scanner.close();
    }
}
