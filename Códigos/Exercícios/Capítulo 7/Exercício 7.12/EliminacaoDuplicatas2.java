/*(Eliminação de duplicatas) Utilize um array unidimensional para resolver o seguinte problema: escreva um aplicativo que insere cinco
números, cada um entre 10 e 100, inclusive. Enquanto cada número é lido, exiba-o somente se ele não tiver uma duplicata de um número
já lido. Cuide de tratar o “pior caso”, em que todos os cinco números são diferentes. Utilize o menor array possível para resolver esse problema.
Exiba o conjunto completo de valores únicos inseridos depois que o usuário inserir cada valor novo.*/

import java.util.Scanner;

public class EliminacaoDuplicatas2
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        int[] lista = new int[5];

        int counter = 0;
        int novoNumero = 0;

        while (counter < 5)
        {
            System.out.println("Digite um número");

            novoNumero = input.nextInt();

            if (novoNumero >= 10 && novoNumero <= 100)
            {
                boolean duplicado = false;

                for (int x = 0; x < lista.length; x++)
                {
                    if (lista[x] == novoNumero)
                    {
                        duplicado = true;
                        System.out.println("Número duplicado. ");
                        break;
                    }
                }
                if (!duplicado)
                {
                    lista[counter] = novoNumero;
                    counter++;
                }
            }
            else
            {
                System.out.print("Número Inválido.");
            }
        }
        System.out.printf("%nLista = {%d, %d, %d, %d, %d}", lista[0], lista[1], lista[2], lista[3], lista[4]);

        input.close();
    }
}