package example;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {
    Calculator calculator;
    @Before
    public void setup() {
        calculator = new Calculator();
    }
    @Test
    public void testAddBasic() {
        Assert.assertEquals(4, calculator.add(1, 3));
    }
    @Test
    public void testAddBasic2() {
        Assert.assertEquals(6, calculator.add(3, 3));
    }
    @Test
    public void testMinusBasic() {
        Assert.assertEquals(10, calculator.minus(15, 5));
    }
    @Test
    public void testMultiplyBasic() {
        Assert.assertEquals(10, calculator.multiply(2, 5));
    }
    @Test
    public void testMultiplyBasic2() {
        Assert.assertEquals(9, calculator.multiply(3, 3));
    }
    @Test
    public void testDivideBasic() {
        Assert.assertEquals(5, calculator.divide(10, 2), 0.5);
    }
}
