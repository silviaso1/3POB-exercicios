//3.  Faça um programa para solicitar o código, a quantidade de alunos do sexo masculino, a quantidade de alunos do sexo feminino e a quantidade de alunos aprovados de uma determinada turma. Calcular e informar: a porcentagem de alunos do sexo masculino; a porcentagem de alunos do sexo feminino; a porcentagem de alunos reprovados; o total de alunos da turma.

package atividade1;

import java.util.Scanner;

public class exerc3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o código da turma: ");
        String codigo = scanner.nextLine();

        System.out.print("Digite a quantidade de alunos do sexo masculino: ");
        int masculino = scanner.nextInt();

        System.out.print("Digite a quantidade de alunos do sexo feminino: ");
        int feminino = scanner.nextInt();

        System.out.print("Digite a quantidade de alunos aprovados: ");
        int aprovados = scanner.nextInt();

        int totalAlunos = masculino + feminino;
        int reprovados = totalAlunos - aprovados;

        double porcentagemMasculino = (double) masculino / totalAlunos * 100;
        double porcentagemFeminino = (double) feminino / totalAlunos * 100;
        double porcentagemReprovados = (double) reprovados / totalAlunos * 100;

        System.out.printf("Código da turma: %s%n", codigo);
        System.out.printf("Porcentagem de alunos do sexo masculino: %.2f%%%n", porcentagemMasculino);
        System.out.printf("Porcentagem de alunos do sexo feminino: %.2f%%%n", porcentagemFeminino);
        System.out.printf("Porcentagem de alunos reprovados: %.2f%%%n", porcentagemReprovados);
        System.out.printf("Total de alunos da turma: %d%n", totalAlunos);

        scanner.close(); 
    }
}
