package BCIT.COMP1451.A00972873.Lab6a;

public class Pawn extends ChessPiece {

	public Pawn(int points) {
		super(1);
	}

	@Override
	public String toString() {
		String object = null;
		
		if(isWhite == true)
		{
			object = super.toString() + super.getValue();
		}
		else
		{
			object = super.toString() + super.getValue();
		}
		
		return object;
	}

}