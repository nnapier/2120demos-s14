import java.util.Arrays;

/**Class: BookTester
 * @author Kamilah Kiser
 * @version 1.0
 * Course: ITEC 2120 Spring 2014
 * Written: Apr 2, 2014
 *
 *
 * This class 
 * 
 * Purpose: 
 */

public class BookTester
{	
	public static void main(String[] args)
	{
		// Create a book1 object using 3-arg constructor
		Book book1 = new Book("Title", "Author", 19.95);
		System.out.println("Book 1: " + book1);  // Automatically calls toString

		// Create a book2
		Book book2 = new Book();
		System.out.println("Book 2: " + book2);  // Automatically calls toString
		
		// Create a book3
		Book book3 = new Book();
		System.out.println("Book 3: " + book3);  // Automatically calls toString
			
	}

}
