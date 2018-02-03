package BCIT.COMP1451.A00972783.Lab3a;

public class TestCountry {

	public static void main(String[] args) {
		Country c = new Country(null);
		
		c.setKey();
		c.createHashMap();
		c.showAllMappings();
		
		c.showAllMappings2();
		
		c.doesAnyProvinceContain(null);

	}

}
