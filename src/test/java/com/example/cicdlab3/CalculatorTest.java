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


}