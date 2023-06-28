//Addition.java
//Programa de adição que o usuário insere dois números pelo teclado, então exibe a soma deles.

import java.util.Scanner; //programa utiliza a classe Scanner

public class Addition
{
	public static void main (String[] args) //método main inicia a execução do aplicativo Java
	{
		//Declaração de um objeto chamado input, da classe Scanner, e o associa a entrada padrão do sistema.
		Scanner input = new Scanner (System.in);

		//Declaração das variáveis
		int number1; //primeira variável em que é atribuído o valor digitado
		int number2; //segunda variável em que é atribuído o valor digitado
		int sum; // variável em que é atribuído o valor da soma

		//Solicitando entrada de dados do usuário e atribuindo às variáveis
		System.out.print ("Digite o primeiro número: ");
		number1 = input.nextInt(); //Transfere e armazena na variável o valor lido pelo objeto instanciado da classe Scanner.
		
		System.out.print ("Digite o primeiro número: ");
		number2 = input.nextInt();

		//Executando a adição
		sum = number1 + number2;
		
		//Exibe a soma
		System.out.printf ("Sum is %d%n", sum);
	} //fim do método main
} //fim da classe addition
