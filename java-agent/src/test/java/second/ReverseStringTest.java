package second;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReverseStringTest {

    @Test
    public void testReverse_NormalString() {
        assertEquals("llatsni em", ReverseString.reverse("me install"));
        assertEquals("tallim", ReverseString.reverse("millat"));
        assertEquals("gnirts", ReverseString.reverse("string"));
    }

    @Test
    public void testReverse_EmptyString() {
        assertEquals("", ReverseString.reverse(""));
    }

    @Test
    public void testReverse_SingleCharacter() {
        assertEquals("a", ReverseString.reverse("a"));
        assertEquals("Z", ReverseString.reverse("Z"));
    }

    @Test
    public void testReverse_Spaces() {
        assertEquals("  ", ReverseString.reverse("  "));
        assertEquals("s t a r t", ReverseString.reverse("t r a t s"));
    }

    @Test
    public void testReverse_Palindrome() {
        assertEquals("madam", ReverseString.reverse("madam"));
        assertEquals("racecar", ReverseString.reverse("racecar"));
    }
}