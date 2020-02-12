package edu.ualr.objectorientedprogramming.model;


// TODO 02. How do we define a class?
    // TODO 02.01. Naming convention for the class and the file
    // TODO 02.03. Several classes in the same file. Only one public class, with the same name of the Java file

// TODO 03. Elements / components of an object: State + Behaviour

// TODO 04. Packages
// TODO 04.01. Access classes in the same package
// TODO 04.02. Access classes in a different package
// TODO 04.02.01. Using a single class
// TODO 04.02.02. Using the whole package

// TODO 05. Encapsulation. what does it mean?
// TODO 05.01 Levels of access control provided by Java: public, protected, private, package-private
// TODO 05.02. What do we typically do by convention?


public class Vehicle {

    // State -> Attributes

    private float speed = 0;
    private String brand;
    private  int purchaseYear;

    // Behaviour -> Methods

    public Vehicle(String brand, int purchaseYear) {
        this.brand = brand;
        this.purchaseYear = purchaseYear;
    }

    public float getSpeed() {
        return speed;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getPurchaseYear() {
        return purchaseYear;
    }

    public void setPurchaseYear(int purchaseYear) {
        this.purchaseYear = purchaseYear;
    }

    public void speedUp(float delta) {
        speed += delta;
    }

    public String getDescription(){
        return "Vehicle: brand - " + this.brand + ", purchase year: - " + this.purchaseYear;
    }

}