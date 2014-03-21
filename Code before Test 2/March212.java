import java.util.Scanner;

/**Class: March212
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

public class March212
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		int sum = 0;
		Scanner keyboard = new Scanner(System.in);
		System.out.println("enter an integer");
		while ( keyboard.hasNextInt())
		{
			int input = keyboard.nextInt();
			sum += input;
		}
		
		System.out.println("sum : " + sum);
	}

}
