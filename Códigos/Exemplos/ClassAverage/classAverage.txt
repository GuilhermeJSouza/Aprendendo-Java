//classAverage.java

import java.util.Scanner;

public class classAverage
{
	public static void main (String[] args)
	{
		Scanner input = new Scanner(System.in);

		int average = 0;

		int gradesSum = 0;

		int i = 1;

		while (i < 11)
		{
			System.out.printf ("Digite a %dª nota: %n", i);
			
			gradesSum = gradesSum + input.nextInt();
			
			i = i + 1;
		}
		
		average = gradesSum/10;

		System.out.printf ("%nA média das notas é %d.%n", average);
	}
}