package desafios;/* Dado os três lados de um triângulo determinar o perímetro do mesmo.  */


import java.util.Scanner;

public class PerimetroTriangulo {

    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe o tamanho do lado A do Triangulo");
        double ladoA = scan.nextDouble();

        System.out.println("Informe o tamanho do lado B do Triangulo");
        double ladoB = scan.nextDouble();

        System.out.println("Informe o tamanho do lado C do Triangulo");
        double ladoC = scan.nextDouble();

        double perimetro = ladoA + ladoB + ladoC;

        System.out.println(" O perimetro do triangulo eh: " + perimetro);

    }

}
