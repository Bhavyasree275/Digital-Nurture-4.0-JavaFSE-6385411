package org.example;
import org.junit.Before;
import org.junit.After;
import org.junit.Test;
import static org.junit.Assert.*;

public class CalculatorLifecycleTest {

    private Calculator calc;

    @Before
    public void setUp() {
        calc = new Calculator(); // Arrange
    }

    @After
    public void tearDown() {
        calc = null; // Cleanup
    }

    @Test
    public void testAddition() {
        int result = calc.add(10, 20); // Act
        assertEquals(30, result);      // Assert
    }

    @Test
    public void testSubtraction() {
        int result = calc.subtract(50, 30);
        assertEquals(20, result);
    }
//    @Test
//    public void multiplication() {
//        int result = calc.multiply(5, 3);
//        assertEquals(20, result);
//    }
}
