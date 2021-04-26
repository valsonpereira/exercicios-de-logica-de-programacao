/* Dado o tamanho da base e da altura de um retângulo, calcular a sua área e o seu
perímetro */

import java.util.Scanner;

public class AreaPerimetroRetangulo {

    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe a base do retangulo");
        double base = scan.nextDouble();

        System.out.println("Informe a altura do retangulo");
        double altura = scan.nextDouble();

        double area = base * altura;
        double perimetro = 2 * (base + altura);

        System.out.println("A area do Retangulo eh: " + area);
        System.out.println("O perimetro do Retangulo eh: " + perimetro);


    }

}
