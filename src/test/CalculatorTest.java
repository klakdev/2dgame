package test;

import main.Calculator;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {
    @Test
    public void testAdd() {
        assertEquals(3, Calculator.add(1, 2));
    }
}