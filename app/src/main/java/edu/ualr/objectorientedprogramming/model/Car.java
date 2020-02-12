package edu.ualr.objectorientedprogramming.model;

// TODO 06. Inheritance. What is inheritance? Examples?
// TODO 06.01. Why is inheritance useful? Code reuse
// TODO 06.02. Single inheritance vs Multiple inheritance. Are they both supported by Java? Diamond problem
// TODO 06.02. How do we define inheritance in Java?
// TODO 06.03. Reserved word "super". What does it mean?
// TODO 06.03. Overriding methods

public class Car extends Vehicle {

    private String model;

    public String getModel() {
        return this.model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Car(String brand, int purchaseYear, String model) {
        super(brand, purchaseYear);
        this.model = model;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", Model - " + this.model;
    }

}
