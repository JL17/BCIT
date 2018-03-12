package BCIT.COMP1451.A00972873.Lab6a;

public class ChessPiece {
	public boolean isWhite;
	public int points;
	
	public ChessPiece (int points) {
		this.points = points;		
	}
	
	public void Move() {
		
		System.out.println("moving...");
		
	}
	
	public String toString() {
		String object = null;
		
		if(isWhite == true)
		{
			object = "white" + getClass().getSimpleName();
		}
		else
		{
			object = "black" + getClass().getSimpleName();
		}
		
		return object;
		
	}
	
	public int getValue() {
		return points;
	}
	

}
