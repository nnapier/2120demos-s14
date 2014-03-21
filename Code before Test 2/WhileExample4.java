/**Class: WhileExample4
 * @author Kamilah Kiser
 * @version 1.0
 * Course: ITEC 2120 Spring 2014
 * Written: Mar 19, 2014
 *
 *
 * This class 
 * 
 * Purpose: 
 */

public class WhileExample4
{

	public static void main(String[] args)
	{
		int num = 1;	// Represents what we are trying to add
		int sum = 0;	// This will hold the total of all nums
		
		while ( num <= 10)
		{
			sum = sum + num;	// Add the number
			num++;				// Increment the number
		}
		System.out.println("Sum is : " + sum);
	}

}
