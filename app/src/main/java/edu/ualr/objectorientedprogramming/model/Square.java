package edu.ualr.objectorientedprogramming.model;

public class Square extends Shape implements Drawable{

    private int side = 0;

    public Square(int x, int y, int side) {
        super(x, y);
        this.side =  side;
    }

    @Override
    public void draw(int color) {

    }
}
