import org.junit.Before;
import org.junit.Test;
import static org.hamcrest.CoreMatchers.*;

import static org.junit.Assert.*;

public class RachunekTest {

    private Rachunek rachunek;

    @Before
    public void createRachunek(){
        rachunek = new ROR("test_bank");
    }

    @Test
    public void createsCorrectIBAN_ROR(){ //TODO rachunek is null for some reason , looks like there
                                            // is something wrong with @Before
        // also accNo does not reset between tests

        String expectedIban = "test_bank1000000000ROR";
        String actualIban = rachunek.getIBAN();

        assertThat(actualIban, equalTo(expectedIban));

    }

    @Test
    public void accNoForFirstAccCreated(){

        int expectedAccAfterOneAccCreated = 1_000_000_000;
        int actualAccNo = Rachunek.accNo;

        assertThat(actualAccNo, equalTo(expectedAccAfterOneAccCreated));

    }
}
