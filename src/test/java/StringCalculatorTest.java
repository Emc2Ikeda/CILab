import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringCalculatorTest {

    private CILabInterface myString;

    @BeforeEach
    public void setUp() {
        stringCalculator = new StringCalculator();
    }

    @AfterEach
    public void tearDown() {
        stringCalculator = null;
    }

    @Test
    public void detectCapitalUseTest1() {
        int result = stringCalculator.add(1,1000);
        assertEquals(1,result);
    }

//    @Test
//    public void detectCapitalUseTest2() {
//        asssertThrows(stringCalculator.add(-1,100));
//    }

}
