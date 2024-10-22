import org.example.Factorial;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestFactorial{

    @Test
    public void testFactorialPositiveNumber() {
        Assert.assertEquals(Factorial.CalcFactorial(5), 120);
    }

    @Test
    public void testFactorialZero() {
        Assert.assertEquals(Factorial.CalcFactorial(0), 1);
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testFactorialNegativeNumber() {
        Factorial.CalcFactorial(-1);
    }
}