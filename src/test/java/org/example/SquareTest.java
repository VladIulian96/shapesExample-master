package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


class SquareTest {

    @Test
    void givenSizeShouldCalculatePerimeter() {
        //given
        Square square = new Square(10);
        //when
        double result = square.calculatePerimeter();
        //then
        assertEquals(40.0, result, 0.00001);
    }

    @Test
    void givenRadiusShouldCalculateSurface() {
        //given
        Square square = new Square(10);
        //when
        double result = square.calculateSurface();
        //then
        assertEquals(100.0, result, 0.00001);
    }

}