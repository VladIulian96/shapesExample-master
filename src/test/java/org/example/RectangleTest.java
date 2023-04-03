package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {

    @Test
    void givenSizeShouldCalculatePerimeter() {
        //given
        Rectangle rectangle = new Rectangle(10, 10);
        //when
        double result = rectangle.calculatePerimeter();
        //then
        assertEquals(40.0, result, 0.00001);
    }

    @Test
    void givenRadiusShouldCalculateSurface() {
        //given
        Rectangle rectangle = new Rectangle(10, 10);
        //when
        double result = rectangle.calculateSurface();
        //then
        assertEquals(100.0, result, 0.00001);
    }

}