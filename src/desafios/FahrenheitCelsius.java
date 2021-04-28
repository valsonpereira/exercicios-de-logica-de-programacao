package desafios;/* Dado que a fórmula para conversão de Fahrenheit para Celsius é C = 5/9 (F – 32), leu um
valor de temperatura em Fahrenheit e exibi-lo em Celsius */


import java.util.Scanner;

public class FahrenheitCelsius {

    public static void main (String[] args){

        final double PI = 3.14;

        Scanner scan = new Scanner(System.in);

        System.out.println("Informe a temperatura em Fahrenheit ");
        double tempFahrenheit = scan.nextDouble();

        double celsius = (tempFahrenheit - 32) * 5 / 9;


        System.out.println("A temperatura " + tempFahrenheit + " Fahrenheit em Celsius eh: " + celsius + "º");

    }
}
