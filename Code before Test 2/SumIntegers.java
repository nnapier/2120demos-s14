import java.util.Scanner;

public class SumIntegers
{
  public static void main(String[] args)
  {
    Scanner keyboard = new Scanner(System.in);
    
    int sum = 0;
    for (int i=0; i<5; i++)
    {
      System.out.println("Please enter an integer");
      int num = keyboard.nextInt();
      sum += num;  // This is the same as
                   // sum = sum + num;
    }
    
    System.out.println("Sum is " + sum);
    double average = sum/5.0;
    System.out.println("Average is " + average);
  }
}