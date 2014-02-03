public class Book
{
  // Instance variables
  private String title;     // Title of book
  private String author;    // Author of the book
  private double price;     // Price of the book
  private String genre;     // Type of the book
  private String material;  // Hardback, paperback, etc.
  
  // Constructor
  /** Method: Book
    * No argument constructor for the Book class
    */
  public Book()
  {
    title = "Calculus book";
    author = "Briggs";
    price = 160;
    genre = "Textbook";
    material = "Hardback";
  }
  
  /** Method: Book 
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
  
  /**  setTitle
   *   @param inTitle New title
   */ 
  public void setTitle(String inTitle)
  {
    title = inTitle;
  }
  
  /** setAuthor
    * @param inAuthor New author
    */
  public void setAuthor(String inAuthor)
  {
    author = inAuthor;
  }
  
  /** setPrice
    * @param inPrice New price
    */
  public void setPrice( double inPrice )
  {
    price = inPrice;
  }
  
  public void setGenre( String inGenre)
  {
    genre = inGenre;
  }
  
  /** 
   * The getTitle method returns the title of the book.
   * @return The book title
   */
  public String getTitle()
  {
    return title;
  }
  
  /**
   * The getPrice method returns the price of the book.
   * @return The book price
   */ 
  public double getPrice()
  {
    return price;
  }
  
  public void printData()
  {
    System.out.println("Title of book: " + title);
    System.out.println("Author of book: " + author);
    System.out.println("Price of book: " + price);
    System.out.println("Genre of book: " + genre);
    System.out.println("Material: " + material);
    System.out.println("My name is Nannette Napier");
  }
}