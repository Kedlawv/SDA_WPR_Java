package pl.sdacademy.exceptions;

public class Bledy {

    public static void podajLiczbe(int val) throws Exception{
        if (val < 0){
            throw new Exception("Ujemna liczba") ;
        }
    }

    public static void main(String[] args) {
        try {
            System.out.println("Dzielimy " + 1 / 1);
        } catch (Exception e) {
            e.printStackTrace();
            e.getMessage();
        }

        try {
            podajLiczbe(10);
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("Koniec");

    }




}
