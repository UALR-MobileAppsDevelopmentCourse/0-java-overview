package edu.ualr.objectorientedprogramming;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import java.util.ArrayList;
import java.util.List;

import edu.ualr.objectorientedprogramming.model.Car;
import edu.ualr.objectorientedprogramming.model.Circle;
import edu.ualr.objectorientedprogramming.model.Coin;
import edu.ualr.objectorientedprogramming.model.Shape;
import edu.ualr.objectorientedprogramming.model.Square;
import edu.ualr.objectorientedprogramming.model.Vehicle;
import edu.ualr.objectorientedprogramming.model.WeekDay;


// TODO 01. Object vs Classes. Typical elements or components that we can find in a class?


public class MainActivity extends AppCompatActivity {

    private static final String TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Vehicle v = new Vehicle("Yamaha", 2019);
        String brand = v.getBrand();
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

        // We cannot instantiate abstract classes
        //Shape shape = new Shape(12, 24);
        //shape.draw();

        Circle circle = new Circle(32, 64, 54);
        circle.draw();

        // TODO 07.01. Upcasting: child -> parent
        Shape shape02 = new Circle(23, 45, 67);
        //shape02.draw();

        Log.d("Shape", "Array of shapes: ");

        Shape[] shapes = new Shape[]{
                new Square(12, 34, 23),
                new Circle(23, 45, 67),
                new Square(98, 87, 87),
                new Circle(65, 54, 32)
        };

        /*
        for (Shape currentShape : shapes) {
            currentShape.draw();
        }
        */

        // TODO 07.02. Downcasting: parent -> child

        Circle circle02 = (Circle) shape02;
        Log.d("Shape", "Radius: " + circle02.getRadius());

        Square square = new Square(12, 45, 34);
        Shape shape03 = square;

        if (shape03 instanceof Circle) {
            Circle circle03 = (Circle) shape03;
            circle03.draw();
        }

        // TODO 09. Generic types. Class or interface that introduces a family of parameterized types
        // TODO 09.01. Where do we typically find generic types in Java?
        // TODO 09.02. Syntax. class/interface indentifier < parameter list >
        // TODO 09.03. We have to specify the specific types (parameter list)
        // TODO 09.04. Typical type arguments supported and examples
        // TODO 09.04.01. Concrete type (class / interface)


        List<Shape> shapeList = new ArrayList<Shape>();
        shapeList.add(square);
        shapeList.add(circle02);
        // TODO 09.04.02. Concrete parametrized type
        List<List<String>> countries = new ArrayList<>();
        List<String> europe = new ArrayList<>();
        europe.add("Spain");
        europe.add("Italy");
        europe.add("Portugal");
        countries.add(europe);

        // TODO 09.04.03. Array type
        List<String[]> nameArrays;

        // TODO 10. Enums. When do we use them? Sequence of constant values
        // TODO 10.01. Examples of data that we typically model using enumerated types
        // TODO 10.04. Which are the values assigned by default ?

        WeekDay day = WeekDay.TUESDAY;
        int dayId = day.ordinal();
        Log.d("Enums", "Ordinal value of the enum constant: " + dayId);

        switch (day) {
            case MONDAY:
                Log.d("Enums", "It's Monday!!");
                break;
            case TUESDAY:
                Log.d("Enums", "It's Tuesday!!");
                break;
            case WEDNESDAY:
                Log.d("Enums", "It's Wednesday!!");
                break;
            case THURSDAY:
                Log.d("Enums", "It's Thursday!!");
                break;
            // ...
        }

        // TODO 10.03. If enums are classes... can we call enum's constructor to create more constants?
        // We cannot instantiate enum classes
        //WeekDay newDay = new WeekDay();

        Coin coin = Coin.NICKEL;
        Log.d("Enums", coin.getLabel() + " has a value of " + coin.value());
    }
}
