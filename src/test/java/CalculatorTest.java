import org.example.Calculator;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    @Test
    public void testSum() {
        Calculator calculator = new Calculator();
        int result = calculator.sum(3, 4);
        assertEquals(7, result); // Check that 3 + 4 equals 7
    }
}
