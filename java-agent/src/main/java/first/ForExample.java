package first;

public class ForExample {
    public static void main(String[] args) {
        for (int i = 1; i <= 500; i++) {
            System.out.println(print(i));
        }
    }

    public static String print(int i) {
        if (i % 5 == 0 && i % 7 == 0) {
            return i + ". fizzbuzz";
        } else if (i % 5 == 0) {
            return i + ". fizz";
        } else if (i % 7 == 0) {
            return i + ". buzz";
        }
        return i + ".";
    }
}
