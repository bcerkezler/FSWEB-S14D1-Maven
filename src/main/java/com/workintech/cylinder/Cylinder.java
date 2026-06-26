package com.workintech.cylinder;

public class Cylinder extends Circle{
    private int height;

    public Cylinder(int radius, int height) {
        super(radius);
        this.height = Math.max(height, 0);
    }

    public int getHeight() {
        return height;
    }

    public double getVolume() {
        return getArea() * height;
    }
}
