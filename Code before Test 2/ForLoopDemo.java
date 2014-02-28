public class ForLoopDemo
{
  public static void main(String[] args)
  {
    // Example 1: Repeat I will not write on the wall
    //System.out.println("I will not write on the wall.");
    //System.out.println("I will not write on the wall.");
    //System.out.println("I will not write on the wall.");
    //System.out.println("I will not write on the wall.");
    //System.out.println("I will not write on the wall.");
    
    // Example 1: Using a for loop
    for ( int i = 0; i < 5; i++ )
    {
      System.out.println("I will not write on the wall.");
    }
    
    // Example 2
    for ( int i = 1; i <= 5; i++)
    {
      System.out.println("Number is " + i );
    }
    
    // Example 3
    for ( int i = 6; i<=10; i++)
    {
      System.out.println("Number is " + i );
    }
    
    // Example 4
    String str = "Friday is today";
    for (int i =0; i < str.length(); i++)
    {      
      System.out.println(str.charAt(i) );
    }
    
  }
}