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

	
	public Date getRandomDate()
	{		
		Random r = new Random();
		
		this.randomYear = r.nextInt(599) + 1600;
		this.randomMonth = r.nextInt(12) + 1;
			
		if(randomMonth == 1 || randomMonth == 3 || randomMonth == 5 || randomMonth == 7 || randomMonth == 8 || randomMonth == 10 || randomMonth == 12)
		{
			randomDay = r.nextInt(THIRTYONEMONTH) + 1;
			System.out.println("Year: " + randomYear);
			System.out.println("Month: " + randomMonth);
			System.out.println("Day: " + randomDay);
			System.out.println("31 day Month");
			Date date = new Date(randomDay, randomMonth, randomYear);
			return date;
			
		}
		else if(randomMonth == 2)
		{
			randomDay = r.nextInt(FEB) + 1;
			System.out.println("Year: " + randomYear);
			System.out.println("Month: " + randomMonth);
			System.out.println("Day: " + randomDay);
			System.out.println("Feb Month");
			Date date = new Date(randomDay, randomMonth, randomYear);
			return date;
		}		
		else
		{
			randomDay = r.nextInt(THIRTYMONTH) + 1;
			System.out.println("Year: " + randomYear);
			System.out.println("Month: " + randomMonth);
			System.out.println("Day: " + randomDay);
			System.out.println("30 day Month");
			Date date = new Date(randomDay, randomMonth, randomYear);
			return date;
		}
	}
		
	public void guessTheDate()
	{
		boolean quitting = false;
		boolean guessMonth = false;
		boolean guessDay = false;
		
		Scanner s = new Scanner(System.in);	
		
		System.out.println("Guess the Year: ");
		
		while(!quitting)
		{
			
			if(s.hasNextInt())
			{
				int input = s.nextInt();
				
				if(input < randomYear)
				{
					System.err.println("incorrect, actual value is higher. Guess year again: ");
				}
				else if(input > randomYear)
				{
					System.err.println("incorrect, actual value is lower. Guess year again: ");
				}
				else
				{
					System.out.println("correct");
					
					System.out.println("Guess the Month: ");
					
					
					while(!guessMonth)
					{
						if(s.hasNextInt())
							{	
							int monthInput = s.nextInt();
					
							if(monthInput < randomMonth)
							{
								System.err.println("incorrect, actual value is higher. Guess month again: ");
							}
							else if(monthInput > randomMonth)
							{
								System.err.println("incorrect, actual value is lower. Guess month again: ");
							}
							else
							{
								System.out.println("correct");
							
								System.out.println("Guess the Day: ");
							
									while(!guessDay)
									{
										if(s.hasNextInt())
										{	
											int dayInput = s.nextInt();
								
											if(dayInput < randomDay)
											{
												System.err.println("incorrect, actual value is higher. Guess day again: ");
											}
											else if(dayInput > randomDay)
											{
												System.err.println("incorrect, actual value is lower. Guess day again: ");
											}
											else
											{
												System.out.println("correct");
												guessDay = true;
												guessMonth = true;
												System.out.println("YOU ARE THE WINNER! Type in a year to play again. Q for quit");
											}
										}	
										else
										{
											String stringInput = s.next();
											if(stringInput.equalsIgnoreCase("q"))
											{
												System.out.println("quitting, bye");
												quitting = true;
												guessDay = true;
												guessMonth = true;
											}
											else
											{
												System.err.println("not a number: " + stringInput);
												System.out.println("Guess day again: ");
											}
										}
							}
							
							}
						}
						else
						{
							String stringInput = s.next();
							if(stringInput.equalsIgnoreCase("q"))
							{
								System.out.println("quitting, bye");
								quitting = true;
								guessMonth = true;
							}
							else
							{
								System.err.println("not a number: " + stringInput);
								System.out.println("Guess month again: ");
							}
						}
				}
			}	
		}
			else
			{
				String stringInput = s.next();
				if(stringInput.equalsIgnoreCase("q"))
				{
					System.out.println("quitting, bye");
					quitting = true;
				}
				else
				{
					System.err.println("not a number: " + stringInput);
					System.out.println("Guess year again: ");
				}
			}
		}
		
		s.close();
	}

	
}

