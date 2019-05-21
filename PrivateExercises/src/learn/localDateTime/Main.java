package learn.localDateTime;

import java.time.DayOfWeek;
import java.time.Month;
import java.time.format.TextStyle;
import java.util.Locale;

public class Main {

    public static void main(String[] args) {
        DayOfWeek dow = DayOfWeek.MONDAY;
        Month m = Month.MAY;
        Locale locale = new Locale("PL");

        System.out.println(dow.getDisplayName(TextStyle.NARROW, locale));
        System.out.println(dow.getDisplayName(TextStyle.SHORT, locale));
        System.out.println(dow.getDisplayName(TextStyle.FULL, locale));

        System.out.println(DayOfWeek.FRIDAY.plus(2).getDisplayName(TextStyle.FULL,locale));

        System.out.println(m.getDisplayName(TextStyle.NARROW, locale));
        System.out.println(m.getDisplayName(TextStyle.SHORT, locale));
        System.out.println(m.getDisplayName(TextStyle.FULL, locale)); // Dlaczego to jest z malej ?
        System.out.println(m.getDisplayName(TextStyle.FULL, new Locale("en"))); // a to z duzej ?


        System.out.println(m.plus(2).getDisplayName(TextStyle.FULL, locale));
        System.out.println(m.maxLength());


    }



}
