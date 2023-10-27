package Dates;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Locale;

public class LocaleTest {
    public static void main(String[] args) {
        Locale brasil = new Locale("pt", "BR");
        Locale eua = new Locale("en", "US");
        Calendar c = Calendar.getInstance();
        c.set(2015, Calendar.DECEMBER, 23);
        DateFormat dfBrasil = DateFormat.getDateInstance(DateFormat.SHORT, brasil);
        DateFormat dfEUA = DateFormat.getDateInstance(DateFormat.SHORT, eua);
        System.out.println(dfBrasil.format(c.getTime()));
        System.out.println(dfEUA.format(c.getTime()));
    }


}
