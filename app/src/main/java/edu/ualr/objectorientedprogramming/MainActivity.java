package edu.ualr.objectorientedprogramming;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.Map;


// TODO 01. Object vs Classes. Typical elements or components that que can find in a class?
// TODO 02. How do we define a class?
    // TODO 02.01. Naming convention for the class and the file
    // TODO 02.03. Several classes in the same file
// TODO 03. Elements / components of an object: State + Behaviour
// TODO 04. Packages
    // TODO 04.01. Access classes in the same package
    // TODO 04.02. Access classes in a different package
        // TODO 04.02.01. Using a single class
        // TODO 04.02.02. Using the whole package
// TODO 05. Encapsulation. what does it mean?
    // TODO 05.01 Levels of access control provided by Java: public, protected, private, package-private
    // TODO 05.02. We do we typically do by convention?
// TODO 06. Inheritance. What is inheritance? Examples?
    // TODO 06.01. Why is inheritance useful? Code reuse
    // TODO 06.02. Single inheritance vs Multiple inheritance. Are they both supported by Java? Diamond problem
    // TODO 06.02. How do we define inheritance in Java?
    // TODO 06.03. Reserved word "super". What does it mean?
    // TODO 06.03. Overriding methods
// TODO 07. Polymorphism. What is that? Examples? Ability to change form
    // TODO 07.01. Upcasting: child -> parent
    // TODO 07.02. Downcasting: parent -> child
    // TODO 07.03. Careful with downcasting. Let's make sure it's a valid operation
    // TODO 07.04. Abstract classes.
        // TODO 07.04.01. What are they?
        // TODO 07.04.02. Instantiation
        // TODO 07.04.03. Abstract methods
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
// TODO 11. String class
    // TODO 11.01. Initialization
    // TODO 11.02. length. Not terminated by null character
    // TODO 11.03. Get character at an specific position
    // TODO 11.04. Look for a substring in a string
    // TODO 11.05. Concat two strings
    // TODO 11.06. Replace a char in a string with a different one
// TODO 12. Collections. Why?
// TODO 13. List interface and ArrayList class. Advantages?
    // TODO 13.01. Initialize an empty list
    // TODO 13.02. Add an element to a list
    // TODO 13.03. Add several elements to a list
    // TODO 13.04. Get an element in the list providing its position
    // TODO 13.05. Delete an element from the list
    // TODO 13.06. Save an element at a given position in the list
    // TODO 13.06. Get the position of an element in a list
// TODO 14. Map interface and HashMap class
    // TODO 14.01 Initialize an empty map
    // TODO 14.02. Add new elements to the map
    // TODO 14.03. Check if a key value is already in the map
    // TODO 14.04. Check if a value is already in the map
    // TODO 14.05. Get the corresponding value for a key value
    // TODO 14.06. Remove an specific entry in the map
    // TODO 14.07. Remove all the elements in a map
    // TODO 14.08. Get a collection with just the key values in the map
    // TODO 14.09. Get a collection with just the actual values in the map


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
