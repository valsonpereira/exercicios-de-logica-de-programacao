/* Desafio
Pedro trabalha sempre até tarde todos os dias, com isso tem pouco tempo tempo para as tarefas domésticas.
Para economizar tempo ele faz a lista de compras do supermercado em um aplicativo e costuma anotar cada item
na mesma hora que percebe a falta dele em casa. O problema é que o aplicativo não exclui itens duplicados,
como Pedro anota o mesmo item mais de uma vez e a lista acaba ficando extensa.
Sua tarefa é melhorar o aplicativo de notas desenvolvendo um código que exclua os itens duplicados da lista de
compras e que os ordene alfabeticamente.

Entrada
A primeira linha de entrada contém um inteiro N (N < 100) com a quantidade de casos de teste que vem a seguir,
ou melhor, a quantidade de listas de compras para organizar. Cada lista de compra consiste de uma única linha que
contém de 1 a 1000 itens ou palavras compostas apenas de letras minúsculas (de 1 a 20 letras), sem acentos
e separadas por um espaço.

Saída
A saída contém N linhas, cada uma representando uma lista de compra, sem os itens repetidos
e em ordem alfabética.


Exemplo de Entrada
2
carne laranja suco picles laranja picles
laranja pera laranja pera pera

Exemplo de Saída
carne laranja picles suco
laranja pera
*/

package dio.desafios;

import java.io.IOException;
import java.util.*;

public class ComprasSupermercado {

    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);

        //declare as variaveis corretamente

        int numeroLinhas  = leitor.nextInt();
        leitor.nextLine();  // Consume newline left-over


        if (numeroLinhas < 1 || numeroLinhas > 100)
            return;

        for(int i = 0; i < numeroLinhas; i++){
            Set<String> itensSemDuplicacao = new HashSet<String>();

            String listaItens = leitor.nextLine();
            String[] splitters = listaItens.split(" ");


            for(String splitter : splitters)
                itensSemDuplicacao.add(splitter);

            List<String> itensOrdenadosSemDuplicacao = new ArrayList<>(itensSemDuplicacao);

            Collections.sort(itensOrdenadosSemDuplicacao);

            listaItens = "";

           for (String itens : itensOrdenadosSemDuplicacao){
                listaItens += itens + " ";
           }

           System.out.println(listaItens);

        }

    }

}
