package BCIT.comp1451.a00972783.assign1;

import java.util.ArrayList;

public class Setup 
{
	//setup players
	private ArrayList<Player> allPlayers;
	
	//Setup rounds
	private Round round;

	public Setup()
	{
		this.allPlayers = new ArrayList<Player>();
		this.allPlayers.add(new Player("Steve", "Winner"));
		this.allPlayers.add(new Player("Terra", "Lost"));
			
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