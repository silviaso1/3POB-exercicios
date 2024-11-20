package empresa.controle;

import heranca.empresa.Gerente;
import heranca.empresa.Vendas;

public class Controle {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("01", "568.415.155-89", "Julia Pereira", 5000, 4500);
        System.out.println("Gerente:");
        gerente.exibir();

        System.out.println();

        Vendas vendedor = new Vendas("02", "515.155.552-40", "Antonia Gomes", 4000, 1570);
        System.out.println("Vendedor:");
        vendedor.exibir();
    }
}