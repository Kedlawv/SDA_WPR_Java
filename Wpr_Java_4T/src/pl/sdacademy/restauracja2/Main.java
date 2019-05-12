package pl.sdacademy.restauracja2;


public class Main {

    private static void log(String text){
        System.out.println(text);
    }

    public static void main(String[] args) {
        Zamowienie obiad1 = new Zamowienie();
        obiad1.setPierwszeDanie(new Zupa("Barszcz", 10));
        obiad1.setDrugieDanie(new DrugieDanie("Pierogi", 15));
        obiad1.setDeser(new Deser("Lody", 20));

        log("Obiad1");
        log("Zamówienie: \n" + obiad1);
        log("Wartosc: " + obiad1.wartoscZamowienia());
    }
}
