/* Ler um número inteiro e exibir o seu sucessor */

import java.util.Scanner;

public class NumeroInteiroSucessor {
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe um numero inteiro");
        int numeroInteiro = scan.nextInt();

        System.out.println("O sucessor de " + numeroInteiro + " eh: " + (numeroInteiro + 1));

    }

}
