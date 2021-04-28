package desafios;/* Ler dois números inteiros e exibir o quociente e o resto da divisão inteira entre eles. */

import java.util.Scanner;

public class InteirosQuocienteResto {

    public static void main (String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.println("Informe o Numero Inteiro A");
        int a = scan.nextInt();

        System.out.println("Informe o Numero Inteiro B");
        int b = scan.nextInt();

        int quociente = a / b;
        int resto = a % b;

        System.out.println("O Quociente da divisao entre A e B eh: " + quociente);
        System.out.println("O resto da divisao entre A e B eh: " + resto);

    }
}
