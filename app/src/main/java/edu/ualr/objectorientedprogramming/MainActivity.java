package edu.ualr.objectorientedprogramming;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import edu.ualr.objectorientedprogramming.model.Car;
import edu.ualr.objectorientedprogramming.model.Circle;
import edu.ualr.objectorientedprogramming.model.Coin;
import edu.ualr.objectorientedprogramming.model.Shape;
import edu.ualr.objectorientedprogramming.model.Square;
import edu.ualr.objectorientedprogramming.model.Vehicle;
import edu.ualr.objectorientedprogramming.model.WeekDay;


// TODO 01. Object vs Classes. Typical elements or components that we can find in a class?

enum Color {
    RED, BLACK, WHITE, BLUE, GREEN;
}


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

        // TODO 11. String class
        // TODO 11.01. Initialization
        String favouriteLanguage = "Java";                              // = new String("Java");
        // TODO 11.02. length. Not terminated by null character
        int numChars = favouriteLanguage.length();
        // TODO 11.03. Get character at an specific position
        char specificChar = favouriteLanguage.charAt(2);
        // TODO 11.04. Look for a substring in a string
        int pos = favouriteLanguage.indexOf("v");
        // TODO 11.05. Concat two strings
        favouriteLanguage = favouriteLanguage.concat(" is awesome");
        // TODO 11.06. Replace a char in a string with a different one
        favouriteLanguage = favouriteLanguage.replace('a', 'o');
        // TODO 12. Collections. Why?
        // TODO 13. List interface and ArrayList class. Advantages?
        // TODO 13.01. Initialize an empty list
        List<String> countriesCopy = new ArrayList<>();
        // TODO 13.02. Add an element to a list
        countriesCopy.add("Canada");
        // TODO 13.03. Add several elements to a list
        countriesCopy.addAll(europe);
        // TODO 13.04. Get an element in the list providing its position
        countriesCopy.get(2);
        // TODO 13.05. Delete an element from the list
        countriesCopy.remove(2);
        // TODO 13.06. Get the position of an element in a list
        pos = countriesCopy.indexOf("Portugal");
        // TODO 14. Map interface and HashMap class
        // TODO 14.01 Initialize an empty map
        Map<String, Color> map = new HashMap();
        // TODO 14.02. Add new elements to the map
        map.put("red", Color.RED);
        map.put("green", Color.GREEN);
        map.put("blue", Color.BLUE);
        // TODO 14.03. Check if a key value is already in the map
        boolean keyInMap = map.containsKey("green");
        // TODO 14.04. Check if a value is already in the map
        boolean valueInMap = map.containsValue(Color.WHITE);
        // TODO 14.05. Get the corresponding value for a key value
        Color colorValue = (Color) map.get("blue");
        // TODO 14.06. Remove an specific entry in the map
        map.remove("green");
        // TODO 14.07. Get a collection with just the key values in the map
        Set<String> keyValues = map.keySet();
        // TODO 14.08. Get a collection with just the actual values in the map
        Collection<Color> actualValues = map.values();
        // TODO 14.07. Remove all the elements in a map
        map.clear();
    }
}
