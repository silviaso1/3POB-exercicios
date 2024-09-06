/*
9.  Dado três valores X,Y,Z, verificar se eles podem ser o comprimento dos lados de um triângulo e, se forem, verificar se é um triângulo,
equilátero, isósceles ou escaleno. Se eles não formarem um triângulo, escreverem uma mensagem.
*/

package atividade2;
import java.util.Scanner;

public class exerc9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o comprimento do lado X: ");
        double x = scanner.nextDouble();

        System.out.println("Digite o comprimento do lado Y: ");
        double y = scanner.nextDouble();

        System.out.println("Digite o comprimento do lado Z: ");
        double z = scanner.nextDouble();

        if (x + y > z && x + z > y && y + z > x) {
            if (x == y && y == z) {
                System.out.println("O triângulo é equilátero.");
            } else if (x == y || y == z || x == z) {
                System.out.println("O triângulo é isósceles.");
            } else {
                System.out.println("O triângulo é escaleno.");
            }
        } else {
            System.out.println("Os valores informados não formam um triângulo.");
        }

        scanner.close();
    }
}