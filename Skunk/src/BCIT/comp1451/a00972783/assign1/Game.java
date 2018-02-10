package BCIT.comp1451.a00972783.assign1;
import java.util.Random;
import java.util.Scanner;

public class Game 
{
	private static final int DICE_MIN  = 1;
	private static final int DICE_MAX = 6;
	
	private int totalScore;
	private int roundScore;
	private Scanner sc;
	private Setup s;

	private boolean didSkunked;
	
	public Game()
	{
		sc = new Scanner(System.in);
	}
	
	//Play has access to all settings: Players, Round
	public void Play(Setup s)
	{
		if(s != null)
			this.s = s;
		else
			return;
	
		int d1, d2, roundCounter =0;
		for (int i = 0; i < s.getRound().getNoOfRounds(); i ++) 
		{
		
			while (!didSkunked) 
			{
				
				d1 = getRandomNumber();
				d2 = getRandomNumber();
				
				System.out.println();
				System.out.println("Dice One is " + d1 + " and Dice Two is " + d2);
				
				if (d1 == 1 && d2 == 1) 
				{
					//Check each player's state and if any of them is sitting. Player standing zeroes out
					System.out.println("People standing get zero's");
					for(Player p : s.getPlayers())
					{
						if(p.getPlayerState())
						{
							p.setPlayerScore(0);
						}
					}
					didSkunked = true;
					totalScore = 0;
					roundScore = 0;
					System.out.println("Everyone got skunked, game over. ");
					break;
				}
				else // check each players state and calculate round's score
				{
					roundScore = d1 + d2;
					evaluatePlayers(roundScore);
				}
				
				roundCounter=i+1;
				System.out.println();
				System.out.println("Current score for round " + roundCounter + " is " + roundScore);
				
				if(areAllSitting())
					break;
			}
			
			totalScore += roundScore;
			System.out.println("Total score after round " + roundCounter + " is " + roundScore + ".");
		}
		
		printResults();
		
	}

	private void evaluatePlayers(int roundScore)
	{
		fixPlayersState();
		
		for(Player p : s.getPlayers())
		{
			p.setPlayerScore(roundScore);
		}
	}
	
	private int getRandomNumber()
	{
		Random rnd = new Random();
		return rnd.nextInt((DICE_MAX - DICE_MIN) + 1) + DICE_MIN;
	}
	
	private void fixPlayersState()
	{
		//Ask each player if want so sit, if player already sitting skip
		for(Player p : s.getPlayers())
		{
			if(p.getPlayerState())
			{
				System.out.print("Player " + p.getFirstName() + ".Do you want to sit?[y/n]: ");
				String answ = sc.next();
				if(answ.contentEquals("y") && p.getPlayerState())
					p.setState(false);
			}
		}
	}
	
	private boolean areAllSitting()
	{
		boolean result = true;
		for(Player p : s.getPlayers())
		{
			if(p.getPlayerState())
				result = false;
		}
		return result;
	}

	private void printResults()
	{
		System.out.println("==============");
		
		for(Player p : s.getPlayers())
		{
			System.out.println("Player: " + p.getFirstName() + " has " + p.getPlayerScore() + "points");
		}
		
		System.out.println("Total Score after the game: " + totalScore);
	}
}
