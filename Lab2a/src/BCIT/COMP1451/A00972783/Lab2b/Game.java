package BCIT.COMP1451.A00972783.Lab2b;
import BCIT.COMP1451.A00972783.Lab2a.*;
import java.util.Random;
import java.util.Scanner;

public class Game {
	
	private final int THIRTYMONTH = 30;
	private final int THIRTYONEMONTH = 31;
	private final int FEB = 28;
	
	private int randomYear;
	private int randomMonth;
	private int randomDay;
	
	Random r = new Random();
	
	public Date getRandomDate()
	{

		this.randomYear = r.nextInt(599) + 1600;
		this.randomMonth = r.nextInt(12) + 1;
			
		if(randomMonth == 1 || randomMonth == 3 || randomMonth == 5 || randomMonth == 7 || randomMonth == 8 || randomMonth == 10 || randomMonth == 12)
		{
			int randomThirtyOneDay = r.nextInt(THIRTYONEMONTH) + 1;
			System.out.println("Year: " + randomYear);
			System.out.println("Month: " + randomMonth);
			System.out.println("Day: " + randomThirtyOneDay);
			System.out.println("31 day Month");
			Date date = new Date(randomThirtyOneDay, randomMonth, randomYear);
			return date;
			
		}
		else if(randomMonth == 2)
		{
			int randomFebDay = r.nextInt(FEB) + 1;
			System.out.println("Year: " + randomYear);
			System.out.println("Month: " + randomMonth);
			System.out.println("Day: " + randomFebDay);
			System.out.println("Feb Month");
			Date date = new Date(randomFebDay, randomMonth, randomYear);
			return date;
		}		
		else
		{
			int randomThirtyDay = r.nextInt(THIRTYMONTH) + 1;
			System.out.println("Year: " + randomYear);
			System.out.println("Month: " + randomMonth);
			System.out.println("Day: " + randomThirtyDay);
			System.out.println("30 day Month");
			Date date = new Date(randomThirtyDay, randomMonth, randomYear);
			return date;
		}
	}
		
	public void guessTheDate()
	{
		

		System.out.println("Guess the Year: ");
		Scanner s = new Scanner(System.in);
		int input = s.nextInt();
		
		
		if(randomYear == input)
		{
			System.out.println("correct");
		}
		else
		{
			System.out.println("incorrect, your guess: " + input + ". answer: " + randomYear);
		}
		
	}

	
}

