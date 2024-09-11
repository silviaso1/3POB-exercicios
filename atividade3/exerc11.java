//11. Um determinado material radioativo perde metade de sua massa a cada 50 segundos. Dada a massa inicial, em gramas, fazer um algoritmo que determine o tempo necessário para que essa massa se torne menor do que 0.5 gramas. Escreva a massa final, e o tempo. Observação: o usuário deve digitar a massa inicial.

package atividade3;
import java.util.Scanner;

public class exerc11{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite a massa inicial do material (em gramas): ");
        double massa = scanner.nextDouble();
        
        int tempo = 0; 
        
        while (massa >= 0.5) {
            massa /= 2; 
            tempo += 50;
        }

        System.out.println("Massa final: " + massa + " gramas");
        System.out.println("Tempo necessário: " + tempo + " segundos");
        
        scanner.close();
    }
}

