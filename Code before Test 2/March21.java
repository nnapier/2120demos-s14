import java.util.Scanner;

/**Class: March21
 * @author Kamilah Kiser
 * @version 1.0
 * Course: ITEC 2120 Spring 2014
 * Written: Mar 21, 2014
 *
 *
 * This class 
 * 
 * Purpose: 
 */

public class March21
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		boolean keepLooping = true;
		Scanner keyboard = new Scanner(System.in);
		String name = keyboard.nextLine();  // Read in the name
		while (keepLooping)
		{
			System.out.println("Please enter a name: ");
			name = keyboard.nextLine();  // Read in the name
			if ( name.equalsIgnoreCase( "end") )
			{
				keepLooping = false;
			}
		}

	}

}
