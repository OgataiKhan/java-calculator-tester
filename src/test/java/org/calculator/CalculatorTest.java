package org.calculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void add() {
        assertEquals(5.0f, Calculator.add(2.0f, 3.0f), 0.0001f);
        assertEquals(-0.7f, Calculator.add(-2.0f, 1.3f), 0.0001f);
        assertEquals(-3.0f, Calculator.add(-2.0f, -1.0f), 0.0001f);
        assertEquals(0.0f, Calculator.add(0.0f, 0.0f), 0.0001f);
    }

    @Test
    void subtract() {
        assertEquals(1.0f, Calculator.subtract(3.0f, 2.0f), 0.0001f);
        assertEquals(-3.3f, Calculator.subtract(-2.0f, 1.3f), 0.0001f);
        assertEquals(3.0f, Calculator.subtract(2.0f, -1.0f), 0.0001f);
        assertEquals(0.0f, Calculator.subtract(0.0f, 0.0f), 0.0001f);
    }

    @Test
    void multiply() {
        assertEquals(6.0f, Calculator.multiply(2.0f, 3.0f), 0.0001f);
        assertEquals(-2.5f, Calculator.multiply(-2.5f, 1.0f), 0.0001f);
        assertEquals(0.0f, Calculator.multiply(0.0f, 1.0f), 0.0001f);
        assertEquals(0.0f, Calculator.multiply(0.0f, 0.0f), 0.0001f);
    }

    @Test
    void divide() {
        assertEquals(2.0f, Calculator.divide(6.0f, 3.0f), 0.0001f);
        assertEquals(-2.4f, Calculator.divide(-6.0f, 2.5f), 0.0001f);
        assertEquals(0.0f, Calculator.divide(0.0f, 1.0f), 0.0001f);
        assertThrows(ArithmeticException.class, () -> Calculator.divide(1.0f, 0.0f));
    }
}