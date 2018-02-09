package BCIT.comp1451.a00972783.assign1;

import java.util.ArrayList;

public class Setup 
{
	//below will come from Scaner.in
	//setup Players
	private ArrayList<Player> allPlayers;
	
	//Setup Rounds
	private Round round;

	public Setup()
	{
		this.allPlayers = new ArrayList<Player>();
		this.allPlayers.add(new Player("John", "Winner"));
		this.allPlayers.add(new Player("James", "Lost"));
			
		setRound(new Round(1));
	}
	
	public ArrayList<Player> getPlayers()
	{
		return allPlayers;
	}
	
	public void setPlayer(Player value)
	{
		if(value != null)
			allPlayers.add(value);
	}
	
	public Round getRound()
	{
		return round;
	}
	
	public void setRound(Round value)
	{
		if(value != null)
			round = value;
	}
}