package org.unit;

import org.junit.Calculator;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class CalculatorTest {
    Calculator calculator;
    @BeforeAll
    void init(){
         calculator = new Calculator();
    }
    @Test
    void add_Test(){
        assertEquals(10,calculator.add(8,2));
        assertEquals(10,calculator.add(5,5));
        assertEquals(2,calculator.add(2,0));
    }
    @Test
    void subtract_Test(){
        assertEquals(6,calculator.subtract(8,2));
        assertEquals(5,calculator.subtract(10,5));
        assertEquals(12,calculator.subtract(12,0));
    }
    @Test
    void multiply_Test(){
        assertEquals(10,calculator.multiply(5,2));
        assertEquals(0,calculator.multiply(5,0));
        assertEquals(1,calculator.multiply(1,1));
    }
    void divide_Test(){
        assertThrows(ArithmeticException.class,()->calculator.divide(5,0));
        assertEquals(1,calculator.divide(5,5));
    }


}