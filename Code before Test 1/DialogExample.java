import javax.swing.JOptionPane;

public class DialogExample
{
  public static void main(String[] args)
  {
    String input = JOptionPane.showInputDialog("Enter an input");
    System.out.println("They entered " + input);
    
    // Add another pop-up that asks about the age
    String ageString = JOptionPane.showInputDialog("Please enter your age");
    System.out.println("The age is " + ageString);
    
    // Convert from a String --> Int
    int age = Integer.parseInt(ageString);
    System.out.println("The age as an integer is:
  }
}