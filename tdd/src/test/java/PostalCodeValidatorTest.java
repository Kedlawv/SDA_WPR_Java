import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.junit.jupiter.params.provider.ValueSource;

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

    @ParameterizedTest
    @NullAndEmptySource
    void falseIfEmptyOrNullAnottation(String postalCode){

        boolean result = psValidator.isValidPostalCode(postalCode);

        assertFalse(result);

    }



    @ParameterizedTest
    @ValueSource(strings = {"324235234","3453462456","6586795673"})
    void falseIfLongerThan6(String postalCode){

        boolean result = psValidator.isValidPostalCode(postalCode);

        assertFalse(result);
    }

    @Test
    void falseIfNoDash(){
        postalCode = "123456";

        boolean result = psValidator.isValidPostalCode(postalCode);

        assertFalse(result);
    }
}