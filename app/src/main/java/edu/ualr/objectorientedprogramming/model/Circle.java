package edu.ualr.objectorientedprogramming.model;

import android.util.Log;

public class Circle extends Shape {

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    private int radius;

    public Circle(int x, int y, int radius) {
        super(x, y);
        this.radius = radius;
    }

    public void draw() {
        Log.d("Shape", "Shape drawn at (" + this.getX() + ", " + this.getY() + "), with radius " + this.radius);
    }
}
