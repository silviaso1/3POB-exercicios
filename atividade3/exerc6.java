//6.  Elabore um programa que leia a idade de diversas pessoas e ao final informe: o total de pessoas cadastradas, a porcentagem de pessoas com idade inferior a 18 anos, a porcentagem de pessoas com idade igual ou superior a 18 anos.


package atividade3;

import java.util.Scanner;

public class exerc6{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalPessoas = 0;
        int pessoasMenores18 = 0;
        int pessoasMaioresOuIguais18 = 0;

        while (true) {
            System.out.print("Digite a idade da pessoa ou -1 para encerrar: ");
            int idade = scanner.nextInt();

            if (idade == -1) {
                break;
            }

            totalPessoas++;

            if (idade < 18) {
                pessoasMenores18++;
            } else {
                pessoasMaioresOuIguais18++;
            }
        }

        if (totalPessoas > 0) {
            double porcentagemMenores18 = (double) pessoasMenores18 / totalPessoas * 100;
            double porcentagemMaioresOuIguais18 = (double) pessoasMaioresOuIguais18 / totalPessoas * 100;

            System.out.println("Total de pessoas cadastradas: " + totalPessoas);
            System.out.println("Porcentagem de pessoas com idade inferior a 18 anos: " + porcentagemMenores18 + "%");
            System.out.println("Porcentagem de pessoas com idade igual ou superior a 18 anos: " + porcentagemMaioresOuIguais18 + "%");
        } else {
            System.out.println("nenhuma pessoa foi cadastrada");
            
        }
    }
}

