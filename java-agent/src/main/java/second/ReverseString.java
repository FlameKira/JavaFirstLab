package second;

public class ReverseString {
    public static void main(String[] args) {
        String str = "make install";
        System.out.println(reverse(str));
    }

    public static String reverse(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            result += str.charAt(str.length() - i - 1);
        }
        return result;
    }
}
