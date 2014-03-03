import java.util.Scanner;
public class StringForLoopDemo
{
  public static void main(String[] args)
  {
    // Create the Scanner object
    Scanner keyboard = new Scanner(System.in);
    
    // Ask user to enter a String
    System.out.println("Please enter a String");
    String name = keyboard.nextLine();
    
    // Look at each character in the String.
    // Increment count if the character is a vowel
    // ('a', 'e', 'i', 'o', or 'u')
    int count = 0;
    for (int i=0; i<name.length(); i++)
    {
      if (name.charAt(i) == 'a' ||
          name.charAt(i) == 'e' ||
          name.charAt(i) == 'i' ||
          name.charAt(i) == 'o' ||
          name.charAt(i) == 'u' )
      {
        count++;
      }      
    }
    System.out.println("Count is: " + count);
  
    // Build a String that consists of every-other-letter
    // of the original String. 
    String result = "";
    for (int i=0; i<name.length(); i= i+2)
    {
      result = result + name.charAt(i);
    }
    // SOP this new String
    System.out.println("The new String is: " + result);
  
  } 
}