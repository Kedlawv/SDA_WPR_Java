package prog1;

public enum Result {
    FIRST(1, "ZWYCIEZCA"),
    SECOND(2, "Drugi"),
    THIRD(3, "Trzeci"),
    FOURTH(4, "Czwarty");

    private int place;
    private String placeName;

    Result(int place, String placeName) {
        this.place = place;
        this.placeName = placeName;
    }

    public int getPlace() {
        return place;
    }

    public String getPlaceName() {
        return placeName;
    }
}
