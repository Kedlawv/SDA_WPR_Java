package pl.sdacademy.datacwiczenia;


import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Date;

public class DataTest {

    public static boolean hasFriday13(int rok, int miesiac){
        LocalDate date = LocalDate.of(rok,miesiac,13);
        if (date.getDayOfWeek().equals(DayOfWeek.FRIDAY)){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date.getTime());

        LocalTime czas = LocalTime.now();
        System.out.println("Nowa czas: " + czas);

        LocalDateTime czasData = LocalDateTime.now();
        System.out.println("Nowa czas i data: " + czasData);
        LocalDateTime bozeNarodzenie = LocalDateTime.of(2019,12,
                25,19,00);
        System.out.println("Boze narodzenie wypada w " + bozeNarodzenie.getDayOfWeek());

        for(int rok = 2019; rok <= 2030; rok++){
            for(int miesiac = 1; miesiac<=12; miesiac++){
                if(hasFriday13(rok,miesiac)){
                    System.out.println(rok + " " + miesiac + " ma trzynastego w piatek");
                }
            }
        }

    }
}
