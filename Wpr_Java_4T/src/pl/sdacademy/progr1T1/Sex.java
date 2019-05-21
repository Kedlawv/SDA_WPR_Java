package pl.sdacademy.progr1T1;

public enum Sex {
    MAN("M", "man","kobieta"),
    WOMAN("F","woman","mezczyzna");

    private String shortName;
    private String englishName;
    private String polishName;

    Sex(String shortName, String englishName, String polishName) {
        this.shortName = shortName;
        this.englishName = englishName;
        this.polishName = polishName;
    }

    public String getShortName() {
        return shortName;
    }

    public String getEnglishName() {
        return englishName;
    }

    public String getPolishName() {
        return polishName;
    }
}
