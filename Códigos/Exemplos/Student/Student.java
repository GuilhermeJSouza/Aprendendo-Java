//Student.java
//Criação da classe Student

public class Student
{
	//Variáveis de Instância 
	private String name;
	private double average;

	//Construtor
	public Student (String name, double average)
	{
		this.name = name;

		if (average >= 0.0)
		{
			if (average <= 100.0)
			{
				this.average = average;
			}
		}
	}

	public void setName (String name)
	{
		this.name = name;
	}

	public String getName ()
	{
		return name;
	}

	public void setAverage (float average)
	{
		if (average >= 0.0)
		{
			if (average <=100.0)
			{
				this.average = average;
			}
		}
	}

	public double getAverage ()
	{
		return average;
	}

	public String getLetterGrade () //O método busca o average direto do próprio objeto, por isso não é necessário inserir como parâmetro.
	{
		String letterGrade = ""; //inicializa como um string vazia ao invés de null.

		if (average >= 90.0)
		{
			letterGrade = "A";
		}
		else if (average >= 80.0)
		{
			letterGrade = "B";
		}
		else if (average >= 70.0)
		{
			letterGrade = "C";
		}
		else if (average >= 60.0)
		{
			letterGrade = "D";
		}
		else
		{
			letterGrade = "F";
		}
		return letterGrade;
	
	}
}