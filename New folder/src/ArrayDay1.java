import java.util.Arrays;

/**Class: ArrayDay1
 * @author Kamilah Kiser
 * @version 1.0
 * Course: ITEC 2120 Spring 2014
 * Written: Mar 28, 2014
 *
 *
 * This class 
 * 
 * Purpose: 
 */

public class ArrayDay1
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int[] age=new int[5];
		System.out.println(Arrays.toString(age));
		
		// To access the value in an array, use []
		age[0] = 19;  // Sets the value at position 0 to 19
		age[1] = 20;  // Sets the value at position 1 to 20
		age[2] = 8;  
		age[3] = 19;
		age[4] = 12;
		System.out.println("After assignment statements: " + Arrays.toString(age));
		
		// Add up all the values in the age array
		int sum = 0;
		for (int i = 0; i < 5; i++)
		{
			sum = sum + age[i];
		}
		System.out.println("Sum of all the ages: " + sum);
		// 1) What is the average age? SOP it as a double
		
		
		// Harder problem (brand new for loop)
		// How many times does the number 19 appear in the array?
		// 2) HINT: This is a counting matches problem like I did
		//       at the beginning of class
		
		
		String[] names=new String[3];
		System.out.println(Arrays.toString(names));
		names[0] = "Jacob";
		names[1] = "Ryan";
		names[2] = "Luca";
		System.out.println("After assignment statements: " + Arrays.toString(names));
		
		double[]temp=new double[5];
		System.out.println(Arrays.toString(temp));
		temp[0] = 98.2;
		temp[1] = 78.1;
		temp[2] = 60.5;
		temp[3] = 90.5;
		temp[4] = 71.4;

	}

}
