package learn.localDateTime;

import java.time.*;
import java.time.format.TextStyle;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;
import java.util.Locale;

public class Main {

    public static void main(String[] args) {

        // Day of week and Month Enums

        DayOfWeek dow = DayOfWeek.MONDAY;
        Month m = Month.MAY;
        Locale locale = new Locale("PL");

        System.out.println(dow.getDisplayName(TextStyle.NARROW, locale));
        System.out.println(dow.getDisplayName(TextStyle.SHORT, locale));
        System.out.println(dow.getDisplayName(TextStyle.FULL, locale));

        System.out.println(DayOfWeek.FRIDAY.plus(2).getDisplayName(TextStyle.FULL, locale));

        System.out.println(m.getDisplayName(TextStyle.NARROW, locale));
        System.out.println(m.getDisplayName(TextStyle.SHORT, locale));
        System.out.println(m.getDisplayName(TextStyle.FULL, locale)); // Dlaczego to jest z malej ?
        System.out.println(m.getDisplayName(TextStyle.FULL, new Locale("en"))); // a to z duzej ?


        System.out.println(m.plus(2).getDisplayName(TextStyle.FULL, locale));
        System.out.println(m.maxLength());

        //LocalDate Class

        LocalDate date = LocalDate.of(2015, Month.AUGUST, 21);
        TemporalAdjuster tempAdj = TemporalAdjusters.next(DayOfWeek.MONDAY);
        LocalDate nextMon = date.with(tempAdj);

        System.out.printf("For the date %s next Monday is %s.%n", date, nextMon);

        YearMonth ym1 = YearMonth.now();
        YearMonth ym2 = YearMonth.of(2012, 6);
        YearMonth ym3 = YearMonth.of(2012, Month.JUNE);

        System.out.printf("%s: %d.%n", ym2, ym2.lengthOfMonth());

        MonthDay md1 = MonthDay.of(2, 25);
        System.out.println(md1);

        Year y = Year.of(2045);
        System.out.println(y);

        // Date and Time Classes

        LocalTime ltNow = LocalTime.now();
        System.out.println(ltNow);

        LocalDateTime ldt = LocalDateTime.now();
        System.out.println(ldt);
        LocalDateTime ldt2 = LocalDateTime.of(2015, 11, 23, 22, 5);
        System.out.println(ldt2);
        System.out.println(ldt2.plusDays(20));

    }


}
