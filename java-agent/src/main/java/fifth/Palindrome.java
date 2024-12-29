package fifth;

public class Palindrome {
    public static void main(String[] args) {
        String word = "civic";

        if (isPalindrome(word)) {
            System.out.println(word + " является палиндромом.");
        } else {
            System.out.println(word + " не является палиндромом.");
        }
    }

    public static boolean isPalindrome(String word) {
        String cleanedWord = word.replaceAll("\\s+", "").toLowerCase();
        String reversedWord = new StringBuilder(cleanedWord).reverse().toString();
        return cleanedWord.equals(reversedWord);
    }
}