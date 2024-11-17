package Dominio;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class GerenciarPacientes {
    private static final String CAMINHO_ARQUIVO = "./pacientes.txt";

    public void adicionarPaciente(Paciente paciente) {
        try (BufferedWriter escritor = new BufferedWriter(new FileWriter(CAMINHO_ARQUIVO, true))) {
            escritor.write(paciente.toString());
            escritor.newLine();
            System.out.println("Paciente adicionado.");
        } catch (IOException e) {
            System.out.println("Erro ao adicionar: " + e.getMessage());
        }
    }


    public void listarPacientes() {
        try (BufferedReader leitor = new BufferedReader(new FileReader(CAMINHO_ARQUIVO))) {
            String linha;
            while ((linha = leitor.readLine()) != null) {
                String[] dados = linha.split(",");
                if (dados.length == 3) { 
                    Paciente paciente = new Paciente(
                            Integer.parseInt(dados[0]),
                            Double.parseDouble(dados[1]),
                            Double.parseDouble(dados[2])
                    );
                    paciente.mostrarPaciente();
                }
            }
        } catch (IOException e) {
            System.out.println("Erro ao listar: " + e.getMessage());
        }
    }


    public void alterarPaciente(int id, double novoPeso, double novaAltura) {
        List<Paciente> listaPacientes = carregarPacientes();
        boolean encontrado = false;
        for (Paciente p : listaPacientes) {
            if (p.getId() == id) {
                p.setPeso(novoPeso);
                p.setAltura(novaAltura);
                encontrado = true;
                break;
            }
        }
        if (encontrado) {
            salvarPacientes(listaPacientes);
            System.out.println("Paciente alterado.");
        } else {
            System.out.println("Paciente não encontrado.");
        }
    }


    public void excluirPaciente(int id) {
        List<Paciente> listaPacientes = carregarPacientes();
        boolean removido = listaPacientes.removeIf(p -> p.getId() == id);
        if (removido) {
            salvarPacientes(listaPacientes);
            System.out.println("Paciente removido.");
        } else {
            System.out.println("Paciente não encontrado.");
        }
    }


    private List<Paciente> carregarPacientes() {
        List<Paciente> listaPacientes = new ArrayList<>();
        try (BufferedReader leitor = new BufferedReader(new FileReader(CAMINHO_ARQUIVO))) {
            String linha;
            while ((linha = leitor.readLine()) != null) {
                String[] dados = linha.split(",");
                if (dados.length == 3) {
                    Paciente paciente = new Paciente(
                            Integer.parseInt(dados[0]),
                            Double.parseDouble(dados[1]),
                            Double.parseDouble(dados[2])
                    );
                    listaPacientes.add(paciente);
                }
            }
        } catch (IOException e) {
            System.out.println("Erro ao carregar: " + e.getMessage());
        }
        return listaPacientes;
    }


    private void salvarPacientes(List<Paciente> listaPacientes) {
        try (BufferedWriter escritor = new BufferedWriter(new FileWriter(CAMINHO_ARQUIVO))) {
            for (Paciente p : listaPacientes) {
                escritor.write(p.toString());
                escritor.newLine();
            }
        } catch (IOException e) {
            System.out.println("Erro ao salvar: " + e.getMessage());
        }
    }
}
