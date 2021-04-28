package desafios;/* Dado o tamanho do raio de uma circunferência, calcular a área e o perímetro da mesma. */

import java.util.Scanner;

public class AreaPerimetroCircunferencia {
    public static void main (String[] args){

        final double PI = 3.14;

        Scanner scan = new Scanner(System.in);

        System.out.println("Informe o tamanho do raio da circunferencia");
        double raio = scan.nextDouble();

        double perimetro = 2 * PI * raio;
        double area = PI * (Math.pow(raio, 2));

        System.out.println("O perimetro da circunferencia eh: " + perimetro);
        System.out.println("A area da circunferencia eh: " + area);

    }
}
