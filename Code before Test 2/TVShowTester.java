/**
 * 
 */

/**
 * @author nnapier
 *
 */
public class TVShowTester {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
TVShow show1 = new TVShow();
TVShow show2 = new TVShow("The Walking Dead", "John Smith", 2013);

System.out.println(show1.getTitle());
System.out.println(show2.getTitle());
	}

}
