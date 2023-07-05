/*(Eliminação de duplicatas) Utilize um array unidimensional para resolver o seguinte problema: escreva um aplicativo que insere cinco
números, cada um entre 10 e 100, inclusive. Enquanto cada número é lido, exiba-o somente se ele não tiver uma duplicata de um número
já lido. Cuide de tratar o “pior caso”, em que todos os cinco números são diferentes. Utilize o menor array possível para resolver esse problema.
Exiba o conjunto completo de valores únicos inseridos depois que o usuário inserir cada valor novo.*/

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;

public class EliminacaoDuplicatas
{
    public static void main (String[] args)
    {
        ArrayList<Integer> lista = new ArrayList<>();
        lista.add(0, 0);
        //System.out.println(lista.get(0));

        SecureRandom randomNumbers = new SecureRandom();

        int counter = 1;
        int compara = 0;
        int novoNumero = 0;

        while (counter < 5)
        {
            novoNumero = randomNumbers.nextInt(91) + 10;

            if (lista.get(0) == 0)
            {
                lista.set(0, novoNumero);
                continue;
            }

            for (int x = 0; x <= lista.size(); x++)
            {
                if (novoNumero != lista.get(x))
                {
                    compara++;
                }
                if (compara == lista.size())
                {
                    System.out.println(novoNumero);
                    lista.add(counter, novoNumero);
                    counter++;
                    break;
                }
            }
        }

        if (lista.size() == 5)
        {
            System.out.printf("%nLista = {%d, %d, %d, %d, %d}", lista.get(0), lista.get(1), lista.get(2), lista.get(3), lista.get(4));
        }
        else
        {
            System.out.println("Ocorreu algum erro.");
        }
    }
}