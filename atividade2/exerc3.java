//3.  Faça um programa para solicitar o nome e as duas notas e um aluno. Calcular sua média e informá-la. Se ela for inferior a 7, escrever "Reprovado”; caso contrário escrever "Aprovado".

package atividade2;
import java.util.Scanner;

public class exerc3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o nome do aluno: ");
        String nome = scanner.nextLine();
        System.out.print("Digite a primeira nota: ");
        double nota1 = scanner.nextDouble();
        System.out.print("Digite a segunda nota ");
        double nota2 = scanner.nextDouble();
        double media = (nota1 + nota2) / 2;
        System.out.println("A média do aluno " + nome + " é " + media);
        if (media < 7){
            System.out.println("Reprovado");
        }else{ 
            System.out.println("Aprovado");
        }

        scanner.close();
    }
}