package pl.sdacademy.stringtest;

public class StringUtils {

    public int textLength(String str) {
        if (str != null) {
            return str.length();
        }
        return 0;
    }

    public String toUpper(String str) {
        if (str != null) {
            return str.toUpperCase();
        }
        return "Error";
    }

    public String replace(String str) {
        if (str != null) {
            return str.replace(" ", "_");
        }
        return "Error";
    }

    public String[] split(String str) {

        if (str != null) {
            str.trim();
            return str.split(" ");

        }
        return new String[0];
    }

    public int findLetter(String str, String letter) {
        if (str != null) {
            return str.toLowerCase().indexOf(letter.toLowerCase());
        }
        return -1;
    }
}
