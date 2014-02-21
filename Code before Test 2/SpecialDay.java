public class SpecialDay
{
  // instance variable
  private int month;
  private int day;
  
  // Constructors
  public SpecialDay(int aMonth, int aDay)
  {
    // Assigning a value to the instance variables
    month = aMonth;
    day = aDay;
  }
  
  // No Arg constructor
  public SpecialDay()
  {
    month = 1;
    day = 1;
  }
  
  
  public String determineHoliday()
  {
    String result = "";
    
    if (month == 11 && day == 11)
    {
      result = "Veteran's Day";
    }
    else if ( month == 1 && day == 1)
    {
      result = "New Year's Day";
    }
    else if ( month == 7 && day == 4)
    {
      result = "Independence Day";
    }
    else
    {
      result = "Not a special day";
    }
    return result;
  }
  
  
  
}