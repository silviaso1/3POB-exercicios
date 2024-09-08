//4.  Elabore um programa que leia o sexo de um número indeterminado de pessoas. Ao final escreva a quantidade de pessoas cadastradas e o total de pessoas  de cada sexo

package atividade3;
import java.util.Scanner;

public class exerc4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalPessoas = 0;
        int totalMasculino = 0;
        int totalFeminino = 0;

        while (true) {
            System.out.print("Digite o sexo (M/F) ou 's' para encerrar: ");
            String sexo = scanner.nextLine();

            if (sexo.equalsIgnoreCase("s")) {
                break;
            }

            if (sexo.equalsIgnoreCase("M")) {
                totalMasculino++;
            } else if (sexo.equalsIgnoreCase("F")) {
                totalFeminino++;
            } else {
                System.out.println("Sexo inválido. Digite M para masculino ou F para feminino.");
                continue;
            }

            totalPessoas++;
        }

        System.out.println("Total de pessoas cadastradas: " + totalPessoas);
        System.out.println("Total de pessoas do sexo masculino: " + totalMasculino);
        System.out.println("Total de pessoas do sexo feminino: " + totalFeminino);
    }
}
