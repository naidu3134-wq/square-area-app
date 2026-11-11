package com.example;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class SquareTest {

    @Test
    void testCalculateArea() {
        Square square = new Square(4.0);
        assertEquals(16.0, square.calculateArea(), 0.0001, "Area calculation failed");
    }

    @Test
    void testNegativeSide() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Square(-2.0);
        });
    }
}