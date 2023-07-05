//JogoDados.java
/*(Jogo de dados) Escreva um aplicativo para simular o lançamento de dois dados. O aplicativo deve utilizar um objeto de classe Random,
uma vez para lançar o primeiro dado e novamente para lançar o segundo dado. A soma dos dois valores deve então ser calculada. Cada
dado pode mostrar um valor inteiro de 1 a 6, portanto a soma dos valores irá variar de 2 a 12, com 7 sendo a soma mais frequente e 2 e 12,
as somas menos frequentes. A Figura 7.28 mostra as 36 possíveis combinações de dois dados. Seu aplicativo deve lançar o dado 36.000.000
vezes. Utilize um array unidimensional para contar o número de vezes que cada possível soma aparece. Exiba os resultados em formato
tabular. */

import java.security.SecureRandom;

public class JogoDados
{
    public static void main(String[] args)
    {
        SecureRandom aleatorio = new SecureRandom();
        int[] contagem = new int[13];
        int dado1 = 0;
        int dado2 = 0;
        int soma = 0;

        for (int x = 0; x < 36000000; x++)
        {
            dado1 = aleatorio.nextInt(6) + 1;

            for (int y = 0; y < 2; y++)
            {
                dado2 = aleatorio.nextInt(6) + 1;

                soma = dado1 + dado2;

                ++contagem[soma];

                //System.out.printf("%n%2d %2d %2d", dado1, dado2, soma);

                break;
            }
        }

        System.out.printf("%nSoma%12s", "Frequência");

        for (int counter = 2; counter < 13; counter++)
        {
            System.out.printf("%n%2d: %12d", counter, contagem[counter]);
        } 
    }
}