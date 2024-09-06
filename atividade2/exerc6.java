//6.  Crie um programa para ler o valor do salário mínimo, o nome e o salário bruto de um empregado. Se o seu salário for menor que um salário mínimo descontar 2%; se for igual, descontar 5%, e se for superior, descontar 8%. Informar o valor do desconto e o salário líquido.
package atividade2;
import java.util.Scanner;

public class exerc6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o valor do salário mínimo: ");
        double salarioMinimo = scanner.nextDouble();
        System.out.println("Digite o nome do empregado: ");
        String nome = scanner.next();
        System.out.println("Digite o salário bruto do empregado: ");
        double salarioBruto = scanner.nextDouble();
        double desconto = 0;
        if (salarioBruto < salarioMinimo){
            desconto = salarioBruto * 0.02;
        }else{
            if (salarioBruto == salarioMinimo){
                desconto = salarioBruto * 0.05;
            }else{
                desconto = salarioBruto * 0.08;
            }
        }

        double salarioLiquido = salarioBruto - desconto;
        System.out.println("O valor do desconto é: " + desconto);
        System.out.println("O salário líquido é: " + salarioLiquido);

        scanner.close();
    }
}