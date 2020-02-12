package edu.ualr.objectorientedprogramming;


// TODO 02. How do we define a class?
    // TODO 02.01. Naming convention for the class and the file
    // TODO 02.03. Several classes in the same file. Only one public class, with the same name of the Java file

// TODO 03. Elements / components of an object: State + Behaviour

// TODO 04. Packages
// TODO 04.01. Access classes in the same package
// TODO 04.02. Access classes in a different package
// TODO 04.02.01. Using a single class
// TODO 04.02.02. Using the whole package

class Vehicle {

    // State -> Attributes

    float speed = 0;
    String brand;
    int purchaseYear;

    // Behaviour -> Methods

    void speedUp() {
        speed ++;
    }

    Vehicle() {

    }

    Vehicle(String brand, int purchaseYear) {
        this.brand = brand;
        this.purchaseYear = purchaseYear;
    }


}