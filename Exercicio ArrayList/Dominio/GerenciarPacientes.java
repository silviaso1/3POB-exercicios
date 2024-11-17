package Dominio;

import java.util.ArrayList;
import java.util.List;

public class GerenciarPacientes {
    private List<Paciente> pacientes;

    public GerenciarPacientes() {
        this.pacientes = new ArrayList<>();
    }

   
    public void incluirPaciente(Paciente paciente) {
        pacientes.add(paciente);
        System.out.println("Paciente incluído com sucesso.");
    }

    
    public void listarTodosPacientes() {
        if (pacientes.isEmpty()) {
            System.out.println("Nenhum paciente cadastrado.");
        } else {
            System.out.println("Lista de pacientes:");
            for (Paciente p : pacientes) {
                p.mostrarPaciente();
            }
        }
    }


    public void alterarPaciente(int id, double novoPeso, double novaAltura) {
        for (Paciente p : pacientes) {
            if (p.getId() == id) {
                p.setPeso(novoPeso);
                p.setAltura(novaAltura);
                System.out.println("Paciente alterado com sucesso.");
                return;
            }
        }
        System.out.println("Paciente não encontrado.");
    }

 
    public void excluirPaciente(int id) {
        for (Paciente p : pacientes) {
            if (p.getId() == id) {
                pacientes.remove(p);
                System.out.println("Paciente removido com sucesso.");
                return;
            }
        }
        System.out.println("Paciente não encontrado.");
    }

    public void consultarPaciente(int id) {
        for (Paciente p : pacientes) {
            if (p.getId() == id) {
                System.out.println("Paciente encontrado:");
                p.mostrarPaciente();
                return;
            }
        }
        System.out.println("Paciente não encontrado.");
    }
}
