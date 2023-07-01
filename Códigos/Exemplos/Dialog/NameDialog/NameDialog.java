//NameDialog.java
//Obtendo a entreda de usuário a partir de um diálogo.

import javax.swing.JOptionPane; //biblioteca para a classe JOptionPane (caixas de diálogos)

public class NameDialog
{
	public static void main (String[] args)
	{
		//pede para o usuário inserir seu nome
		String name = JOptionPane.showInputDialog ("What is your name?");

		//cria a mensagem
		String message = String.format ("Welcome, %s, to Java Programming!", name);

		//Exibe a mensagem para cumprimentar o usuário pelo nome
		JOptionPane.showMessageDialog (null, message);
	} //fim do main
} //fim da classe