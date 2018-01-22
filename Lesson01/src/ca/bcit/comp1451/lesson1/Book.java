package ca.bcit.comp1451.lesson1;

public class Book {
	
	private String title;	
	private Date datePublished;

	public Book(String title, Date datePublished) 
	{
		this.title = title;
		this.datePublished = datePublished;
	}
	
	public Book(String title, int year, int month, int day)
	{
		this.title = title;
		this.datePublished = new Date(year, month, day);
	}

	public String getTitle() 
	{
		return title;
	}

	public void setTitle(String title)
	{
		this.title = title;
	}

	public String getDatePublished() 
	{
		return datePublished.getDate();
	}

	public void setDatePublished(Date datePublished) 
	{
		this.datePublished = datePublished;
	}
	


}