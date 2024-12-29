package fifth;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class PalindromeTest {

    @Test
    public void testIsPalindrome_True() {
        assertTrue(Palindrome.isPalindrome("madam")); // Палиндром
        assertTrue(Palindrome.isPalindrome("racecar")); // Палиндром
        assertTrue(Palindrome.isPalindrome("level")); // Палиндром
        assertTrue(Palindrome.isPalindrome("deified")); // Палиндром
        assertTrue(Palindrome.isPalindrome("civic")); // Палиндром
    }

    @Test
    public void testIsPalindrome_False() {
        assertFalse(Palindrome.isPalindrome("hello")); // Не палиндром
        assertFalse(Palindrome.isPalindrome("world")); // Не палиндром
        assertFalse(Palindrome.isPalindrome("java")); // Не палиндром
        assertFalse(Palindrome.isPalindrome("example")); // Не палиндром
        assertFalse(Palindrome.isPalindrome("test")); // Не палиндром
    }
}