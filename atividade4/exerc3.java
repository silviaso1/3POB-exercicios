/* 3.  Faça um programa usando listas que armazene o código, o nome e o telefone de 100 pessoas. 
O programa deve permitir que o usuário faça uma consulta dos dados de uma pessoa a partir de seu código.
 Esta consulta pode ser repetida se o usuário desejar, caso contrário, o programa deve ser encerrado.
 */

package atividade4;

import java.util.ArrayList;
import java.util.Scanner;

public class exerc3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        ArrayList<Integer> listaCodigos = new ArrayList<>();
        ArrayList<String> listaNomes = new ArrayList<>();
        ArrayList<String> listaTelefones = new ArrayList<>();
        
        for (int i = 0; i < 100; i++) {
            System.out.print("Digite o código da pessoa: ");
            listaCodigos.add(scanner.nextInt());
            scanner.nextLine(); 

            System.out.print("Digite o nome da pessoa: ");
            listaNomes.add(scanner.nextLine());

            System.out.print("Digite o telefone da pessoa: ");
            listaTelefones.add(scanner.nextLine());
        }

        String resposta = "s";
        while (!resposta.equals("n")) {
            System.out.print("\nDigite o código da pessoa para consulta: ");
            int codigoConsulta = scanner.nextInt();

            int indicePessoa = -1; 
            for (int i = 0; i < listaCodigos.size(); i++) {
                if (listaCodigos.get(i) == codigoConsulta) {
                    indicePessoa = i;
                    break;
                }
            }
            
            if (indicePessoa != -1) {
                System.out.println("Código: " + listaCodigos.get(indicePessoa));
                System.out.println("Nome: " + listaNomes.get(indicePessoa));
                System.out.println("Telefone: " + listaTelefones.get(indicePessoa));
            } else {
                System.out.println("Pessoa com código " + codigoConsulta + " não encontrada.");
            }

            System.out.print("\nDeseja realizar outra consulta? (s/n): ");
            resposta = scanner.next();
        }
        scanner.close();
    }
}
