/*1.  Crie um programa para ler a matrícula e o salário de dois empregados. Descontar 5% no salário do primeiro e acrescentar 9% no salário do segundo. Informar: o valor do desconto do primeiro; o valor do acréscimo do segundo; o salário final do primeiro; o salário final do segundo. */

package atividade1;

import java.util.Scanner;

public class exerc1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite a matrícula do primeiro empregado: ");
        String matricula1 = scanner.nextLine();
        System.out.print("Digite o salário do primeiro empregado: ");
        double salario1 = scanner.nextDouble();
   
        scanner.nextLine(); 
        System.out.print("Digite a matrícula do segundo empregado: ");
        String matricula2 = scanner.nextLine();
        System.out.print("Digite o salário do segundo empregado: ");
        double salario2 = scanner.nextDouble();
        
        double desconto1 = salario1 * 0.05; 
        double salarioFinal1 = salario1 - desconto1; 

        double acrescimo2 = salario2 * 0.09; 
        double salarioFinal2 = salario2 + acrescimo2;
        
        System.out.println("Matrícula do primeiro empregado: " + matricula1);
        System.out.println("Desconto do primeiro empregado: R$ " + desconto1);
        System.out.println("Salário final do primeiro empregado: R$ " + salarioFinal1);
        
        System.out.println("Matrícula do segundo empregado: " + matricula2);
        System.out.println("Acréscimo do segundo empregado: R$ " + acrescimo2);
        System.out.println("Salário final do segundo empregado: R$ " + salarioFinal2);
        
        scanner.close();
    }
}
