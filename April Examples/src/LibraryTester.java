/** Class: LibraryTester
 * @author Nannette Napier
 * @version 1.0
 * Course: ITEC 2120 Spring 2014
 * Written: Apr 14, 2014
 *
 * This class ---
 * 
 * Purpose:
 */

public class LibraryTester
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		Library myLibrary = new Library();
		Book book1 = new Book();
		Book book2 = new Book();
		Book book3 = new Book();
		
		myLibrary.add(book1);
		myLibrary.add(book2);
		myLibrary.add(book3);
		
		System.out.println(myLibrary);
		System.out.println( myLibrary.getAveragePrice() );

	}

}
