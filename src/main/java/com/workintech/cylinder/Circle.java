package com.workintech.cylinder;

public class Circle {
    private int radius;

    public Circle(int radius) {
        this.radius = Math.max(radius, 0);
    }

    public int getRadius() {
        return radius;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }
}
