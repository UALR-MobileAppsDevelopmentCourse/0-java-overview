package edu.ualr.objectorientedprogramming.model;

// TODO 10.05. How can we create an enum with a specific set of constant values ? PENNY (1), NICKEL (5), DIME (10), QUARTER (25)
public enum Coin {

    PENNY (1),
    NICKEL (5),
    DIME (10),
    QUARTER (25);

    private int value;

    Coin(int value){
        this.value = value;
    }

    public int value(){
        return this.value;
    }

    public String getLabel(){
        return this.name();
    }

}
