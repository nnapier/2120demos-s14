public class BookTester
{
  public static void main(String[] args)
  {
    // Create an object by calling the constructor
    //  book1 - name of the object
    //  Book  - name of the class
    Book book1 = new Book();
    
    // Example of calling a method 
    book1.getTitle();
    
    // Since this method returns a value, we
    // will SOP the value returned
    System.out.println("The title for book1 is: " + book1.getTitle() );
    System.out.println("The price for book1 is: " + book1.getPrice() );
    
    Book book2 = new Book();
    
    // Example of calling a method
    book2.setTitle( "Intro to Java Programming" );
    book2.setAuthor( "Liang" );
    book2.setPrice( 110.0 );
    
    // Call instance method on the object
    //  book1 - name of the object
    //  printData - name of the method
    book1.printData();
    
    book2.printData();
    
  }
}