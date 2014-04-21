/** Class: CharacterDemo
 * @author Nannette Napier
 * @version 1.0
 * Course: ITEC 2120 Spring 2014
 * Written: Apr 21, 2014
 *
 * This class ---
 * 
 * Purpose:
 */

public class CharacterDemo
{
	public static String checkSSN2(String ssn)
	{
		String result =  "";
		// Count the number of digits in ssn
		int count = 0;
		for (int i=0; i<ssn.length(); i++)
		{
			char letter =ssn.charAt(i);
			if(Character.isDigit(letter))
			{
				count++;
			}
		}
		// do the if statement to set result equal
		// to "Valid SSN" or "Invalid SSN"
		if(ssn.length() == 11 && 
				ssn.charAt(3) == '-' &&
				ssn.charAt(6) == '-' &&
				count == 9)
		{
			result = "Valid SSN";
		}
		else
		{
			result = "Invalid SSN";
		}
		return result;
	}
	 
	public static String checkSSN(String ssn)
	{
		String result = "";
		if(ssn.length() == 11 && 
				Character.isDigit(ssn.charAt(0)) &&
				Character.isDigit(ssn.charAt(1)) &&
				Character.isDigit(ssn.charAt(2)) &&
				Character.isDigit(ssn.charAt(4)) &&
				Character.isDigit(ssn.charAt(5)) &&
				Character.isDigit(ssn.charAt(7)) &&
				Character.isDigit(ssn.charAt(8)) &&
				Character.isDigit(ssn.charAt(9)) &&
				Character.isDigit(ssn.charAt(10)) &&
				ssn.charAt(3) == '-' &&
				ssn.charAt(6) == '-')
		{
			result = "Valid SSN";
		}
		else
		{
			result = "Invalid SSN";
		}
		return result;
	}

	public static int countNumLetters(String str)
	{
		int count = 0;
		for(int i = 0; i < str.length(); i++)
		{
			char letter =str.charAt(i);
			if(Character.isLetter(letter))
			{
				count++;
			}
		}
		return count;
	}
	
	
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		System.out.println(CharacterDemo.countNumLetters("1234 ABC"));
		System.out.println(CharacterDemo.countNumLetters("Hello"));
		System.out.println(CharacterDemo.checkSSN("012-34-5678"));
		System.out.println(CharacterDemo.checkSSN("012-34"));
	}

}
