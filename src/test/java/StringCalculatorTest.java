import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class StringCalculatorTest {

    public StringCalculator stringCalculator;

    @BeforeEach
    public void setUp() {
        stringCalculator = new StringCalculator();
    }

    @AfterEach
    public void tearDown() {
        stringCalculator = null;
    }

//    @Test
//    public void addTest1() {
//        int result = stringCalculator.add("1,1000");
//        assertEquals(1,result);
//    }
//
//    @Test
//    public void addTest2() {
//        Throwable exception = assertThrows(IllegalArgumentException.class, ()-> {
//            stringCalculator.add("-1,5");
//            }, "Negative number is not allowed.");
//    }

    @Test
    public void addTest3() {
        int result = stringCalculator.add("1,2");
        assertEquals(3,result);
    }

}
