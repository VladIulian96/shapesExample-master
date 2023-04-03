package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TriangleTest {

    @Test
    void givenSizeShouldCalculatePerimeter() {
        //given
        Triangle triangle = new Triangle(10, 10, 10);
        //when
        double result = triangle.calculatePerimeter();
        //then
        assertEquals(30.0, result, 0.00001);
    }

    @Test
    void givenRadiusShouldCalculateSurface() {
        //given
        Triangle triangle = new Triangle(10, 10, 10);
        //when
        double result = triangle.calculateSurface();
        //then
        assertEquals(43.30127018922193, result, 0.00001);
    }

}