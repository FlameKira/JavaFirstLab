package first;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ForExampleTest {

    @Test
    public void testPrint_FizzBuzz() {
        assertEquals("35. fizzbuzz", ForExample.print(35));
        assertEquals("70. fizzbuzz", ForExample.print(70));
        assertEquals("105. fizzbuzz", ForExample.print(105));
    }

    @Test
    public void testPrint_Fizz() {
        assertEquals("5. fizz", ForExample.print(5));
        assertEquals("10. fizz", ForExample.print(10));
        assertEquals("20. fizz", ForExample.print(20));
    }

    @Test
    public void testPrint_Buzz() {
        assertEquals("7. buzz", ForExample.print(7));
        assertEquals("14. buzz", ForExample.print(14));
        assertEquals("21. buzz", ForExample.print(21));
    }

    @Test
    public void testPrint_Neutral() {
        assertEquals("1.", ForExample.print(1));
        assertEquals("2.", ForExample.print(2));
        assertEquals("3.", ForExample.print(3));
        assertEquals("4.", ForExample.print(4));
        assertEquals("6.", ForExample.print(6));
        assertEquals("8.", ForExample.print(8));
        assertEquals("9.", ForExample.print(9));
        assertEquals("11.", ForExample.print(11));
        assertEquals("12.", ForExample.print(12));
        assertEquals("13.", ForExample.print(13));
        assertEquals("16.", ForExample.print(16));
    }
}