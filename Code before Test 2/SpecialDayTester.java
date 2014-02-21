import java.util.Scanner;

public class SpecialDayTester
{
  public static void main(String[] args)
  {
    // Create a Scanner object to get input from
    // the keyboard
    Scanner keyboard = new Scanner(System.in);
    
    System.out.println("Please input the month.");
    int month = keyboard.nextInt();
    
    // Check if the month is valid
    if ( month > 12 || month < 1)
    {
       System.out.println("You entered an invalid month");
    }
    
    System.out.println("Please input the day.");
    int day = keyboard.nextInt();
    if (day > 31 || day < 1)
    {
      System.out.println("You entered an invalid day");
    }
    
    // Construct SpecialDay object
    SpecialDay specialDay1 = new SpecialDay(month, day);
    
    // SOP determineHoliday method
    System.out.println( specialDay1.determineHoliday() );
  }
}