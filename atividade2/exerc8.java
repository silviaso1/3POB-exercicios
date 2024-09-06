//8.  Faça um programa que leia o código, a quantidade, o preço unitário e a forma de pagamento (1 - Dinheiro, 2 - Cheque, 3 - Cartão débito, 4 - Cartão crédito) de um produto. Pagamentos em dinheiro recebem um desconto de 10%, em cartão de débito 5%, em cartão de crédito 3%  e em cheque 2%. O programa deve informar o valor do desconto e o valor final a pagar.

package atividade2;
import java.util.Scanner;

public class exerc8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada de dados
        System.out.println("Digite o código do produto: ");
        int codigo = scanner.nextInt();

        System.out.println("Digite a quantidade: ");
        int quantidade = scanner.nextInt();

        System.out.println("Digite o preço unitário: ");
        double precoUnitario = scanner.nextDouble();

        System.out.println("Digite a forma de pagamento (1 - Dinheiro, 2 - Cheque, 3 - Cartão débito, 4 - Cartão crédito): ");
        int formaPagamento = scanner.nextInt();

        // Calculando o valor total sem desconto
        double valorTotal = quantidade * precoUnitario;
        double desconto = 0.0;
        double valorFinal;

        // Determinando o desconto com base na forma de pagamento
        switch (formaPagamento) {
            case 1:
                desconto = 0.10; // 10% de desconto
                break;
            case 2:
                desconto = 0.02; // 2% de desconto
                break;
            case 3:
                desconto = 0.05; // 5% de desconto
                break;
            case 4:
                desconto = 0.03; // 3% de desconto
                break;
            default:
                System.out.println("Forma de pagamento inválida.");
                break;
        }

        // Calculando o valor final
        double valorDesconto = valorTotal * desconto;
        valorFinal = valorTotal - valorDesconto;

        // Saída dos resultados
        System.out.printf("Valor do desconto: R$ %.2f%n", valorDesconto);
        System.out.printf("Valor final a pagar: R$ %.2f%n", valorFinal);

        scanner.close();
    }
}