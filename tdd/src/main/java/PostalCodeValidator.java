public class PostalCodeValidator {
    public boolean isValidPostalCode(String postalCode) {
        if (postalCode == null || postalCode.equals("") || postalCode.length() > 6
                || !postalCode.contains("-")) {
            return false;
        }
        return true;

    }
}
