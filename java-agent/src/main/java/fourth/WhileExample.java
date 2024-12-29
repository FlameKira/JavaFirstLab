package fourth;

public class WhileExample {
    public static void main(String[] args) {
        double result = 0;
        double chlen;
        int n = 2;
        do {
            chlen = count(n);
            result += chlen;
            n++;
        } while (chlen >= Math.pow(10, -6));
        System.out.println(result);
    }

    public static double count(int n) {
        return 1 / (Math.pow(n, 2) + n - 2);
    }
}
