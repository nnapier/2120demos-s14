/**
 * This class should be used to test your TVShow class
 * used as a lab 
 */
public class NapierTVShowTester
{
  public static void main(String[] args)
  {
    int countErrors = 0;
    TVShow show1 = new TVShow();
    show1.setProducer("Napier");
    show1.setTitle("This is my show");
    
    if (show1.getEpisodeCost() != 5 ||
        show1.getEmmyNominations() != 3 ||
        show1.getEmmyWins() != 0)
    {
      countErrors++;
      System.err.println("Problem with NO-arg constructor.");
      System.err.println("Did you use the default values on the Lab sheet?");
    }
    
    TVShow aShow = new TVShow("Big Bang Theory", "Marshall", 2014);
    if (aShow.getEpisodeCost() != 10 ||
        aShow.getEmmyNominations() != 4 ||
        aShow.getEmmyWins() != 1)
    {
      countErrors++;
      System.err.println("Problem with 3-arg constructor.");
      System.err.println("Did you use the default values on the Lab sheet?");
    }
    
    if ( !aShow.getTitle().equals("Big Bang Theory") ||
         !aShow.getProducer().equals("Marshall") ||
         aShow.getYear() != 2014)
    {
       countErrors++;
      System.err.println("Problem with 3-arg constructor.");
      System.err.println("Did you use the parameter variables to set instance variables?");
    }
    
    if ( !aShow.assessCost().equals("High") ||
         !show1.assessCost().equals("Middle") )
    {
      countErrors++;
      System.err.println("Problems with assessCost");
    }
    
    if ( !aShow.isTopProducer() ||
         show1.isTopProducer() )
    {
      countErrors++;
      System.err.println("Problems with isTopProducer");
    }
    
    if ( aShow.countSpacesInTitle() != 2 ||
         show1.countSpacesInTitle() != 3)
    {
      countErrors++;
      System.err.println("Problems with countSpacesInTitle");
    }

    System.out.println("Total number of errors: " + countErrors);
  }
}