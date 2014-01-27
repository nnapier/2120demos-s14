public class Book
{
  // Instance variables
  private String title;     // Title of book
  private String author;    // Author of the book
  private double price;     // Price of the book
  private String genre;     // Type of the book
  private String material;  // Hardback, paperback, etc.
  
  // Constructor
  public Book()
  {
    title = "Calculus book";
    author = "Briggs";
    price = 160;
    genre = "Textbook";
    material = "Hardback";
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