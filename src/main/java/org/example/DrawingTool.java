package org.example;

import java.util.HashSet;
import java.util.Set;

public class DrawingTool {
    Set<Shape> shapeList = new HashSet<>();

    public void addShape(Shape shape) {
        if (shapeList.contains(shape)) {
            System.out.println("This shape already exists: " + shape.getClass().getName());
            return;
        }
        shapeList.add(shape);
    }

    private boolean checkShapeExistsV2(Shape shape) {
        for (Shape shapeInList : shapeList) {
            if (shapeInList.getClass() == shape.getClass()
                    && shapeInList.equals(shape)) {
                return true;
            }
        }
        return false;
    }

    public void calculateTotalPerimeter() {
        double totalPerimeter = 0d;
        for (Shape shape : shapeList) {
            totalPerimeter += shape.calculatePerimeter();
        }
        System.out.println("Total perimeter = " + totalPerimeter);
    }

    public double calculateTotalPerimeter2() {
        double totalPerimeter = 0d;
        for (Shape shape : shapeList) {
            totalPerimeter += shape.calculatePerimeter();
        }
        return totalPerimeter;
    }

    public void calculateTotalSurface() {
        double totalSurface = 0d;
        for (Shape shape : shapeList) {
            totalSurface += shape.calculateSurface();
        }
        System.out.println("Total surface = " + totalSurface);
    }

    public double calculateTotalSurface2() {
        double totalSurface = 0d;
        for (Shape shape : shapeList) {
            totalSurface += shape.calculateSurface();
        }
        return totalSurface;
    }

}
