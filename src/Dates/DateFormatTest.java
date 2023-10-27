package Dates;

import java.text.DateFormat;
import java.util.Calendar;

public class DateFormatTest {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        DateFormat[] dfa = new DateFormat[5];
        dfa[0] = DateFormat.getDateInstance();
        dfa[1] = DateFormat.getDateInstance(DateFormat.SHORT);
        dfa[2] = DateFormat.getDateInstance(DateFormat.MEDIUM);
        dfa[3] = DateFormat.getDateInstance(DateFormat.LONG);
        dfa[4] = DateFormat.getDateInstance(DateFormat.FULL);
        for (DateFormat df : dfa) {
            System.out.println(df.format(c.getTime()));
        }
    }


}
