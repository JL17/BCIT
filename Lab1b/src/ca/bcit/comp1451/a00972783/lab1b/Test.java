package ca.bcit.comp1451.a00972783.lab1b;

public class Test {
	

	public static void main(String[] args) {
		
		int count = args.length;
		
		if(count == 4)
		{
		Person p = new Person(args[0], args[1], Integer.parseInt(args[2]));
		p.x = Double.parseDouble(args[3]);
	
		System.out.println(p.getDetails());
	    }
		
		else
		{
			System.out.println("Wrong number of arguments");
		}	
	

	}
}