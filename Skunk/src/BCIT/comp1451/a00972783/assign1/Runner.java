package BCIT.comp1451.a00972783.assign1;

public class Runner 
{
	public static void main(String[] args)
	{
		System.out.println("Let's Play Skunk :D ");
		Run();
		System.out.println("Game Over, thanks for playing! ");
	}
	
	private static void Run()
	{
		Setup skunk = new Setup();
		Game game = new Game();
		game.Play(skunk);
	}
}