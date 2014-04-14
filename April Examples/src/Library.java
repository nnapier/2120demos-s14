import java.util.ArrayList;

/** Class: Library
 * @author Nannette Napier
 * @version 1.0
 * Course: ITEC 2120 Spring 2014
 * Written: Apr 14, 2014
 *
 * This class ---
 * 
 * Purpose:
 */

public class Library
{
	// Instance variables
	private String name;  // Name of library
	private String address; // Address of library
	private ArrayList<Book> bookList;

	// Constructor
	public Library()
	{
		name = "Georgia Gwinnett College Library";
		address = "1000 University Center Lane, Lawrenceville";
		bookList = new ArrayList<Book>();
	}

	/** Get the name
	 * @return the name
	 */
	public String getName()
	{
		return name;
	}

	/** Change the value of the name
	 * @param name the name to set
	 */
	public void setName(String name)
	{
		this.name = name;
	}

	/** Get the address
	 * @return the address
	 */
	public String getAddress()
	{
		return address;
	}

	/** Change the value of the address
	 * @param address the address to set
	 */
	public void setAddress(String address)
	{
		this.address = address;
	}

	/** Get the bookList
	 * @return the bookList
	 */
	public ArrayList<Book> getBookList()
	{
		return bookList;
	}

	/** Change the value of the bookList
	 * @param bookList the bookList to set
	 */
	public void setBookList(ArrayList<Book> bookList)
	{
		this.bookList = bookList;
	}
	
	/**
	 * This method will add the provided book to the
	 * library's bookList
	 * @param inBook
	 */
	public void add(Book inBook)
	{
		bookList.add(inBook);
	}
	
	public String toString()
	{
		return bookList.toString() + "\n";
	}
	
	/**
	 * This method returns the number of books in the library's
	 * bookList
	 * @return Number of books
	 */
	public int countBooks()
	{
		int result = bookList.size();
		
		return result;
	}
	
	/**
	 * This method returns true if there exists a fiction book
	 * in the library's bookList
	 * @return true if fiction book exists in the library
	 */
	public boolean haveFictionBooks()
	{
		boolean result = false;
		
		// Loop through each element of the bookList
		// Use the enhanced for loop
		for (Book element  : bookList)
		{
			// If the genre is "Fiction", set result = true
			if (element.getGenre().equals("Fiction"))
			{
				result = true;
			}
		}
		
		
		return result;
	}
	
	
}





