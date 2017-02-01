package pl.kriss3.inClassLab;


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
