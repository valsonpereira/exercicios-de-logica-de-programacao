/*
Desafio
Você deve fazer a leitura de 5 valores inteiros.
Em seguida mostre quantos valores informados são pares,
quantos valores informados são ímpares, quantos valores informados são positivos e
quantos valores informados são negativos.

Entrada
Você receberá 5 valores inteiros.

Saída
Exiba a mensagem conforme o exemplo de saída abaixo, sendo uma mensagem por linha e não esquecendo o
final de linha após cada uma.

*/

package dio.desafios;
import java.io.IOException;
import java.util.Scanner;


public class AnaliseDeNumeros {

    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
//declare suas variaveis corretamente
        int[] valores = new int [5];

        valores[0] = leitor.nextInt();
        valores[1] = leitor.nextInt();
        valores[2] = leitor.nextInt();
        valores[3] = leitor.nextInt();
        valores[4] = leitor.nextInt();

        int par = 0;
        int impar = 0;
        int positivo = 0;
        int negativo = 0;

//continue a solução
        for (int i = 0; i < valores.length; i++) {

            if (valores[i] % 2 == 0 || valores[i] == 0)
                par++;
            else
                impar++;

            if(valores[i] > 0)
                positivo++;
            else if(valores[i] < 0)
                negativo++;

        }
//insira suas variaveis corretamente
        System.out.println(par + " valor(es) par(es)");
        System.out.println(impar + " valor(es) impar(es)");
        System.out.println(positivo + " valor(es) positivo(s)");
        System.out.println(negativo + " valor(es) negativo(s)");

    }


}
