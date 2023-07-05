//ListaArgumentoComprimentoVariavel.java
/* (Lista de argumento de comprimento variável) Escreva um aplicativo que calcula o produto de uma série de inteiros que são passados
para método product utilizando uma lista de argumentos de comprimento variável. Teste seu método com várias chamadas, cada uma
com um número diferente de argumentos.*/

public class ListaArgumentoComprimentoVariavel
{
    public static void main (String[] args)
    {
        int resultado = 0;

        resultado = product(1, 2);

        System.out.printf("O produto dos inteiros é: %d", resultado);
    }
    public static int product (int... numeros)
    {
        int produto = 1;

        if (numeros.length == 0 || numeros.length == 1)
        {
            System.out.println("Não foram passados fatores suficientes para fazer a multiplicação.");
            return 0;
        }

        for (int fator : numeros)
        {
            produto *= fator;
        }

        return produto;
    }
}