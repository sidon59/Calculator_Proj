package org.example;//import static org.junit.Assert.*;
//import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class CalculatorTest {

        @Test
        void testAddTwoNumbers() {
            assertEquals(3, calculator.add(1, 2)); // Expected to fail initially
            assertEquals(-2, calculator.add(-1, -1));
        }

        @Test
        void testAddMultipleNumbers() {
            assertEquals(15, calculator.add(1, 2, 3, 4, 5)); // Expected to fail initially
        }

        @Test
        void testMultiplyTwoNumbers() {
            assertEquals(3, calculator.multiply(1, 3)); // Expected to fail initially
            assertEquals(-3, calculator.multiply(-1, 3));
        }

        @Test
        void testMultiplyMultipleNumbers() {
            assertEquals(120, calculator.multiply(1, 2, 3, 4, 5)); // Expected to fail initially
        }
    }



