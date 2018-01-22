package ca.bcit.comp1451.lesson1;

import java.util.ArrayList;
import java.util.Iterator;


public class BookStore {
	private ArrayList<Book> books;
	private Book[] bookArray;	

	public static void main(String[] args) {
		BookStore bookstore = new BookStore();
		bookstore.displayBooks();
	}

	public BookStore()
	{
		books = new ArrayList<Book>();
		bookArray = new Book[5];
		
		books.add(new Book("Book A", 2000, 1, 1));
		books.add(new Book("Book B", 2001, 2, 2));
		books.add(new Book("Book C", 2002, 3, 3));
		books.add(new Book("Book D", 2003, 4, 4));
		books.add(new Book("Book E", new Date(2005, 5, 5)));
		
		bookArray[0] = new Book("Book A", 2000, 1, 1);
		bookArray[1] = new Book("Book B", 2001, 2, 2);
		bookArray[2] = new Book("Book C", 2002, 3, 3);
		bookArray[3] = new Book("Book D", 2003, 4, 4);
		bookArray[4] = new Book("Book E", 2004, 5, 5);
		
	}
	
	public void displayBooks()
	{
		Iterator<Book> it = books.iterator();
		
		while(it.hasNext()) 
		{
			Book b = it.next();
			System.out.println(b.getTitle());
			System.out.println(b.getDatePublished());
		}
		
		for (Book book: bookArray)
		{
			System.out.println(book.getTitle());
			System.out.println(book.getDatePublished());
		}
	}
	
	

}

