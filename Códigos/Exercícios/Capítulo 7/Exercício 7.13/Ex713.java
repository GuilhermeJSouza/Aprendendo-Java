//Exercício 7.13

public class Ex713
{
    public static void main(String[] args)
    {
        int[][] sales = new int[3][5];

        for (int row = 0; row < sales.length; row++)
        {
            for (int col = 0; col < sales[row].length; col++)
            {
                sales[row][col] = 0;
                System.out.printf("%nsales [%d][%d] = %d", row, col, sales[row][col]);
            }
        }
    }
}