//StudentTest.java

public class StudentTest
{
	public static void main (String[] args)
	{
		Student dumb1 = new Student ("Jane Green", 93.5);
		Student dumb2 = new Student ("John Blue", 72.75);

		System.out.printf ("%n%s's grade is %.2f, concept %s.%n", dumb1.getName(), dumb1.getAverage(), dumb1.getLetterGrade());
		System.out.printf ("%s's grade is %.2f, concept %s.%n", dumb2.getName(), dumb2.getAverage(), dumb2.getLetterGrade());
	}
}