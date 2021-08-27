package recursion;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FactorialTest {
    Factorial factorial;

    @Before
    public void setUp() {
        factorial = new Factorial();
    }

    @Test
    public void shouldComputeFactorial5() {
        int expected = 120;
        int actual = factorial.fact(5);
        assertEquals(expected, actual);
    }

    @Test
    public void shouldComputeFactorial10() {
        int expected = 3628800;
        int actual = factorial.fact(10);
        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnOneBecauseOfOne() {
        int expected = 1;
        int actual = factorial.fact(1);
        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnOneBecauseOfZeroOrMinus() {
        int expected = 1;
        int actual = factorial.fact(0);
        int actualMinus = factorial.fact(-1);
        assertEquals(expected, actual);
        assertEquals(expected, actualMinus);
    }
}