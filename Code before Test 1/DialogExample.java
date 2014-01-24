import javax.swing.JOptionPane;

public class DialogExample
{
  public static void main(String[] args)
  {
    String string = JOptionPane.showInputDialog( 
                       null, "Enter a year:", "Example 2.2 Input (int)",
                       JOptionPane.WARNING_MESSAGE);
    // Use a message dialog box to show what they entered
    JOptionPane.showMessageDialog( null,
            "The year entered " + string,
            "Display Message",
            JOptionPane.INFORMATION_MESSAGE);
                                  
    //System.out.println("The year entered " + string);
    
    String input = JOptionPane.showInputDialog("Enter an input");
    //System.out.println("They entered " + input);
    JOptionPane.showMessageDialog( null,
            "They entered " + input,
            "Display Message",
            JOptionPane.INFORMATION_MESSAGE);
    
    // Add another pop-up that asks about the age
    String ageString = JOptionPane.showInputDialog("Please enter your age");
    //System.out.println("The age is " + ageString);
    JOptionPane.showMessageDialog( null,
            "The age is " + ageString,
            "Display Message",
            JOptionPane.INFORMATION_MESSAGE);
    
    // Convert from a String --> Int
    int age = Integer.parseInt(ageString);
    //System.out.println("The age as an integer is: " + age);
    JOptionPane.showMessageDialog( null,
            "The age as an integer is: " + age,
            "Display Message",
            JOptionPane.INFORMATION_MESSAGE);
  }
}