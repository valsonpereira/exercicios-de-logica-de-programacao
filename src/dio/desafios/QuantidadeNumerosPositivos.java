/*
Desafio
Crie um programa que leia 6 valores. Você poderá receber valores negativos e/ou positivos como entrada,
devendo desconsiderar os valores nulos. Em seguida, apresente a quantidade de valores positivos digitados.

Entrada
Você receberá seis valores, negativos e/ou positivos.

Saída
Exiba uma mensagem dizendo quantos valores positivos foram lidos assim como é exibido abaixo no exemplo de saída.
Não esqueça da mensagem "valores positivos" ao final.
*/

package dio.desafios;
import java.io.IOException;
import java.util.Scanner;


public class QuantidadeNumerosPositivos {

    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
//declare suas variaveis corretamente
        double[] valores = new double [6];

        valores[0] = leitor.nextDouble();
        valores[1] = leitor.nextDouble();
        valores[2] = leitor.nextDouble();
        valores[3] = leitor.nextDouble();
        valores[4] = leitor.nextDouble();
        valores[5] = leitor.nextDouble();

        int positivo = 0;

//continue a solução
        for (int i = 0; i < valores.length; i++) {

            if(valores[i] > 0.0)
                positivo++;

        }
//insira suas variaveis corretamente
        System.out.println(positivo + " valores positivos");
    }
}
