//4.  Elabore um programa para solicitar o nome, o sexo e o salário bruto de um empregado. Se o seu sexo for masculino, descontar 5% de seu salário; caso contrário, descontar 3%. Informar o valor do desconto e o salário líquido.

package atividade2;
import java.util.Scanner;

public class exerc4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o seu nome: ");
        String nome = scanner.nextLine();
        System.out.println("Digite o seu sexo: ");
        String sexo = scanner.nextLine();
        System.out.println("Digite o seu salário bruto  ");
        double salarioBruto = scanner.nextDouble();
        double desconto = 0;
        if (sexo.equals("masculino")){
            desconto = salarioBruto * 0.05;
        }else{
            desconto = salarioBruto * 0.03;
        }
        double salarioLiquido = salarioBruto - desconto;
        System.out.println("O valor do desconto é: " + desconto);
        System.out.println("O valor do salário líquido é: " + salarioLiquido);


        scanner.close();
    }
}