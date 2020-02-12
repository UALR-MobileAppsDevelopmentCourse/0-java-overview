package edu.ualr.objectorientedprogramming;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;


// TODO 01. Object vs Classes. Typical elements or components that we can find in a class?

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


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Vehicle v = new Vehicle("Porsche", 2019);
    }
}
