/**Class: Book
* @author Nannette Napier
* @version 1.0
* Course : ITEC 2120 Fall 2013
* Written: September 1, 2013
*
*
* This class represents books for sell.
*
* Purpose: Compute information about books
*/
public class Book
{
  
// Instance Variables
  private String title;       // Title of book
  private String author;      // Author of the vook
  private double price;       // Price of book
  private String genre;       // Type of book
  private String material;    // Hardback, paperback,
  
  // Constructors
  public Book()
  {
    title = "Gone with the Wind";
    author = "Margaret Mitchell";
    price = 4.50;
    genre = "Fiction";
    material = "Hardback";
  }
  
  /**
   * This constructor sets the title, author, and price.
   * @param inTitle The title of the book
   * @param inAuthor The author of the book
   * @param inPrice The price of the book
   */
  public Book(String inTitle, String inAuthor, double inPrice)
  {
    title = inTitle;
    author = inAuthor;
    price = inPrice;
    genre = "Fiction";
    material = "Hardback";
  }

  /**
   * The getTitle method returns the title of the book.
   * @return The book title
   */
  public String getTitle()
  {
    return title;
  }
  
  public double getPrice()
  {
    return price;
  }
  
  /**
   * The setTitle method sets the book title.
   * @param inTitle Title the book should be changed to
   */
  public void setTitle(String inTitle)
  {
    title = inTitle;
  }
  
  public void setPrice(double inPrice)
  {
    price = inPrice;
  }
  
  public void printData()
  {
    System.out.println("Title of book: " + title );
    System.out.println("Author of book: " + author );
    System.out.println("Price of book: " + price);
    System.out.println("Genre of book: " + genre );
    System.out.println("Material: " + material );
  }

/* (non-Javadoc)
 * @see java.lang.Object#toString()
 */
@Override
public String toString()
{
	return "Book [title=" + title + ", author=" + author + ", price=" + price
			+ ", genre=" + genre + ", material=" + material + "]" +
					"\n";
}
  


}