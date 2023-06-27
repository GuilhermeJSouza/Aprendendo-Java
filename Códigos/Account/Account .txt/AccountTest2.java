//AccountTest2.java
//Programa para testar a classe Account criada anteriormente.
//Versão AccountTest com incrementos.

import java.util.Scanner; //importar a biblioteca de leitura de dados de entrada inseridos pelo usuário.

public class AccountTest2
{
	public static void main (String[] args)
	{
		Scanner input = new Scanner (System.in);

		Account account1 = new Account ("Jane Green", 50.00);
		Account account2 = new Account ("John Blue", -7.53);

		System.out.printf ("Usuário: %s%n Saldo: $%.2f%n", account1.getName(), account1.getBalance());
		System.out.printf ("%nUsuário: %s%n Saldo: $%.2f%n", account2.getName(), account2.getBalance());

		//Alternativa
		//System.out.println ("Usuário: " + account1.getName() + "\nSaldo: " + account1.getBalance());
		//System.out.println ("Usuário: " + account2.getName() + "\nSaldo: " + account2.getBalance());

		//Adcionando Saldo para a conta 1
		System.out.print ("\nDigite o valor a ser depositado: $");
		double depositAmount = input.nextDouble();

		System.out.printf ("%nAdicionando %.2f para %s%n%n", depositAmount, account1.getName());
		account1.deposit(depositAmount); //Deposita o valor na conta

		//Exibição dos Saldos
		System.out.printf ("Usuário: %s%n Saldo: $%.2f%n", account1.getName(), account1.getBalance());
		System.out.printf ("%nUsuário: %s%n Saldo: $%.2f%n", account2.getName(), account2.getBalance());

		//Adcionado valor para a conta 2
		System.out.print ("\nDigite o valor a ser depositado: $");
		depositAmount = input.nextDouble();

		System.out.printf ("%nAdicionando %.2f para %s%n%n", depositAmount, account2.getName());
		account2.deposit(depositAmount); //Deposita o valor na conta

		//Exibição dos Saldos
		System.out.printf ("Usuário: %s%n Saldo: $%.2f%n", account1.getName(), account1.getBalance());
		System.out.printf ("%nUsuário: %s%n Saldo: $%.2f%n", account2.getName(), account2.getBalance());

	} //fim da execução do main.

}//fim da classe AccountTest2.