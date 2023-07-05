//UsandoInstrucaoForAprimorada.java
/*(Usando a instrução for aprimorada) Escreva um aplicativo que usa uma instrução for aprimorada para somar os valores double
passados pelos argumentos de linha de comando. [Dica: utilize o método static parseDouble da classe Double para converter uma
String em um valor double.] */

public class UsandoInstrucaoForAprimorada
{
    public static void main(String[] args)
    {
        double[] parcelas = new double[args.length];

        for (int x = 0; x < parcelas.length; x++)
        {
            parcelas[x] = Double.parseDouble(args[x]);
        }

        double resultadosoma = soma(parcelas);

        System.out.printf("%nO resultado da soma é %.2f", resultadosoma);
    }

    public static double soma (double[] valores)
    {
        double resultado = 0;

        for (double valor : valores)
        {
            resultado += valor;
        }

        return resultado;
    }
}