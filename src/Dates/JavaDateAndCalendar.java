package Dates;

import java.util.Calendar;
import java.util.Date;

public class JavaDateAndCalendar {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        System.out.println(c.get(Calendar.DAY_OF_MONTH));
        System.out.println(c.get(Calendar.MONTH));
        System.out.println(c.get(Calendar.YEAR));
        System.out.println(c.get(Calendar.HOUR_OF_DAY));
        System.out.println(c.get(Calendar.MINUTE));
        System.out.println(c.get(Calendar.SECOND));
        System.out.println(c.get(Calendar.DAY_OF_YEAR));
        c.add(Calendar.HOUR, 24);
        c.add(Calendar.MONTH, 24);
        Date date = c.getTime();
        System.out.println(date);
    }
}
