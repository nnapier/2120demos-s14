import javax.swing.JOptionPane;

public class CylinderStats
{
  public static void main(String[] args)
  {
    String radiusString = JOptionPane.showInputDialog("Enter the radius");
    String lengthString = JOptionPane.showInputDialog("Enter the length");
    
    // Convert from String --> double
    double radius = Double.parseDouble(radiusString);
    
    // How to do the calculations?
    double area = Math.pow(radius,2) * 3.14159;
  }
}