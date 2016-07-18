package com.java.kvashchuk;

import org.junit.*;

import static org.junit.Assert.*;

public class CalculatorTest {

    Calculator calculator;

    @BeforeClass
    public static void beforeClass() {
        System.out.println("Before class");
    }

    @AfterClass
    public static void afterClass() {
        System.out.println("After Class");
    }

    @Before
    public void setUp() {
        System.out.println("Before1");
        calculator = new Calculator();
    }

    @After
    public void tearDown() {
        System.out.println("After");
    }

    @Test
    public void validateTwoNumbersAddition() {
        System.out.println("Test Add");
        int result = calculator.add(3, 5);
        int expected = 8;
        assertEquals("Function of addition of two number return wrong result", expected, result);
        assertEquals(expected, result);
    }

    @Test
    public void validaTwoNumberSubstract() {
        System.out.println("Test substract");
        int result = calculator.substract(5, 3);
        int expecter = 2;
        assertEquals("Substract is incorrect work", expecter, result);
    }

    @Test(expected = DivizionByZero.class)
    @Ignore
    public void shouldTrowDivisiobByZero() throws DivizionByZero {
        System.out.println("Test throw");
        int result = calculator.divide(5, 0);
    }

    @Test(timeout = 5)
    @Ignore
    public void testTimeout() {
        for (int i = 0; i < 2000000000; i++) {
            int k = i / 10 + 10;
            System.out.println(k);
        }
    }
}
