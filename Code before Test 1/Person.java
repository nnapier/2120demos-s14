public class Person
{
  // Instance variables
  private String name;
  private double height;
  private String eyeColor;
  
  // Constructor
  public Person()
  {
    name = "John Doe";
    height = 60.2;
    eyeColor = "Brown";
  }
  
  // Instance methods
  public void printData()
  {
    System.out.println("Name is " + name);
    System.out.println("Height is " + height);
    System.out.println("Eye color is " + eyeColor);
  }
}