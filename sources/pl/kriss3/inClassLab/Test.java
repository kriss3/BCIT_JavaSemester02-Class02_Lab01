package pl.kriss3.inClassLab;

/**
 * Public runner class to play with custom Date class;
 * @author krzysztof szczurowski
 * @see https://github.com/kriss3/BCIT_JavaSemester02-Class02_Lab01.git
 * @since 2017-01-31
 */
public class Test {

	public static void main(String[] args)
	{
		run();
	}
	
	private static void run()
	{
		Date d1 = new Date(16,2,1999);
		String myDay = d1.getDayOfTheWeek();
		System.out.println("What day of the week was: " + d1.toLongString());
		System.out.println("It was: " + myDay);
	}
}
