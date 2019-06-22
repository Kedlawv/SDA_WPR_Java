import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import static org.junit.jupiter.api.Assertions.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)

class PostalCodeValidatorTest {


    public PostalCodeValidator psValidator;
    public String postalCode;

    @BeforeAll
    public void createPostalValidator(){
        psValidator = new PostalCodeValidator();
    }

    @Test
     void falseIfNull() {
        //Arrange
        postalCode = null;

        //Act

        boolean result = psValidator.isValidPostalCode(postalCode);

        //Assert

        assertFalse(result);
    }

    @Test
    void falseIfEmpty(){
        postalCode = "";

        boolean result = psValidator.isValidPostalCode(postalCode);

        assertFalse(result);

    }

    @Test
    void falseIfLongerThan6(){
        postalCode = "1234567";

        boolean result = psValidator.isValidPostalCode(postalCode);

        assertFalse(result);
    }
}