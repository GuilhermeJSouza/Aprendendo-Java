//classAverage2.java

import java.util.Scanner;

public class classAverage2
{
	public static void main (String[] args)
	{
		Scanner input = new Scanner(System.in);

		int grade = 0;
		
		int average = 0;

		int total = 0;

		int i = 1;

		int sinal = 1;

		String sentinela;

		while (sinal == 1)
		{
			System.out.printf ("%nDigite a %dª nota ou enter para finalizar.%n", i);

			if (input.hasNextLine())
			{
				sentinela = input.nextLine();

				if (sentinela.isEmpty() || sentinela.equals (""))
				{	
					System.out.println ("<" + sentinela + ">");

					sinal = 0;
				}
				else
				{

					grade = Integer.parseInt(sentinela);

					total = total + grade;

					i = i + 1;

				}
			}
		}
		
		average = total/(i-1);

		System.out.printf ("%nA média das notas é %d.%n", average);
	}
}