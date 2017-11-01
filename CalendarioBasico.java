/**
 * This is a basic calendar.
 * @Fran Álvarez DAM1
 * @1/11/2017 
 */
public class CalendarioBasico
{
    // Day in the calendar
    private int day;
    // Month in the calendar
    private int month;
    // Year in the calendar
    private int year;

    /**
     * Constructor for objects of class CalendarioBasico
     */
    public CalendarioBasico()
    {
        // Create an object of class CalendarioBasico
        day = 01;
        month = 01;
        year = 01;
    }
    
    /**
     * Set a date in the calendar 
     */
    public void setDate(int setDay, int setMonth, int setYear)
    {
        day = setDay;
        month = setMonth;
        year = setYear;
    }
    
    /**
     * Advances one day in the calendar
     */
    public void oneDay()
    {
        if (day == 30)
        {
            if (month == 12)
            {
                // if month is 12, month gets 01 and +1 year
                day = 01;
                month = 01;
                year += 1;
            }
            else
            {
                // if day is 30 but month isnt 12 month = 01 and +1 z
                day = 01;
                month += 1;
            }
        }
        else
        {
            day += 1;
        }
    }
    
}
