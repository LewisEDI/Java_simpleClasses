import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CalculatorTest {
    Calculator calc = new Calculator();

    @Test
    public void addTest(){
        assertEquals(10, calc.add(4,6));
    }

    @Test
    public void subtractTest(){
        assertEquals(10, calc.subtract(20,10));
    }

    @Test
    public void multiplyTest(){
        assertEquals(10, calc.multiply(5,2));
    }

    @Test
    public void divideTest(){
        assertEquals(10, calc.divide(20,2),0.1);
    }


}
