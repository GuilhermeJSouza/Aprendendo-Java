//Analysis.java

import java.util.Scanner;

public class Analysis
{
	public static void main (String[] args)
	{
		Scanner input = new Scanner (System.in);
		
		int counterApproved = 0;
		int counterNotApproved = 0;
		
		int counter = 1;
		
		int resultado = 0;

		while (counter <= 10)
		{
			System.out.println ("\nEscreva o resultado (1 - Aprovado e 2 - Reprovado).");

			resultado = input.nextInt();

			if (resultado == 1)
			{
				counterApproved += 1;
			}
			if (resultado == 2)
			{
				counterNotApproved += 1;
			}

		counter += 1;

		}
		
		System.out.printf("%nAprovados: %d%nReprovados: %d%n", counterApproved, counterNotApproved);
		
		if (counterApproved >= 8)
		{
			System.out.println("Bonus to instructor!");
		}
	}
}
