package edu.ualr.objectorientedprogramming;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import edu.ualr.objectorientedprogramming.model.Car;
import edu.ualr.objectorientedprogramming.model.Circle;
import edu.ualr.objectorientedprogramming.model.Shape;
import edu.ualr.objectorientedprogramming.model.Square;
import edu.ualr.objectorientedprogramming.model.Vehicle;


// TODO 01. Object vs Classes. Typical elements or components that we can find in a class?

// TODO 08. Interfaces. When do we create an interface?
    // TODO 08.01. Why do we need interfaces?
    // TODO 08.02. How do we define an interface in code?
    // TODO 08.03. Make a class implement an interface
// TODO 09. Generic types. Class or interface that introduces a family of parameterized types
    // TODO 09.01. Where do we typically find generic types in Java?
    // TODO 09.02. Syntax. class/interface indentifier < parameter list >
    // TODO 09.03. We have to specify the specific types (parameter list)
    // TODO 09.04. Typical type arguments supported and examples
        // TODO 09.04.01. Concrete type (class / interface)
        // TODO 09.04.02. Concrete parametrized type
        // TODO 09.04.03. Array type
// TODO 10. Enums. When do we use them? Sequence of constant values
    // TODO 10.01. Examples of data that we typically model using enumerated types
    // TODO 10.02. Enum class simple definition
    // TODO 10.03. If enums are classes... can we call enum's constructor to create more constants?
    // TODO 10.04. Which are the values assigned by default ?
    // TODO 10.05. How can we create an enum with a specific set of constant values ? PENNY (1), NICKEL (5), DIME (10), QUARTER (25)


public class MainActivity extends AppCompatActivity {

    private static final String TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Vehicle v = new Vehicle("Yamaha", 2019);
        String brand  =  v.getBrand();
        Log.d(TAG, "Vehicle brand: " + brand);
        v.speedUp(25.5f);
        Log.d(TAG, "Current vehicle's speed is: " + v.getSpeed());
        Log.d(TAG, v.getDescription());
        Car c = new Car("Tesla", 2017, "Model S");
        Log.d(TAG, c.getDescription());

        // TODO 07. Polymorphism. What is that? Examples? Ability to change form


        // TODO 07.03. Careful with downcasting. Let's make sure it's a valid operation
        // TODO 07.04. Abstract classes.
        // TODO 07.04.01. What are they?
        // TODO 07.04.02. Instantiation
        // TODO 07.04.03. Abstract methods

        Shape shape = new Shape(12, 24);
        shape.draw();
        Circle circle = new Circle(32, 64, 54);
        circle.draw();

        // TODO 07.01. Upcasting: child -> parent
        Shape shape02 = new Circle(23, 45, 67);
        shape02.draw();

        Log.d("Shape", "Array of shapes: ");

        Shape[] shapes = new Shape[] {
                new Shape(12, 34),
                new Circle( 23, 45, 67),
                new Shape(98, 87),
                new Circle( 65, 54, 32)
        };

        for (Shape currentShape : shapes) {
            currentShape.draw();
        }

        // TODO 07.02. Downcasting: parent -> child

        Circle circle02 = (Circle) shape02;
        Log.d("Shape", "Radius: " + circle02.getRadius());

        Square square = new Square(12, 45, 34);
        Shape shape03 = square;

        if (shape03 instanceof  Circle) {
            Circle circle03 = (Circle) shape03;
            circle03.draw();
        }
    }
}
