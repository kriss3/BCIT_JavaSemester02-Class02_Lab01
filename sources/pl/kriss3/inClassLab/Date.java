package pl.kriss3.inClassLab;

import java.time.Month;

/**
 * Class Date to represent custom Date objects;
 * @author krzysztof szczurowski
 * @see https://github.com/kriss3/BCIT_JavaSemester02-Class02_Lab01.git
 * @since 2017-01-31
 */
public class Date 
{
	private int day;
	private int month;
	private int year;
	
	/**
	 * Ctor for Date class
	 * @param day as Int
	 * @param month month as Int
	 * @param year as Int
	 */
	public Date(int day, int month, int year) 
	{
		setDay(day);
		setMonth(month);
		setYear(year);
	}

	// Properties
	public int getDay() 
	{
		return day;
	}

	public void setDay(int day) 
	{
		this.day = day;
	}
	
	public int getMonth() 
	{
		return month;
	}
	
	public void setMonth(int month) 
	{
		this.month = month;
	}
	
	public int getYear() 
	{
		return year;
	}
	
	public void setYear(int year) 
	{
		this.year = year;
	}
	
	// Date(1 1 2016) = 1st January 2016
	public String getDayOfTheWeek()
	{
		boolean isLeapYear = isLearpYear(year);
		
		int y2d = year % 100;
		
		int step1 = y2d / 12;
		
		int step2 = (y2d - (step1 * 12));
		
		int step3 =  ((y2d - ((y2d % 100) / 12) * 12)) / 4;
		
		String val = Month.values()[month-1].toString();
		
		int monthValue = MonthMap.valueOf(val).getNumericValue();
		
		//Step 5 value need to be decide based on isLeapYear and century we are calculating a day
		int step5 = evaluate(isLeapYear, month, year);
		
		int step6 = ((step1 + step2 + step3 + day + monthValue) + step5 ) % 7;
		
		String day = DayMap.values()[step6].toString();
		
		return day;
	}
	
	//package accessibility
	boolean isLearpYear(int year)
	{
		boolean result = false;
		
		if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0))
			result = true;
		
		return result;
	}
	
	int evaluate(boolean isLeapYear, int month, int currentYear)
	{
		int result = 0;
		if(isLeapYear && (month == 1 || month == 2))
		{
			result = -1;
			return result;
		}
		
		int century = Integer.parseInt(("" + year).substring(0, 2));
		
		switch(century)
		{
		case 16:
		case 20:
			result = 6;
			break;
		case 17:
		case 21:
			result = 4;
			break;
		case 18:
			result = 2;
			break;
		}
		
		return result;
	}

	//03-11-1996 - 3 of November 1996
	public String toString()
	{
		return String.format("%4d-%02d-%02d", year, month, day);
	}
	
	//November 3, 1996
	public String toLongString()
	{
		return String.format("%s %02d, %4d",Month.of(month), day, year);
	}
}
