package BCIT.COMP1451.A00972783.Lab3a;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Country {
	
	
	
	private String[][] provinces = new String[10][2];
	private HashMap<String, Country> countries;
	
	private String provinceName;
	
	public Country(String provinceName)
	{
		this.provinceName = provinceName;
	}
	
	public String getProvinceName() {
		return provinceName;
	}
		
	public void setProvinceName(String provinceName) {
		this.provinceName = provinceName;
	}

	public void setKey() 
	{
	provinces[0][0]="ab";
	provinces[1][0]="bc";
	provinces[2][0]="mb";
	provinces[3][0]="nb";
	provinces[4][0]="nl";
	provinces[5][0]="ns";
	provinces[6][0]="on";
	provinces[7][0]="pe";
	provinces[8][0]="qc";
	provinces[9][0]="sk";
	
	provinces[0][1]="alberta";
	provinces[1][1]="british columbia";
	provinces[2][1]="manitoba";
	provinces[3][1]="new brunswick";
	provinces[4][1]="newfoundland";
	provinces[5][1]="nova scotia";
	provinces[6][1]="ontario";
	provinces[7][1]="prince edward island";
	provinces[8][1]="quebec";
	provinces[9][1]="saskatchewan";
	}
		
	public void createHashMap()
	{
		countries = new HashMap<String, Country>();
		
		for (int row = 0; row < provinces.length; row++)
		{
		countries.put(provinces[row][0], new Country(provinces[row][1]));		
		}
	}
	
	
	public void showAllMappings()
	{
		Set<Map.Entry<String, Country>> set = countries.entrySet();
		for(Map.Entry<String, Country> c: set)
		{
			System.out.println(c.getKey() + " => " + c.getValue().getProvinceName());
		}
	}
	
	public void showAllMappings2()
	{
		Set<String> keys = countries.keySet();
		
		Iterator<String> it = keys.iterator();
		
		while(it.hasNext())
		{
			String province = it.next();
			
			Country oneCountry = countries.get(province);
			
			String cap = oneCountry.getProvinceName().substring(0, 1).toUpperCase() + oneCountry.getProvinceName().substring(1);
			
			System.out.println("The province " + cap + " has the abbreviation of " + province);
			
		}	
	}
	
	public boolean doesAnyProvinceContain(String substring)
	{
		
		countries = new HashMap<String, Country>();
		
		Set<String> keys = countries.keySet();
		
		
		
		return true;
	}
	
	
	
}
