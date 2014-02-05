public class Pair
{
  // Instance variables
  private double number1;
  private double number2;
  
  // Constructor
  public Pair(double inNumber1, double inNumber2)
  {
    number1 = inNumber1;
    number2 = inNumber2;
  }
  
  public double sum()
  {
    double result = 0;  // create local variable
    
    result = number1 + number2; // process the instance variables
    
    return result; // return results
  }
  
  public double multiplied()
  {
    double result = 0;
    result = number1 * number2;
    return result;    
  }
  
  public void printData()
  {
    System.out.println("Number 1 is : " + number1);
    System.out.println("Number 2 is : " + number2);
  }
  
}