package BCIT.COMP1451.A00972783.Lab2a;

public class Date {
	private int day;
	private int month;
	private int year;
	private int monthCode;
	private int dayOfWeekCode;
	private String dayOfWeek;	
	
	private final int JAN = 1;
	private final int FEB = 4;
	private final int MAR = 4;
	private final int APR = 0;
	private final int MAY = 2;
	private final int JUN = 5;
	private final int JUL = 0;
	private final int AUG = 3;
	private final int SEP = 6;
	private final int OCT = 1;
	private final int NOV = 4;
	private final int DEC = 6;
	
	public Date() {}
	
	public Date(int day, int month, int year)
	{
		this.day   = day;
		this.month = month;
		this.year  = year;
	}

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
	
	public boolean isLeapYear()
	{
		boolean leapYear = false;
		if((getYear() % 4 == 0) && (getYear() % 100 !=0) || (getYear() % 400 == 0))
		{
			leapYear = true;
		}
		
		return leapYear;
	}
	
	public int getMonthCode()
	{		
		switch(getMonth())
		{
		case 1: monthCode = JAN;
		break;
		case 2: monthCode = FEB;
		break;
		case 3: monthCode = MAR;
		break;
		case 4: monthCode = APR;
		break;
		case 5: monthCode = MAY;
		break;
		case 6: monthCode = JUN;
		break;
		case 7: monthCode = JUL;
		break;
		case 8: monthCode = AUG;
		break;
		case 9: monthCode = SEP;
		break;
		case 10: monthCode = OCT;
		break;
		case 11: monthCode = NOV;
		break;
		case 12: monthCode = DEC;
		break;
		}
		
		if((getYear() >= 1600) && (getYear() <= 1699) && (isLeapYear() == true))
		{
			monthCode += 6;
		}
		
		if((getYear() >= 1700) && (getYear() <= 1799) && (isLeapYear() == true))
		{
			monthCode += 4;
		}
		
		if((getYear() >= 1800) && (getYear() <= 1899) && (isLeapYear() == true))
		{
			monthCode += 2;
		}
		
		if((getYear() >= 2000) && (getYear() <= 2099) && (isLeapYear() == true))
		{
			monthCode += 6;
		}
		
		if((getYear() >= 2100) && (isLeapYear() == true))
		{
			monthCode += 4;
		}
		
		return monthCode;
	}
		
	public String getDayOfWeek()
	{
	
		//grab last 2 digits of the year eg: 1989 becomes 89
		int lastTwoDigits  = getYear() % 100;
		
		//get remainder of the last 2 digits of the year divided by 12 eg: 7 12's go into 89
		int howManyTwelves = lastTwoDigits / 12;
		
		//eg: 89 - 7 * 12
		int remainder = lastTwoDigits - howManyTwelves * 12;
		
		//how many fours go into the value found by previous operation
		int howManyFours = remainder / 4;
		
		//add all previous results		
		int addAllNumbers = howManyTwelves + remainder + howManyFours + getDay() + getMonthCode();
		
		dayOfWeekCode = addAllNumbers % 7;
		
		switch(dayOfWeekCode)
		{
		case 0: dayOfWeek = "Saturday";
		break;
		case 1: dayOfWeek = "Sunday";
		break;
		case 2: dayOfWeek = "Monday";
		break;
		case 3: dayOfWeek = "Tuesday";
		break;
		case 4: dayOfWeek = "Wednesday";
		break;
		case 5: dayOfWeek = "Thursday";
		break;
		case 6: dayOfWeek = "Friday";
		break;
		}		
		
		return dayOfWeek;
	}
	
	public void printDetails()
	{	
		System.out.println("Birthdate: " + getMonth() + "-" + getDay() + "-" + getYear());
		System.out.println("Leap Year?: " + isLeapYear());
		System.out.println("You were born on a " + getDayOfWeek() + ".");
	}
		
}
