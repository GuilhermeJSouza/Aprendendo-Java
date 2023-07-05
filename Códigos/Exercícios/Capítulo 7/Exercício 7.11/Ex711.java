/*7.11 Escreva instruções que realizam as seguintes operações de um array unidimensional:
a) Configure os 10 elementos do array de inteiros counts como zeros.
b) Adicione um a cada um dos 15 elementos do array de inteiros bonus.
c) Exiba os cinco valores de array de inteiros bestScores em formato de coluna.*/

public class Ex711
{
    public static void main (String[] args)
    {
        int[] counts = new int[10];

        int[] bonus = new int[15];
        for (int x = 0; x < bonus.length; x++)
        {
            ++bonus[x];
        }

        int[] bestScores = new int[5];
        for (int y = 0; y < bestScores.length; y++)
        {
            System.out.println(bestScores[y]);
        }
    }
}