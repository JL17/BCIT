package ca.bcit.comp1451.a00972783.lab1b;

public class Person {


	private String firstName;
	private String lastName;
	private int birthYear;
	double x;

	
	public Person(String firstName, String lastName, int birthYear)
	{
		setFirstName(firstName);
		setLastName(lastName);
		setBirthYear(birthYear);
	}
	
	public String getDetails()
	{
		return getFirstName() + " " + getLastName() + " was born in " + getBirthYear() + ". X value is = " + x;
	}
	
	public String getFirstName() 
	{
		return firstName;
	}

	private void setFirstName(String firstName) 
	{
		if(firstName != null)
		{
			this.firstName = firstName;
		}
		else
		{
			System.out.println("error, null value");
		}
	}

	public String getLastName() 
	{
		return lastName;
	}

	private void setLastName(String lastName) 
	{
		if(lastName != null)
		{
			this.lastName = lastName;
		}
		else
		{
			System.out.println("error, null value");
		}
	}

	public int getBirthYear() 
	{
		return birthYear;
	}

	private void setBirthYear(int birthYear) 
	{
		if(birthYear != 0)
		{
			this.birthYear = birthYear;
		}
		else
		{
			System.out.println("error, value cannot be zero");
		}
		
		
	}
	
	public double getX()
	{
		return x;
	}
	
	public void setX(double x)
	{
		this.x = x;
	}

}
