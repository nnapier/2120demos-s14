import java.util.Scanner;

public class HiFiveDemo
{
  public static void main(String[] args)
  {
    Scanner keyboard = new Scanner(System.in);
    System.out.println("Please enter a positive number:");
    
    // Read in the number typed in by the user
    int num = keyboard.nextInt();
    
    if ( num%5 == 0)  // this means divisible by 5
    {
      System.out.println("Hi, five");
    }
    
    // Check for negative number
    if (num < 0)
    {
      System.out.println("Next time, follow directions!");
    }
  }
}