package fourth;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class WhileExampleTest {

    @Test
    public void testCount() {
        assertEquals(0.25, WhileExample.count(2), 1e-6);
        assertEquals(0.1, WhileExample.count(3), 1e-6);
        assertEquals(0.05555555555555555, WhileExample.count(4), 1e-6);
        assertEquals(0.03571428571428571, WhileExample.count(5), 1e-6);
        assertEquals(0.025, WhileExample.count(6), 1e-6);
    }
}