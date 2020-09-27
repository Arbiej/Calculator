package pl.com.javaex;

import org.junit.Assert;
import org.junit.Test;

public class CalculatorTests {

    @Test

    public void should_add_two_numbers() {

        //given
        Calculator calculator = new Calculator();

        //when
        int result = calculator.add(10, 15);
        //then
        Assert.assertEquals(25, result);
    }

    @Test
//BDD
    public void should_add_two_numbers_bdd() {

        //given
        Calculator calculator = new Calculator();


        //then
        Assert.assertEquals(calculator.add(10, 15), 25);
        Assert.assertEquals(calculator.add(-10, 15), 5);
        Assert.assertEquals(calculator.add(1, 15), 16);
    }

    @Test

    public void should_not_add_two_numbers() {

        //given
        Calculator calculator = new Calculator();


        Assert.assertNotEquals(calculator.add(10, 15), 20);
        Assert.assertNotEquals(calculator.add(12, 15), 20);
        Assert.assertNotEquals(calculator.add(1, 15), 20);
        //then
    }

    @Test
    public void should_divide_two_numbers() {
        Calculator calculator = new Calculator();

        Assert.assertEquals(calculator.divide(10, 2), 5, 0);
        Assert.assertEquals(calculator.divide(8, 2), 4, 0);
        Assert.assertEquals(calculator.divide(18, 2), 9, 0);
    }

    @Test(expected = ArithmeticException.class)
    public void should_not_divide_by_zero() {
        Calculator calculator = new Calculator();

        Assert.assertEquals(calculator.divide(10, 0), 5, 0);
    }
}