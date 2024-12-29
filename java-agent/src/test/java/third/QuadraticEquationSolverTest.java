package third;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class QuadraticEquationSolverTest {

    @Test
    public void testSolveQuadraticEquation_TwoRealRoots() {
        assertEquals("Два вещественных корня: -0.4417 и -1.3583",
                QuadraticEquationSolver.solveQuadraticEquation(5, 9, 3));
        assertEquals("Два вещественных корня: -1.0000 и -3.0000",
                QuadraticEquationSolver.solveQuadraticEquation(1, 4, 3));
    }

    @Test
    public void testSolveQuadraticEquation_OneRealRoot() {
        assertEquals("Один вещественный корень: -1.0000",
                QuadraticEquationSolver.solveQuadraticEquation(2, 4, 2));
        assertEquals("Один вещественный корень: -2.0000",
                QuadraticEquationSolver.solveQuadraticEquation(1, 4, 4));
    }

    @Test
    public void testSolveQuadraticEquation_NoRealRoots() {
        assertEquals("Вещественных корней нет.",
                QuadraticEquationSolver.solveQuadraticEquation(1, 2, 3));
        assertEquals("Вещественных корней нет.",
                QuadraticEquationSolver.solveQuadraticEquation(2, 2, 2));
    }

    @Test
    public void testSolveQuadraticEquation_CoefficientAIsZero() {
        assertEquals("Коэффициент 'a' не может быть равен нулю.",
                QuadraticEquationSolver.solveQuadraticEquation(0, 2, 3));
    }
}