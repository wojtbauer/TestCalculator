package pl.edu.agh.mwo.calculator;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    @Test
    public void testSum() {
        Calculator calc = new Calculator();
        calc.sum(5, 7);
        assertEquals(12, calc.sum(5, 7));
    }

    @Test
    public void testSubstract() {
        Calculator calc = new Calculator();
        calc.sum(5, 7);
        assertEquals(-2, calc.substract(5, 7));
}
    @Test
    public void testMultiply() {
        Calculator calc = new Calculator();
        calc.multiply(5, 7);
        assertEquals(35, calc.multiply(5, 7));
    }

    @Test (expected = )
    public void testDivision() {
        Calculator calc = new Calculator();
        calc.division(5, 5);
        assertEquals(1, calc.division(5,5));
    }

    @Test
    public void testAvg() {
        Calculator calc = new Calculator();
        calc.avg(5, 5);
        assertEquals(1, calc.avg(1,1));
    }


}
