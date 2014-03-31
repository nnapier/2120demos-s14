import java.util.Arrays;
import java.util.Scanner;

/**Class: StringArray
 * @author Kamilah Kiser
 * @version 1.0
 * Course: ITEC 2120 Spring 2014
 * Written: Mar 31, 2014
 *
 *
 * This class 
 * 
 * Purpose: 
 */

public class StringArray
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		String[] names = new String[8];
		System.out.println(Arrays.toString(names));
		Scanner keyboard = new Scanner(System.in);
		for(int i=0; i<names.length; i++)
		{
			System.out.println("Please enter a name: ");
			String name = keyboard.nextLine();
			names[i] = name;
		}
		// SOP the first element of the array
		System.out.println(names[0]);
		
		// SOP the last element of the array
		System.out.println(names[7]);
		System.out.println("Last element is: " + 
							names[ names.length-1] );
		
		// Example 2: 
		int count = 0;
		for (int i=0; i<names.length; i++)
		{
			// if the length > 5 count++
			if (names[i].length()>5)
			{
				count++;
			}
		}
		System.out.println(count);

		
		// Example 3: Setup a for loop that will SOP each
		//            element in the array, starting from the end
		//            and going up to the beginning
		System.out.println("--------- Printing Backwards ---------");
		for (int i=names.length-1; i>=0; i--)
		{
			System.out.println(names[i]);
		}
		
		
	}

}
