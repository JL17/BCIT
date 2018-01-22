package ca.bcit.comp1451.lesson1;

public class Date {
	private final int year;
	private final int month;
	private final int day;
	
	Date(int year, int month, int day)
	{
		this.year = year;
		this.month = month;
		this.day = day;
	}
	
	public int getYear() {
		return year;
	}

	public int getMonth() {
		return month;
	}

	public int getDay() {
		return day;
	}
	
	public String getDate()
	{
		return year + "-" + month + "-" + day;	
	}
	
}
