package pl.sdacademy.progr1T1;

public class RaceResult {
    private Person driver;
    private Result result;

    public RaceResult(Person driver, Result result) {
        this.driver = driver;
        this.result = result;
    }

    public RaceResult(Person driver) {
        this.driver = driver;
    }

    public Person getDriver() {
        return driver;
    }

    public Result getResult() {
        return result;
    }

    public void setResult(Result result) {
        this.result = result;
    }

    @Override
    public String toString() {
        return "RaceResult{" +
                "driver=" + driver +
                ", result=" + result +
                '}';
    }
}
