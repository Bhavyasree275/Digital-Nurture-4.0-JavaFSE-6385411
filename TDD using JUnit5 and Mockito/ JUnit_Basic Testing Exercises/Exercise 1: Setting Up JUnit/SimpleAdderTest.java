package org.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class SimpleAdderTest {

    @Test
    public void testAddition() {
        SimpleAdder adder = new SimpleAdder();
        assertEquals(5, adder.add(2, 3));

    }

}