package loop;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FactorialTest {
    Factorial factorial;

    @Before
    public void setUp() {
        factorial = new Factorial();
    }

    @Test
    public void shouldComputeFactorial() {
        int expected = 120;
        int actual = factorial.fact(5);
        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnOneBecauseOfOne() {
        int expected = 1;
        int actual = factorial.fact(1);
        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnOneBecauseOfZero() {
        int expected = 1;
        int actual = factorial.fact(0);
        assertEquals(expected, actual);
    }
}