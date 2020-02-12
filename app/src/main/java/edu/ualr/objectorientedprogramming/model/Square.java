package edu.ualr.objectorientedprogramming.model;

public class Square extends Shape {

    private int side = 0;

    public Square(int x, int y, int side) {
        super(x, y);
        this.side =  side;
    }

}
