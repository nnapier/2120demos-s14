
public class TVShow {
	//   Instance variables
	private String title;
	private String producer;
	private int year;
	
	// No-arg Constructor
	public TVShow()
	{
		title = "Basketball Wives";
		producer = "VH1";
		year = 2014;	
	}
	
	// 3-arg Constructor
	public TVShow(String inTitle, String inProducer, int inYear)
	{
		title = inTitle;
		producer = inProducer;
		year = inYear;
	}
	
	// Getters and Setters

	/** Returns the title
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}

	/** Returns the producer's name
	 * @return the producer
	 */
	public String getProducer() {
		return producer;
	}

	/**
	 * @return the year
	 */
	public int getYear() {
		return year;
	}

	/**
	 * @param title the title to set
	 */
	public void setTitle(String inTitle) {
		title = inTitle;
	}

	/**
	 * @param producer the producer to set
	 */
	public void setProducer(String producer) {
		this.producer = producer;
	}

	/**
	 * @param year the year to set
	 */
	public void setYear(int year) {
		this.year = year;
		
		
		
		
	}
}
