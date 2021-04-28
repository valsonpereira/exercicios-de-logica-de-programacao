package desafios;/* Solicitar a idade de uma pessoa em dias e informar na tela a idade em anos, meses e dias. */


import java.util.Scanner;

public class IdadeEmAnosMeses {

    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe sua idade em dias");
        int idadeDias = scan.nextInt();

        int idadeAnos = idadeDias / 365;
        int idadeMeses = idadeAnos * 12;


        System.out.println("Sua idade em anos: " + idadeAnos);
        System.out.println("sua idade em meses: " + idadeMeses);



    }
}
