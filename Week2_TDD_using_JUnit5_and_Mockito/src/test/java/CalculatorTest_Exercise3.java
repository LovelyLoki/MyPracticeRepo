import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest_Exercise3 {

    Calculator calc = new Calculator();

    @Test
    void testAddition() {
        assertEquals(7, calc.add(3, 4), "Addition should be correct");
    }

    @Test
    void testSubtraction() {
        assertEquals(2, calc.subtract(5, 3), "Subtraction should be correct");
    }

    @Test
    void testIsPositive() {
        assertTrue(calc.isPositive(10), "10 is positive");
        assertFalse(calc.isPositive(-5), "-5 is not positive");
    }

    @Test
    void testNullCheck() {
        String str = null;
        assertNull(str, "Object should be null");
    }

    @Test
    void testSameObject() {
        String a = "hello";
        String b = "hello";
        assertSame(a, b, "Both strings should refer to the same object");
    }
}
