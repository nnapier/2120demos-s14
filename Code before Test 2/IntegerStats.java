import java.util.Scanner;
public class IntegerStats
{
  public static void main(String[] args)
  {
    Scanner keyboard = new Scanner(System.in);
    int count = 0;
    
    for (int i=1; i<=4; i++)
    {
      System.out.println("Please enter a number:");
      int num = keyboard.nextInt();
      if ( num < 10 )
      {
        count++;
      }
    }
    System.out.println("Count of numbers less than 10: " + count);
  }
}