import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class TestFactorial {
    @Test
    public void CalcFactorialForZero() {
        int actualResult = Factorial.CalcFactorial(0);
        assertEquals(1, actualResult);
    }
    @Test
    public void CalcFactorialForPositiveNum() {
        assertEquals(1, Factorial.CalcFactorial(1));
        assertEquals(2, Factorial.CalcFactorial(2));
        assertEquals(3, Factorial.CalcFactorial(3));
        assertEquals(24, Factorial.CalcFactorial(4));
    }
    @Test
    public void CalcFactorialForNegativeNum() {
        assertThrows(IllegalArgumentException.class, () -> Factorial.CalcFactorial(-1));
    }
}