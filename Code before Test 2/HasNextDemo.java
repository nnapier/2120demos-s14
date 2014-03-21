import java.util.Scanner;

/**Class: HasNextDemo
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

public class HasNextDemo
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		double sum = 0.0;
		int count = 0;
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter temp");
		while ( keyboard.hasNextDouble())
		{
			double temp = keyboard.nextDouble();
			sum = sum + temp;  // sum += temp;
			count++;
		}

		// SOP the average
		System.out.println("Average is " + sum/count);
	}

}
