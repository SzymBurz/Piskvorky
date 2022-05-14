package com.kodilla.spring.calculator;

import com.kodilla.spring.calculator.Calculator;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class CalculatorTestSuite {

    @Autowired
    private Calculator calculator;

    @Test
    public void testAdd() {
        double res = calculator.add(2.0,2.0);
        assertEquals(4.0, res);
    }

    @Test
    public void testSub() {
        double res = calculator.sub(2.0, 2.0);
        assertEquals(0.0, res);
    }

    @Test
    public void testMul() {
        double res = calculator.mul(2.0, 2.0);
        assertEquals(4.0, res);
    }

    @Test
    public void testDiv() {
        double res = calculator.div(2.0, 2.0);
        assertEquals(0.0, res);
    }
}
