//AccountTest.java
//Programa para testar a classe Account criada anteriormente.

import java.util.Scanner; //importar a biblioteca de leitura de dados de entrada inseridos pelo usuário.

public class AccountTest
{
	public static void main (String[] args)
	{
		Scanner input = new Scanner (System.in);

		Account minhaconta = new Account();

		String nome;
		String nomeinicial = minhaconta.getName(); //Descobrindo o nome inicial da conta e atribuindo à uma variável.

		System.out.printf("O nome inicial da conta é: %s.%n", nomeinicial);

		System.out.println("Digite o nome: ");
		nome = input.nextLine();
		minhaconta.setName(nome);

		System.out.printf("O nome da conta é: %n%s", minhaconta.getName());

	} //fim da execução do main.

}//fim da classe AccountTest.