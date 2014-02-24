import java.util.Scanner;

public class StringDemoPart2
{
  public static void main(String[] args)
  {
    Scanner keyboard = new Scanner(System.in);
    System.out.println("please enter first name: ");
    String firstName = keyboard.nextLine();
    
    System.out.println("please enter last name: ");
    String lastName = keyboard.nextLine();
    
    System.out.println("Total number of characters is: " + 
                       ( firstName.length() + lastName.length() ));
    System.out.println("First as all uppercase: " + 
                       firstName.toUpperCase() );
    System.out.println("Last as all lowercase: " + 
                       lastName.toLowerCase() );
    System.out.println("First same as last? " +
                       firstName.equals( lastName ) );
  }
}