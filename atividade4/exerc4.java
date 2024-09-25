/*4.  Construa um programa usando listas que leia o nome e a nota de 10 alunos e ao final escreva:
 a nota média da turma; o nome e a nota dos alunos com resultados superiores a nota média da turma.  */

package atividade4;

import java.util.ArrayList;
import java.util.Scanner;

public class exerc4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> nomes = new ArrayList<>();
        ArrayList<Double> notasAlunos = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o nome do aluno: ");
            nomes.add(scanner.nextLine());

            System.out.print("Digite a nota do aluno: ");
            notasAlunos.add(scanner.nextDouble());
            scanner.nextLine();
        }

        double soma = 0;
        double media;

        for (int i = 0; i < notasAlunos.size(); i++) {
            soma += notasAlunos.get(i);
        }

        media = soma / notasAlunos.size();

        System.out.printf("\nA média da turma é: %.2f\n", media);
        System.out.println("-------------------------------");

        System.out.println("Alunos com notas acima da média:");
        boolean encontrou = false;
        for (int i = 0; i < notasAlunos.size(); i++) {
            if (notasAlunos.get(i) > media) {
                System.out.printf("Nome: %s, Nota: %.2f\n", nomes.get(i), notasAlunos.get(i));
                encontrou = true; 
            }
        }
        
        if (!encontrou) {
            System.out.println("Nenhum aluno possui nota acima da média.");
        }

        scanner.close();
    }
}

