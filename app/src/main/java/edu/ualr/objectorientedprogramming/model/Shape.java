package edu.ualr.objectorientedprogramming.model;

import android.util.Log;

public class Shape {

    private int x,y;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public Shape(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void draw() {
        Log.d("Shape", "Shape drawn at (" + x + ", " + y + ")");
    }

}
