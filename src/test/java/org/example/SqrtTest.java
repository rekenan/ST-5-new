package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SqrtTest {

    @Test
    public void testAverage() {
        Sqrt sqrt = new Sqrt(4.0);
        assertEquals(2.0, sqrt.average(2.0, 2.0), 0.00000001);
        assertEquals(3.0, sqrt.average(4.0, 2.0), 0.00000001);
    }

    @Test
    public void testGood() {
        Sqrt sqrt = new Sqrt(4.0);
        assertTrue(sqrt.good(2.0, 4.0));
        assertFalse(sqrt.good(1.5, 4.0));
    }

    @Test
    public void testImprove() {
        Sqrt sqrt = new Sqrt(4.0);
        double improved = sqrt.improve(1.0, 4.0);
        assertTrue(improved > 1.0);
    }

    @Test
    public void testIter() {
        Sqrt sqrt = new Sqrt(4.0);
        double result = sqrt.iter(1.0, 4.0);
        assertEquals(2.0, result, 0.00000001);
    }

    @Test
    public void testCalc() {
        Sqrt sqrt = new Sqrt(4.0);
        assertEquals(2.0, sqrt.calc(), 0.00000001);
    }

    @Test(expected = StackOverflowError.class)
    public void testIterNonConverging() {
        Sqrt sqrt = new Sqrt(-1.0);
        sqrt.calc();
    }
}