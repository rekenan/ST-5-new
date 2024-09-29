package org.example;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SqrtTest {

    @Test
    public void testAverage() {
        Sqrt sqrt = new Sqrt(1.0);
        assertEquals(3.0, sqrt.average(2.0, 4.0));
        assertEquals(4.0, sqrt.average(3.0, 5.0));
        assertEquals(5.0, sqrt.average(6.0, 4.0));
        assertEquals(7.0, sqrt.average(6.0, 8.0));
    }

    @Test
    public void testIsGood() {
        Sqrt sqrt = new Sqrt(1.0);
        assertTrue(sqrt.good(2.0, 4.0));
        assertFalse(sqrt.good(1.999, 4.0));
        assertTrue(sqrt.good(3.0, 9.0));
        assertFalse(sqrt.good(2.999, 9.0));
    }

    @Test
    public void testImproveGuess() {
        Sqrt sqrt = new Sqrt(1.0);
        assertEquals(2.25, sqrt.improve(2.0, 5.0));
        assertEquals(4.333333333333333, sqrt.improve(6.0, 16.0));
        assertEquals(3.638888888888889, sqrt.improve(4.5, 12.5));
    }

    @Test
    public void testIteration() {
        Sqrt sqrt = new Sqrt(1.0);
        assertEquals(3.0, sqrt.iter(1.0, 9.0), 0.00001);
        assertEquals(1.41421, sqrt.iter(1.0, 2.0), 0.00001);
    }

    @Test
    public void testCalculate() {
        Sqrt sqrt1 = new Sqrt(-4.0);
        assertThrows(Throwable.class, sqrt1::calc);
        Sqrt sqrt2 = new Sqrt(0.0);
        assertEquals(0.0, sqrt2.calc(), 0.001);
        Sqrt sqrt3 = new Sqrt(16.0);
        assertEquals(4.0, sqrt3.calc(), 0.00001);
        Sqrt sqrt4 = new Sqrt(49.0);
        assertEquals(7.0, sqrt4.calc(), 0.00001);
    }

    @Test
    public void testAverageAdditionalCases() {
        Sqrt sqrt = new Sqrt(1.0);
        assertEquals(6.0, sqrt.average(5.0, 7.0));
        assertEquals(15.0, sqrt.average(10.0, 20.0));
    }

    @Test
    public void testGoodAdditionalCases() {
        Sqrt sqrt = new Sqrt(1.0);
        assertTrue(sqrt.good(1.0, 1.0));
        assertFalse(sqrt.good(0.99999, 1.0));
    }

    @Test
    public void testImproveAdditionalCases() {
        Sqrt sqrt = new Sqrt(1.0);
        assertEquals(3.25, sqrt.improve(2.5, 10.0));
        assertEquals(2.705, sqrt.improve(1.0, 4.41));
    }

    @Test
    public void testIterAdditionalCases() {
        Sqrt sqrt = new Sqrt(1.0);
        assertEquals(5.0, sqrt.iter(1.0, 25.0), 0.00001);
        assertEquals(1.73205, sqrt.iter(1.0, 3.0), 0.00001);
    }

    @Test
    public void testCalcAdditionalCases() {
        Sqrt sqrt1 = new Sqrt(100.0);
        assertEquals(10.0, sqrt1.calc(), 0.00001);
        Sqrt sqrt2 = new Sqrt(81.0);
        assertEquals(9.0, sqrt2.calc(), 0.00001);
    }

    @Test
    public void testAverageEdgeCases() {
        Sqrt sqrt = new Sqrt(1.0);
        assertEquals(0.0, sqrt.average(-1.0, 1.0));
        assertEquals(0.00000005, sqrt.average(0.0000001, 0.0));
    }

    @Test
    public void testGoodEdgeCases() {
        Sqrt sqrt = new Sqrt(1.0);
        assertFalse(sqrt.good(Double.MAX_VALUE, Double.MAX_VALUE));
        assertTrue(sqrt.good(Double.MIN_VALUE, 0.0));
    }

    @Test
    public void testIterEdgeCases() {
        Sqrt sqrt = new Sqrt(1.0);
        assertEquals(0.00001, sqrt.iter(0.00001, 0.0000000001), 0.00001);
        assertEquals(2.0, sqrt.iter(1.0, 4.0000000001), 0.00001);
    }

    @Test
    public void testCalcEdgeCases() {
        Sqrt sqrt1 = new Sqrt(0.0000000001);
        assertEquals(6.15803147295654E-5, sqrt1.calc(), 0.00001);
        Sqrt sqrt2 = new Sqrt(Double.MAX_VALUE);
        assertThrows(Throwable.class, sqrt2::calc);
    }
}
