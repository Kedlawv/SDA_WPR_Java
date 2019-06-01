package learn.localDateTime;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.format.TextStyle;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;
import java.time.temporal.TemporalUnit;
import java.util.Formatter;
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

        // https://docs.oracle.com/javase/tutorial/datetime/iso/datetime.html

        DateTimeFormatter format = DateTimeFormatter.ofPattern("d MMM yyyy -- HH:mm z");
        LocalDateTime ldt3 = LocalDateTime.of(2019,5,12,19,30);
        ZoneId zid = ZoneId.of("Poland");
        ZonedDateTime zdt = ZonedDateTime.of(ldt3,zid);
        String out1 = zdt.format(format);

        System.out.println("Not formatted: " + zdt);
        System.out.println("Formatted : " + out1 + " " + zid);
        System.out.println("\n\n\n_________________Instant Class_____________________");

        Instant timeStamp = Instant.now();
        System.out.println(timeStamp);
        Instant timeStamp2 = Instant.now().plusSeconds(60*60+15);
        System.out.println(timeStamp2);
        long secondsFromEpoch = Instant.ofEpochSecond(0l).until(Instant.now(), ChronoUnit.SECONDS);
        System.out.println(secondsFromEpoch);

        timeStamp2 = timeStamp2.plus(2,ChronoUnit.HOURS);
        System.out.println(timeStamp2);

        LocalDateTime ldtInst = LocalDateTime.ofInstant(timeStamp2,ZoneId.systemDefault());
        System.out.println(ldt);

        System.out.println("\n\n\n\n______________Parse and Format____________");

        String inputString = new String("24.06.1985");
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        String inputStringFromDate = LocalDate.now().toString();


        try {
            LocalDate pfDate = LocalDate.parse(inputString,formatter);
            System.out.println(pfDate);
        } catch (DateTimeParseException e) {
            System.out.printf("%s in not parsable%n.", inputString);
            e.printStackTrace();
        }catch (DateTimeException e){
            System.out.printf("%s is not a valid pattern?");
        }





    }


}
