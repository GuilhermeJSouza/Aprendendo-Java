//ComissoesDeVendas.java
//Exercício 7.10
/*(Comissões de vendas) Utilize um array unidimensional para resolver o seguinte problema: uma empresa paga seu pessoal de vendas por
comissão. O pessoal de vendas recebe R$ 200 por semana mais 9% de suas vendas brutas durante essa semana. Por exemplo, um vendedor
que vende R$ 5.000 brutos em uma semana recebe R$ 200 mais 9% de R$ 5.000 ou um total de R$ 650. Escreva um aplicativo (utilizando
um array de contadores) que determina quanto o pessoal de vendas ganhou em cada um dos seguintes intervalos (suponha que o salário
de cada vendedor foi truncado para uma quantia inteira):
a) $200–299
b) $300–399
c) $400–499
d) $500–599
e) $600–699
f) $700–799
g) $800–899
h) $900–999
i) R$ 1.000 e acima
Resuma os resultados em formato tabular.*/

public class ComissoesDeVendas
{
    public static void main(String[] args)
    {
        int[] vendas = new int[12];
        int counter = 0;

        for (counter = 2; counter < vendas.length; counter++)
        {
            System.out.printf ("%n$%02d-%02d: $%d", counter * 100, counter * 100 + 99, (200 + (9 * counter)));
        }
    }
}