//5.  Crie um programa que leia a altura de um número indeterminado de pessoas. Ao final o programa deve informar o total de pessoas cadastradas, a quantidade de pessoas com altura inferior a 1,60 metros; a quantidade de pessoas com altura entre 1,60 metros e 1,80 metros e a quantidade de pessoas com altura superior a 1,80 metros.
package atividade3;
import java.util.Scanner;

public class exerc5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalPessoas = 0;
        int pessoasInferiores160 = 0;
        int pessoasEntre160E180 = 0;
        int pessoasSuperiores180 = 0;

        while (true) {
            System.out.print("Digite a altura da pessoa (em metros) ou 0 para sair: ");
            double altura = scanner.nextDouble();

            if (altura == 0) {
                break;
            }

            totalPessoas++;

            if (altura < 1.60) {
                pessoasInferiores160++;
            } else if (altura >= 1.60 && altura <= 1.80) {
                pessoasEntre160E180++;
            } else {
                pessoasSuperiores180++;
            }
        }

        System.out.println("Total de pessoas cadastradas: " + totalPessoas);
        System.out.println("Quantidade de pessoas com altura inferior a 1,60 metros: " + pessoasInferiores160);
        System.out.println("Quantidade de pessoas com altura entre 1,60 metros e 1,80 metros: " + pessoasEntre160E180);
        System.out.println("Quantidade de pessoas com altura superior a 1,80 metros: " + pessoasSuperiores180);
    }

}
