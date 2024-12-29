package third;

public class QuadraticEquationSolver {

    public static void main(String[] args) {
        int a = 5;
        int b = 9;
        int c = 3;
        System.out.println(solveQuadraticEquation(a, b, c));
    }

    public static String solveQuadraticEquation(double a, double b, double c) {
        if (a == 0) {
            return "Коэффициент 'a' не может быть равен нулю.";
        }

        double discriminant = b * b - 4 * a * c;

        if (discriminant > 0) {
            double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            return String.format("Два вещественных корня: %.4f и %.4f", root1, root2);
        } else if (discriminant == 0) {
            double root = -b / (2 * a);
            return String.format("Один вещественный корень: %.4f", root);
        }
        return "Вещественных корней нет.";
    }
}
