package com.example.cicdlab3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    @Test
    void testAdd () {
        var calculator = new Calculator();
        assertEquals(4, calculator.add(2, 2));
        assertEquals(-1, calculator.add(2, -3));
    }

    @Test
    public void testSubtract() {
        var calculator = new Calculator();
        assertEquals(1, calculator.subtract(4, 3));
        assertEquals(5, calculator.subtract(2, -3));
    }
    @Test
    public void testMultiply() {
        var calculator = new Calculator();
        assertEquals(6, calculator.multiply(2, 3));
        assertEquals(-6, calculator.multiply(2, -3));
    }
    @Test
    public void testDivide1() {
        var calculator = new Calculator();
        assertEquals(2.5, calculator.divide(5, 2), 0.01);
        assertEquals(Double.POSITIVE_INFINITY, calculator.divide(5, 0), 0.01);
    }
    @Test
    public void testDivide2() {
        var calculator = new Calculator();
        assertTrue(Double.isInfinite(calculator.divide(5, 0)));
        assertFalse(Double.isNaN(calculator.divide(5, 3)));
    }



}