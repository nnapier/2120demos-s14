import java.util.Scanner;

public class PairTester
{
  public static void main(String[] args)
  {
    // Step 1: Create the keyboard object
    Scanner keyboard = new Scanner(System.in);
    
    // Step 2: Ask user for Number1
    System.out.println("Please enter Number1:");
    double value1 = keyboard.nextDouble();
    
    // Step 3: Ask user for Number2
    System.out.println("Please enter Number2:");
    double value2 = keyboard.nextDouble();
    
    // Step 4: Construct a Pair object called pair3
    Pair pair3 = new Pair( value1, value2);
    
    // Step 5: Call printData on the pair3 object
    pair3.printData();
    
    // Step 6: Call sum on the pair3 object and SOP the result
    System.out.println("The sum is " + pair3.sum() );
    
    System.out.println("Multiplied is " + pair3.multiplied() );
    
  }
}