package BCIT.COMP1451.A00972783.Lab2b;
import BCIT.COMP1451.A00972783.Lab2a.*;
import java.util.Random;
import java.util.Scanner;


public class Game {
	
	private final int THIRTYMONTH = 30;
	private final int THIRTYONEMONTH = 31;
	private final int FEB = 28;
	private final int CURRENTYEAR = 2018;
	
	private int randomYear;
	private int randomMonth;
	private int randomDay;
	private String monthString;
	private String dayOfWeek;
	
	public void setMonthString()
	{
		switch(getRandomMonth())
		{
		case 1: monthString = "January";
		break;
		case 2: monthString = "February";
		break;
		case 3: monthString = "March";
		break;
		case 4: monthString = "April";
		break;
		case 5: monthString = "May";
		break;
		case 6: monthString = "June";
		break;
		case 7: monthString = "July";
		break;
		case 8: monthString = "August";
		break;
		case 9: monthString = "September";
		break;
		case 10: monthString = "October";
		break;
		case 11: monthString = "November";
		break;
		case 12: monthString = "December";
		break;
		}
	}
	
	public int getRandomMonth()
	{
		return randomMonth;
	}
	
	public String getMonthString()
	{
		return monthString;
	}
	
	public Date getRandomDate()
	{		
		Random r = new Random();
		
		this.randomYear = r.nextInt(599) + 1600;
		this.randomMonth = r.nextInt(12) + 1;
			
		if(randomMonth == 1 || randomMonth == 3 || randomMonth == 5 || randomMonth == 7 || randomMonth == 8 || randomMonth == 10 || randomMonth == 12)
		{
			randomDay = r.nextInt(THIRTYONEMONTH) + 1;
			Date date = new Date(randomDay, randomMonth, randomYear);
			dayOfWeek = date.getDayOfWeek();
			setMonthString();
			return date;
			
		}
		else if(randomMonth == 2)
		{
			randomDay = r.nextInt(FEB) + 1;
			Date date = new Date(randomDay, randomMonth, randomYear);
			dayOfWeek = date.getDayOfWeek();
			setMonthString();
			return date;
		}		
		else
		{
			randomDay = r.nextInt(THIRTYMONTH) + 1;
			Date date = new Date(randomDay, randomMonth, randomYear);
			dayOfWeek = date.getDayOfWeek();
			setMonthString();
			return date;
		}
		

	}
		
	public void guessTheDate()
	{	
		getRandomDate();
		
		boolean quitting = false;
		
		Scanner s = new Scanner(System.in);

		System.out.println("Welcome to Guess the Date! ");
		System.out.println("Randomly generating date... ");
		System.out.println("... ");
		System.out.println("... ");
		System.out.println("... ");
		System.out.println("Guess the Year (or Q to quit): ");
		
		while(!quitting)
		{	
			boolean guessMonth = false;
			boolean guessDay = false;
			
			if(s.hasNextInt())
			{
				int input = s.nextInt();
				
				if(input == 0)
				{
					System.err.println("Zero is not a valid year. Guess year again: or Q to quit.");
				}	
				else if(input < randomYear)
				{
					System.err.println("incorrect, actual value is higher. Guess year again: Or Q to quit.");
				}
				else if(input > randomYear)
				{
					System.err.println("incorrect, actual value is lower. Guess year again: Or Q to quit.");
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
							
							if(monthInput == 0)
							{
								System.err.println("Zero is not a valid month. Guess month again: Or Q to quit.");
							}
							else if(monthInput < randomMonth)
							{
								System.err.println("incorrect, actual value is higher. Guess month again: Or Q to quit.");
							}
							else if(monthInput > randomMonth)
							{
								System.err.println("incorrect, actual value is lower. Guess month again: Or Q to quit.");
							}

							else
							{
								System.out.println("correct");
							
								System.out.println("Guess the Day: or Q to quit.");
							
									while(!guessDay)
									{
										if(s.hasNextInt())
										{
											int dayInput = s.nextInt();
											
											if(dayInput == 0)
											{
												System.err.println("Zero is not a valid day. Guess day again: Or Q to quit.");
											}
											else if(dayInput < randomDay)
											{
												System.err.println("incorrect, actual value is higher. Guess day again: Or Q to quit.");
											}
											else if(dayInput > randomDay)
											{
												System.err.println("incorrect, actual value is lower. Guess day again: Or Q to quit.");
											}
											else
											{
												System.out.println("correct");
												guessDay = true;
												guessMonth = true;
												setMonthString();
												System.out.println("YOU ARE THE WINNER! The date was: " + getMonthString() + " " + randomDay + ", " + randomYear + ". It was a " + dayOfWeek +". Play again or press Q to quit: ");
												System.out.println();
												getRandomDate();
												System.out.println("Guess the Year: ");
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
												System.out.println("Guess day again: Or Q to Quit.");
											}
										}
							}
							
							}
						}
						else
						{
							String monthStepInput = s.next();
							if(monthStepInput.equalsIgnoreCase("q"))
							{
								System.out.println("quitting, bye");
								quitting = true;
							}
							else
							{
								System.err.println("not a number: " + monthStepInput);
								System.out.println("Guess month again: or Q to Quit.");
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
					System.out.println();
					quitting = true;
				}
				else
				{
					System.err.println("not a number: " + stringInput);
					System.out.println("Guess year again: ");
				}
			}

		
		}
	}
		
	public void guessTheBirthdateDay()
	{
		
		getRandomDate();
		
		Scanner sBirthdate = new Scanner(System.in);
		
		
		int winCount = 0;
		
		System.out.println("Starting new game...");
		System.out.println("Welcome to Guess The Birthdate Day");
		
		System.out.println("Generating random date: ");
		System.out.println();
		
		while(randomYear < 1900 || randomYear > CURRENTYEAR)
		{
			getRandomDate();
		}
		
		System.out.println("Date #1: What day of the week was " + monthString + " " + randomDay + ", " + randomYear + ":");
	
		
		if(sBirthdate.hasNext())
		{
			String input = sBirthdate.next();
			
			if(dayOfWeek.equalsIgnoreCase(input))
			{
				System.out.println("correct");
				winCount++;
				System.out.println("Generating new date... ");
				getRandomDate();
			}
			else
			{
				System.err.println("incorrect");
				System.err.println("It was a " + dayOfWeek);
				System.out.println("Generating new date... ");
				getRandomDate();
			}
		}
		
		while(randomYear < 1900 || randomYear > CURRENTYEAR)
		{
			getRandomDate();
		}
				
		System.out.println("Date #2: What day of the week was " + monthString + " " + randomDay + ", " + randomYear + ":");
		
		
		if(sBirthdate.hasNext())
		{
			String secondInput = sBirthdate.next();
			if(dayOfWeek.equalsIgnoreCase(secondInput))
			{
				System.out.println("correct");
				winCount++;
				System.out.println("Generating new date... ");
				getRandomDate();
			}
			else
			{
				System.err.println("incorrect");
				System.err.println("It was a " + dayOfWeek);
				System.out.println("Generating new date... ");
				getRandomDate();
			}
		}
		
		
		while(randomYear < 1900 || randomYear > CURRENTYEAR)
		{
			getRandomDate();
		}

		System.out.println("Date #3: What day of the week was " + monthString + " " + randomDay + ", " + randomYear + ":");
		
		if(sBirthdate.hasNext())
		{
			String thirdInput = sBirthdate.next();
			if(dayOfWeek.equalsIgnoreCase(thirdInput))
			{
				System.out.println("correct");
				winCount++;
				System.out.println("Generating new date... ");
				getRandomDate();
				
			}
			else
			{
				System.err.println("incorrect");
				System.err.println("It was a " + dayOfWeek);
				System.out.println("Generating new date... ");
				getRandomDate();
			}
		}
		
		
		while(randomYear < 1900 || randomYear > CURRENTYEAR)
		{
			getRandomDate();
		}
		
		System.out.println("Date #4: What day of the week was " + monthString + " " + randomDay + ", " + randomYear + ":");
		
		if(sBirthdate.hasNext())
		{
			String fourthInput = sBirthdate.next();
			if(dayOfWeek.equalsIgnoreCase(fourthInput))
			{
				System.out.println("correct");
				winCount++;
				System.out.println("Generating new date... ");
				getRandomDate();
			}
			else
			{
				System.err.println("incorrect");
				System.err.println("It was a " + dayOfWeek);
				System.out.println("Generating new date... ");
				getRandomDate();
			}
		}
		
		while(randomYear < 1900 || randomYear > CURRENTYEAR)
		{
			getRandomDate();
		}
		
		System.out.println("Date #5: What day of the week was " + monthString + " " + randomDay + ", " + randomYear + ":");
		
		if(sBirthdate.hasNext())
		{
			String fifthInput = sBirthdate.next();
			if(dayOfWeek.equalsIgnoreCase(fifthInput))
			{
				System.out.println("correct");
				winCount++;
				System.out.println("Generating new date... ");
			}
			else
			{				
				System.err.println("incorrect");
				System.err.println("It was a " + dayOfWeek);
			}
		}
		
		System.out.println("You scored " + winCount + " out of 5.  Game Over. Bye. ");
		sBirthdate.close();
	}
}

