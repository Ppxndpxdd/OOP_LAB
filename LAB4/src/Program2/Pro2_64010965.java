package Program2;

import java.util.GregorianCalendar;

public class Pro2_64010965 {
    public static void main(String[] args) {
        GregorianCalendar gcal = new GregorianCalendar();
        
        System.out.println("Current year, month, date, and day of week");
        System.out.println("Year is " + gcal.get(GregorianCalendar.YEAR));
        System.out.println("Month is " + gcal.get(GregorianCalendar.MONTH));
        System.out.println("Date is " + gcal.get(GregorianCalendar.DATE));
        System.out.println("Day of week is " + gcal.get(GregorianCalendar.DAY_OF_WEEK));

        gcal.add(GregorianCalendar.DATE, 1);

        System.out.println("------------");
        System.out.println("After specified the elapsed time of one day after current day");
        System.out.println("Year is " + gcal.get(GregorianCalendar.YEAR));
        System.out.println("Month is " + gcal.get(GregorianCalendar.MONTH));
        System.out.println("Date is " + gcal.get(GregorianCalendar.DATE));
        System.out.println("Day of week is " + gcal.get(GregorianCalendar.DAY_OF_WEEK));
        System.out.println(gcal.getTime());
    }
}
