//Comparison.java
//Programa que compara dois números usando a instruçãi if, todos os operadores de igualdade e relacionais.

import java.util.Scanner; //Importa a biblioteca da classe Scanner.

public class Comparison //Cria a classe de execução do programa de comparação.
{
	public static void main (String[] args) //Cria o método main para iniciar a execução do programa.
	{
		Scanner input = new Scanner (System.in); //cria o objeto que possibilita a leitura da entreda do sistema.

		int number1; //Declaração da primeira variável do tipo inteiro.
		int number2; //Declaração da segunda variável do tipo inteiro.

		System.out.print("Digite o primeiro número: "); //Solicitação do primeiro número para o usuário.

		number1 = input.nextInt(); //Atribuindo o valor da primeira entrada de dados lida na variável.

		System.out.print("Digite o segundoo número: "); //Solicitação do segundo número para o usuário.

		number2 = input.nextInt(); //Atribuindo o valor da segunda entrada de dados lida na variável.

		if (number1 == number2) //Comparação de igualdade.
		{
			System.out.printf ("%d e %d são iguais.%n", number1, number2);
		}

		if (number1 != number2) //Comparação de desigualdade.
		{
			System.out.printf ("%d e %d são diferentes.%n", number1, number2);
		}

		if (number1 < number2) //Comparação de "inferioridade".
		{
			System.out.printf ("%d é menor que %d.%n", number1, number2);
		}

		if (number1 > number2) //Comparação de "superioridade".
		{
			System.out.printf ("%d é maior que %d.%n", number1, number2);
		}

		if (number1 <= number2) //Comparação de "inferioridade" e igualdade.
		{
			System.out.printf ("%d é menor ou igual a %d.%n", number1, number2);
		}

		if (number1 >= number2) //Comparação de "superioridade" e igualdade.
		{
			System.out.printf ("%d é maior ou igual a %d.%n", number1, number2);
		}
	} //fim do método main.
} //fim da classe comparison.