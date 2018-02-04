package BCIT.COMP1451.a00972783.lab4a;

import java.util.Random;

public class Mathematics {

	public static final double PI = Math.PI;
	public static final double ONE_FOOT_TO_KILOMETER_RATIO = 1 / 3280.8;
	public static final int ZERO = 0;
		
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
		double product = first * second;
		return product;
	}
	
	public double subtract(double first, double second) {
		double difference = first - second;
		return difference;
	}
	
	public int divide(int first, int second) {
		
		if(second == ZERO) {
			return ZERO;
		}
		else {
			int division = first / second;
			return division;
		}
	}
	
	public int absoluteValue(int input) {
		int abs = Math.abs(input);
		return abs;
	}
	
	public int getRandomNumberBetweenTenAndTwentyButNotFifteen(){
		Random r = new Random();
		boolean isFifteen = false;
		int randomNumber = 0;
		
		while(!isFifteen)
		{
		randomNumber = r.nextInt(11) + 10;
			if(randomNumber != 15)
			{	
				isFifteen = true;					
			}
		}
		
		return randomNumber;
	}
	
	public double convertFeetToKilometers(double input) {
		double conversion = input * ONE_FOOT_TO_KILOMETER_RATIO;
		System.out.println(conversion);
		return conversion;
	}
	
	public Integer doubleTheNumber(Integer input) {
		Integer number = new Integer(input);
		number *= 2;
		return number;
	}

}
