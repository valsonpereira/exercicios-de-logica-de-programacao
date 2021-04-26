/* Dado o tamanho do lado de um quadrado, calcular a área e o perímetro do mesmo. */

import java.util.Scanner;

public class AreaPerimetroQuadrado {

    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe o tamanho do lado do quadrado");
        double lado = scan.nextDouble();

        double area = lado * lado;
        double perimetro = 4 * lado;

        System.out.println("A area do quadrado eh: " + area);
        System.out.println("O perimetro do quadrado eh: " + perimetro);

    }
}
