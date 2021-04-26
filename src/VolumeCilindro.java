/* Faça um algoritmo que calcule e apresente o valor do volume de uma lata de óleo, dado
seu raio e sua altura */

import java.util.Scanner;

public class VolumeCilindro {

    public static void main (String[] args){

        final double PI = 3.14;

        Scanner scan = new Scanner(System.in);

        System.out.println("Informe o raio da lata de oleo");
        double raio = scan.nextDouble();

        System.out.println("Informe a altura da lata de oleo");
        double altura = scan.nextDouble();

        double volume = PI * Math.pow(raio, 2) * altura;


        System.out.printf("O volume da lata de oleo eh: %.3f", volume);


    }

}
