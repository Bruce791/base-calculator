package tests;

import calc.Calculator;
import calc.exception.DivWithZero;
import calc.exception.IncorrectOperator;
import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {

    @Test
    public void checkSumFunctionTest() {
        Calculator calc = new Calculator();
        Assert.assertEquals("Expected result with sum() = 6.0", 6, calc.sum(3, 3), 0.0);
    }

    @Test
    public void checkSubFunctionTest() {
        Calculator calc = new Calculator();
        Assert.assertEquals("Expected result with sub() = 2.0", 2, (calc.sub(6, 4)), 0.0);
    }

    @Test
    public void checkMulFunctionTest() {
        Calculator calc = new Calculator();
        Assert.assertEquals("Expected result with mul() = 12.0",12, (calc.mul(3, 4)), 0.0);
    }

    @Test
    public void checkDivFunctionTest() throws DivWithZero {
        Calculator calc = new Calculator();
        Assert.assertEquals("Expected result with div() = 1.0" ,1, (calc.div(8, 8)), 0.0);
    }

    @Test
    public void checkThrowingExceptionForDivWithZero() {
        Calculator calc = new Calculator();
        boolean isCondition = false;
        try {
            calc.div(5,0);
        } catch (DivWithZero e) {
            isCondition = true;
        }
        Assert.assertTrue("Expected result True", isCondition);
    }

    @Test
    public void checkThrowingExceptionIncorrectOperator() {
        Calculator calc = new Calculator();
        boolean isCondition = false;
        try {
            calc.setOperation("");
        } catch (IncorrectOperator e) {
            isCondition = true;
        }
        Assert.assertTrue("Expected result True", isCondition);
    }
}
