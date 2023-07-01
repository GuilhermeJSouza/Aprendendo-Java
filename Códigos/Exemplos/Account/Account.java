//Account.java
//Criação/declaração da classe Account com apenas um atributo (variável de instância) e dois métodos de manipulação da variável.

public class Account //Declaração da classe
{
	private String name; //Declaração de uma variável de instância que só pode ser manipulada pelos próprios métodos da classe (private).
	private Double balance = 0.0; //Declaração da variável de instância para o saldo.

	public Account (String name, Double balance) //Construtor com parâmetros para iniciar as variáveis de instância com valor já atribuído
	{
		this.name = name;
		if (balance > 0.0) //se o saldo for válido
			this.balance = balance; //atribui o parâmetro do construtor à variável de instância.
	}

	public void deposit (Double depositAmount) //método que deposita uma quantia no saldo.
	{
		if (depositAmount > 0.0) //condição para que que o método execute a "transação".
			balance = balance + depositAmount; //adiciona o valor
	}

	public Double getBalance() //método para retornar o saldo
	{
		return balance;
	}

	public void setName (String name) //Declaração do método paraatribuir um nome à variável de instância do objeto.
	{
		this.name = name; //Atribuição do valor do parâmetro name do método (lado direito do operando) à variável de instância name da classe (lado esquerdo do operando).
				//a palavra-chave this é usada para referenciar a variável de instância que tem o mesmo nome do argumento do método.
	} //fim dométodo setName.

	public String getName() //Declaração do método que apenas retorna a variável de instância name do objeto.
	{
		return name; //instrução para retorno da variável de instância.
	} //fim do método getName().
} //fim da classe Account.