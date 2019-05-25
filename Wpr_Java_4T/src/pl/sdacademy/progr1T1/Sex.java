package pl.sdacademy.progr1T1;

public enum Sex {
    MAN("M", "man","mezczyzna"),
    WOMAN("F","woman","kobieta");

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

    public static Sex getByShortName(String shortName){
        for(Sex sex : Sex.values()){
            if (sex.shortName.equals(shortName)){
                return sex;
            }
        }
        return null;
    }
}
