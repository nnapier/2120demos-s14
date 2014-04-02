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
		System.out.println(book1);  // Automatically calls toString

		// Create a book2
		Book book2 = new Book();
		
		// Create a book3
		Book book3 = new Book();
				
		// Create a book4
		Book book4 = new Book();
		
		// Create an array of 4 Books
		Book[] books = new Book[4];
		System.out.println(Arrays.toString(books));
		
		// Assign book1 to the first position of the array
		books[0] = book1;
		
		// Assign book2 to the second position of the array
		books[1] = book2;
		
		System.out.println(Arrays.toString(books));
		
	}

}
