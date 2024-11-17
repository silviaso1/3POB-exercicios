package Controle;
import Dominio.Paciente;
import Dominio.GerenciarPacientes;
import java.util.Scanner;

public class Controle {
    public static void main(String[] args) {
        GerenciarPacientes gerenciador = new GerenciarPacientes();
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Adicionar Paciente");
            System.out.println("2. Listar Pacientes");
            System.out.println("3. Alterar Paciente");
            System.out.println("4. Excluir Paciente");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o ID: ");
                    int id = scanner.nextInt();
                    System.out.print("Digite o peso: ");
                    double peso = scanner.nextDouble();
                    System.out.print("Digite a altura: ");
                    double altura = scanner.nextDouble();
                    gerenciador.adicionarPaciente(new Paciente(id, peso, altura));
                    break;
                case 2:
                    gerenciador.listarPacientes();
                    break;
                case 3:
                    System.out.print("Digite o ID do paciente para alterar: ");
                    int idAlterar = scanner.nextInt();
                    System.out.print("Digite o novo peso: ");
                    double novoPeso = scanner.nextDouble();
                    System.out.print("Digite a nova altura: ");
                    double novaAltura = scanner.nextDouble();
                    gerenciador.alterarPaciente(idAlterar, novoPeso, novaAltura);
                    break;
                case 4:
                    System.out.print("Digite o ID do paciente para excluir: ");
                    int idExcluir = scanner.nextInt();
                    gerenciador.excluirPaciente(idExcluir);
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        } while (opcao != 0);

        scanner.close();
    }
}
