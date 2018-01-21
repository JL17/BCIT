package ca.bcit.comp1451.jasonharrison.lesson1;

import java.util.Random;
import java.util.Scanner;

public class Game {
	public static void main(String[] args) {
		
		boolean quitting = false;
		Scanner s = new Scanner(System.in);
		
		Random r = new Random();
		
		
		while(!quitting) {
			
			int computerNumber = r.nextInt(5) + 1;
			System.out.println("computer number is " + computerNumber);
			
			System.out.println("enter 1-5 or Q: ");
			if(s.hasNext()) {
				
				if(s.hasNextInt()) {
					
					int i = s.nextInt();
					
					if((i < 1) || (i > 5)) {
						System.err.println("out of range: " + i);
					}else {
						System.out.println("you typed " + i);
						if(computerNumber == i) {
							System.out.println("match");
						}else {
							System.out.println("wrong");
						}
					}
					
				}else {
					
					String input = s.next();
					
					if(input.equalsIgnoreCase("q")) {
						quitting = true;
					}else {
						System.err.println("not a number: "+ input);
					}
					
				}
			}	
		}
		System.out.println("bye");
		s.close();
	}
}
