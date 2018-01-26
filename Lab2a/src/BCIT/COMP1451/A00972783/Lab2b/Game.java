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
			System.out.println("Year: " + randomYear);
			System.out.println("Month: " + randomMonth);
			System.out.println("Day: " + randomDay);
			System.out.println("31 day Month");
			Date date = new Date(randomDay, randomMonth, randomYear);
			dayOfWeek = date.getDayOfWeek();
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
			dayOfWeek = date.getDayOfWeek();
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
			dayOfWeek = date.getDayOfWeek();
			return date;
		}
	}
		
	public void guessTheDate()
	{
		boolean quitting = false;
		
		Scanner s = new Scanner(System.in);

		System.out.println("Guess the Year: ");	
		
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
		s.close();
	}
	
	
	
	public void guessTheBirthdateDay()
	{
		System.out.println(dayOfWeek);
		Scanner s = new Scanner(System.in);
		
		boolean quitting = false;
		boolean secondInputGuess = false;
		boolean thirdInputGuess = false;
		boolean fourthInputGuess = false;
		boolean fifthInputGuess = false;
		int winCount = 0;
		
		if(winCount < 5)
		{
		while(!quitting)
		{
			System.out.println("Guess Day of Week");
			
			if(s.hasNext())
			{
				String input = s.next();
						
					if(dayOfWeek.equalsIgnoreCase(input))
					{
						System.out.println("Correct");
						System.out.println();
						System.out.println("2nd Random Date");
						getRandomDate();

						System.out.println(dayOfWeek);
						winCount++;
						System.out.println("win count is: " + winCount);
						
						
						while(!secondInputGuess)
						{
							System.out.println("Guess Day of Week (2ndTime)");
							
						if(s.hasNext())
						{							
							String secondInput = s.next();
							if(dayOfWeek.equalsIgnoreCase(secondInput))
							{
								System.out.println("Correct");
								System.out.println();
								System.out.println("3rd Random Date");
								getRandomDate();
								System.out.println(dayOfWeek);
								winCount++;
								System.out.println("win count is: " + winCount);
								
								
								while(!thirdInputGuess)
								{
									System.out.println("Guess Day of Week (3rdTime)");
									
								if(s.hasNext())
								{

									String thirdInput = s.next();
									if(dayOfWeek.equalsIgnoreCase(thirdInput))
									{
										System.out.println("Correct");
										System.out.println();
										
										System.out.println("4th Random Date");
										getRandomDate();
										System.out.println(dayOfWeek);
										winCount++;
										System.out.println("win count is: " + winCount);
										
										while(!fourthInputGuess)
										{
											System.out.println("Guess Day of Week (4th Time)");
											
											if(s.hasNext())
											{
												String fourthInput = s.next();
												if(dayOfWeek.equalsIgnoreCase(fourthInput))
												{
													System.out.println("Correct");
													System.out.println();
													
													System.out.println("5th Random Date");
													getRandomDate();
													System.out.println(dayOfWeek);
													winCount++;
													System.out.println("win count is: " + winCount);
													
													while(!fifthInputGuess)
													{
														System.out.println("Guess Day of Week (5th Time)");
														
														if(s.hasNext())
														{
															String fifthInput = s.next();
															if(dayOfWeek.equalsIgnoreCase(fifthInput))
															{
																System.out.println("Correct");
																winCount++;
																fifthInputGuess = true;
																fourthInputGuess = true;
																thirdInputGuess = true;
																secondInputGuess = true;
																quitting = true;
															}
															
															else
															{
																System.out.println("incorrect try again");
															}
														}
													}
												
													
												}
												else
												{
													System.out.println("incorrect, guess again: ");
												}
											}											
										}
									
									}
									else
									{
										System.err.println("incorrect, guess again: ");
									}
								}
								}
								
							}
							else
							{
								System.err.println("incorrect, guess again.");
							}
						}
						}
					}
					else
					{
						System.out.println("incorrect, try again");
					}
				
			}
	    }
		}
		System.out.println("Congrats, You Win! Until next time, bye!");
		s.close();
	}
}

