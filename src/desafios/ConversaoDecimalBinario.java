package desafios;/* Converter um inteiro informado menor que 32 para sua representação em binário */


import java.io.IOException;
import java.util.Scanner;

public class ConversaoDecimalBinario {

    public static void main(String[] args) throws IOException {

        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite um numero inteiro ");
        int valor = leitor.nextInt();

        String binario = "";
        int resto = 0;


        while (valor > 0) {
            resto = valor % 2;
            valor = valor / 2;

            binario += resto;

        }
        String resultado = new StringBuilder(binario).reverse().toString();

        System.out.println(resultado);
    }


}
