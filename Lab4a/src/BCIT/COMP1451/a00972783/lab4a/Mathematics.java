package BCIT.COMP1451.a00972783.lab4a;

public class Mathematics {

	public static final double PI = Math.PI;
	public static final double ONE_FOOT_TO_KILOMETER_RATIO = 1 / 3280.8;
		
	public Mathematics() {}	
	
	public static double getCircleArea(double radius) {
		double circleArea = PI * (radius * radius) ;
		return circleArea;
	}
	
	public double getSquareArea(double area) {
		double squareArea = area * area;
		return squareArea;
	}
		
	public double add(double first, double second) {
		double sum = first + second;
		return sum;
	}
	
	public double times(double first, double second) {
		double product = first + second;
		return product;
	}
	
	
	
	
	
	
	

}
