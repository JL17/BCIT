package BCIT.comp1451.a00972783.assign1;

public class Player 
{
	private String firstName;
	private String lastName;
	private boolean isStanding;
	private int playerScore;
	
	public Player(String firstName, String lastName)
	{
		this.firstName = firstName;
		this.lastName = lastName;
		this.playerScore = 0;
		setState(true);
	}
	
	public String getFirstName()
	{
		return this.firstName;
	}
	
	public void setFirstName(String value)
	{
		this.firstName = value.equals("") || value == null ? "Steve" : value;
	}
	
	public boolean getPlayerState()
	{
		return this.isStanding;
	}
	
	public void setState(boolean value)
	{
		this.isStanding = value;
	}
	
	public int getPlayerScore()
	{
		return this.playerScore;
	}
	
	public void setPlayerScore(int value)
	{
		this.playerScore = value;
	}
	
	public String toString()
	{
		return String.format("%s %s", firstName, lastName);
	}
}