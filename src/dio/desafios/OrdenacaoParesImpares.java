/* Desafio
Crie um programa onde você receberá valores inteiros não negativos como entrada.

Ordene estes valores de acordo com o seguinte critério:

Primeiro os Pares
Depois os Ímpares
Você deve exibir os pares em ordem crescente e na sequência os ímpares em ordem decrescente.

Entrada
A primeira linha de entrada contém um único inteiro positivo N (1 < N < 10000)
Este é o número de linhas de entrada que vem logo a seguir.
As próximas N linhas terão, cada uma delas, um valor inteiro não negativo.

Saída
Exiba todos os valores lidos na entrada segundo a ordem apresentada acima.
Cada número deve ser impresso em uma linha, conforme exemplo de saída abaixo.

Exemplo de Entrada
10
4
32
34
543
3456
654
567
87
6789
98

Exemplo de Saída
4
32
34
98
654
3456
6789
567
543
87

*/

package dio.desafios;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class OrdenacaoParesImpares {

    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);

        //declare as variaveis corretamente

        int numeroLinhas  = leitor.nextInt();

        if (numeroLinhas < 1 || numeroLinhas > 10000)
            return;

        List<Integer> pares = new ArrayList<Integer>();
        List<Integer> impares = new ArrayList<Integer>();

        for(int i = 0; i < numeroLinhas; i++){

            Integer numero = leitor.nextInt();

            if(numero % 2 == 0)
                pares.add(numero);
            else
                impares.add(numero);

        }

        Collections.sort(pares);
        Collections.sort(impares, Collections.reverseOrder());

        for(Integer par : pares){
            System.out.println(par + "\n");
        }

        for(Integer impar : impares){
            System.out.println(impar + "\n");
        }


    }

}
