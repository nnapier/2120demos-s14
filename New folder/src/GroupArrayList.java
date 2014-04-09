import java.util.ArrayList;

/**Class: GroupArrayList
 * @author Kamilah Kiser
 * @version 1.0
 * Course: ITEC 2120 Spring 2014
 * Written: Apr 9, 2014
 *
 *
 * This class 
 * 
 * Purpose: 
 */

public class GroupArrayList
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		// 2. Create an ArrayList of Strings called group
		ArrayList<String> group  = new ArrayList<String>();
		
		// 3. Add your name and four other names to group
		group.add("Nannette");
		group.add("John");
		group.add("Jacob");
		group.add("Allen");
		group.add("Perry");

		// 4. SOP size of group
		int length = group.size();
		System.out.println("Option 1: Size is " + length);
		
		System.out.println("Option 2: Size is " + group.size());
		
		// 5. SOP the 3rd element in group
		//     (is at index 2)
		System.out.println("3rd element is " + group.get(2));
		
		// 6. SOP group
		System.out.println("Group is " + group);
		
		// 7. Use enhanced for loop
		for (String element : group)
		{
			System.out.println(element);
		}
	}

}
