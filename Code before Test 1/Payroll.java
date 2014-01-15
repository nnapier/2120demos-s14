import java.util.Scanner;

// Nannette Napier
public class Payroll
{
  public static void main(String[] main)
  {
    // Creating a Scanner object to read user input
    Scanner keyboard = new Scanner(System.in);
    
    // Ask the user for his/her name
    System.out.println("What is your name?");
    String name = keyboard.nextLine();
    
    // SOP the person's name
    System.out.println(name);
    
    // Ask the user for his/her birthday
    System.out.println("What is your birthday?");
    String birthday = keyboard.nextLine();
    
    // SOP the person's birthday
    System.out.println(birthday);
    
    // Ask the user how many classes he/she is taking
    System.out.println("How many classes are you taking?");
    int num = keyboard.nextInt();
    
    System.out.println("The number of classes is: " + num + " and your name is " + name);
    System.out.print("The number of classes is: " );
    System.out.println(num);
  }
}