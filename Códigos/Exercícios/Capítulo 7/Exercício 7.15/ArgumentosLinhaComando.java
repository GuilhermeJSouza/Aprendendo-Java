//ArgumentosLinhaComando.java
/*(Argumentos de linha de comando) Reescreva a Figura 7.2 para que o tamanho do array seja especificado pelo primeiro argumento de
linha de comando. Se nenhum argumento de linha de comando for fornecido, utilize 10 como o tamanho padrão do array.

// Figura 7.2: InitArray.java
// Inicializando os elementos de um array como valores padrão de zero.

public class InitArray
{
public static void main(String[] args)
{
// declara array variável e o inicializa com um objeto array
int[] array = new int[10]; // cria o objeto array

System.out.printf("%s%8s%n", "Index", "Value"); // títulos de coluna

// gera saída do valor de cada elemento do array
for (int counter = 0; counter < array.length; counter++)
System.out.printf("%5d%8d%n", counter, array[counter]);
}
} // fim da classe InitArray*/

public class ArgumentosLinhaComando
{
    public static void main (String[] args)
    {
        int arrayLength = 0;

        if (args.length < 1)
        {
            arrayLength = 10;
        }
        else
        {
            arrayLength = Integer.parseInt(args[0]);
        }
        
        int[] array = new int[arrayLength];

        System.out.printf("%s%8s%n", "Index", "Value");

        for (int x = 0; x < arrayLength; x++)
        {
            System.out.printf("%n%2d%8d", x, array[x]);
        }
    }
}