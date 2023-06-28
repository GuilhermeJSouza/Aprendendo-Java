//testeIfAninhado.java
//Código para testar se o else responde à primeira instrução condicional ou à segunda, testando a posição das chaves.
//Se x for maior que y -> a primeira condição foi satisfeita, executa apenas a primeira ação.
//Se x for igual a y -> a primeira e segunda ação foram satisfeitas, executa a primeira e a segunda ação.
//Se x for menor que y -> nenhuma das condições foi satisfeita, executa a terceira terceira ação.

import java.util.Scanner;

public class testeIfAninhado
{
	public static void main (String[] args)
	{
		Scanner input = new Scanner(System.in);

		System.out.println ("\nSe x for maior que y, a primeira condição foi satisfeita, executa apenas a primeira ação.\nSe x for igual a y, a primeira e segunda ação foram satisfeitas, executa a primeira e a segunda ação.\nSe x for menor que y, nenhuma das condições foi satisfeita, executa a terceira terceira ação.");

		System.out.println ("\nDigite o valor do x: ");
		int x = input.nextInt();

		System.out.println ("Digite o valor do y: ");
		int y = input.nextInt();

		if (x >= y)
		{
			System.out.println ("A primeira condição foi satisfeita.");
			
			if (x == y)
			{
				System.out.println ("A segunda condição foi satisfeita.");
			}
		//}
		else //(x < y)
		{
			System.out.println ("Nenhuma das condições foram satisfeitas (este else corresponde à segunda instrução).");
		}
		}
	}
}