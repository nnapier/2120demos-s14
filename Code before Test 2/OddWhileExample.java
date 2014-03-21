/**Class: OddWhileExample
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

public class OddWhileExample
{

	public static void main(String[] args)
	{
		int num = 1;
		
		while ( num <= 50)
		{
			// If the num is odd, SOP it
			if (num %2 == 1)
			{
				System.out.println("Odd number is: " + num);
			}
			num++;
		}

	}

}
