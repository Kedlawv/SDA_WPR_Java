package pl.sdacademy.progr1T1;

public enum ColorCard {
    KARO("dzwonek"),
    KIER("czerwo"),
    PIK("wino"),
    TREFL("zoladz"),
    JOKER_RED("czerwony_joker"),
    JOKER_BLACK("czarny_joker");


    String altName;

    ColorCard(String altName){
        this.altName = altName;

    }

}
