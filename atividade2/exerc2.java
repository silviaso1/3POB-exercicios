//2.  Crie um programa para solicitar o ano atual e o ano de nascimento de uma pessoa. Calcular sua idade aproximada e informá-la. Se sua idade for inferior a 16 anos, escrever a mensagem "Não pode votar"; caso contrário, emitir a mensagem "É eleitor".

package atividade2;
import java.util.Scanner;

public class exerc2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o ano atual: ");
        int anoAtual = scanner.nextInt();
        System.out.println("Digite o ano de nascimento ");
        int anoNascimento = scanner.nextInt();
        int idade = anoAtual - anoNascimento;
        System.out.println("Sua idade é: " + idade);
        if (idade < 16){
            System.out.println("Não pode votar");
        }
        else{
            System.out.println("É eleitor");
        }
        scanner.close();
    }
}