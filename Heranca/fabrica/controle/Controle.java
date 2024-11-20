package fabrica.controle;

import Heranca.dominio.PessoaFisica;
import Heranca.dominio.PessoaJuridica;

public class Controle {
    public static void main(String[] args) {
       
         PessoaFisica fisica = new PessoaFisica("Rua ABC, 89", "21512-56", "553.956.152-40", "Pedro da Silva");
         System.out.println("Pessoa Física:");
         fisica.exibir();
 
         System.out.println();
 
    
         PessoaJuridica juridica = new PessoaJuridica("Avenida CB, 515", "21589-54", "56.455.654/0001-58", "Empresa Fake");
         System.out.println("Pessoa Jurídica:");
         juridica.exibir();
     }
 }