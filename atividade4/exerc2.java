/*
2.  Elabore um programa usando listas que leia a matrícula e o salário bruto de 100 empregados. 
Os dados devem ser armazenados em listas. O programa deve descontar 11% do salário bruto de cada 
empregado e ao final escrever: a matrícula, o salário bruto, o desconto e o salário líquido de cada 
empregado. */

package atividade4;

import java.util.ArrayList;
import java.util.Scanner;

public class exerc2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        ArrayList<String> listaMatriculas = new ArrayList<>();
        ArrayList<Double> listaSalariosBrutos = new ArrayList<>();
        
        double taxaDesconto = 0.11;
        
        for (int i = 0; i < 100; i++) {
            int numeroEmpregado = i + 1;  
            System.out.print("Digite a matrícula do empregado " + numeroEmpregado + ": ");
            listaMatriculas.add(scanner.nextLine()); 
            
            System.out.print("Digite o salário bruto do empregado " + numeroEmpregado + ": ");
            listaSalariosBrutos.add(scanner.nextDouble()); 
            scanner.nextLine(); 
        }

        System.out.println("\nDetalhes dos empregados:");
        for (int i = 0; i < listaMatriculas.size(); i++) {
            double salarioBruto = listaSalariosBrutos.get(i);
            double valorDesconto = salarioBruto * taxaDesconto; 
            double salarioLiquido = salarioBruto - valorDesconto;
            
            System.out.println("Matrícula: " + listaMatriculas.get(i));
            System.out.println("Salário Bruto: R$ " + String.format("%.2f", salarioBruto));
            System.out.println("Desconto (11%): R$ " + String.format("%.2f", valorDesconto));
            System.out.println("Salário Líquido: R$ " + String.format("%.2f", salarioLiquido));
            System.out.println("---------------------------------------------");
        }
        
        scanner.close(); 
    }
}

