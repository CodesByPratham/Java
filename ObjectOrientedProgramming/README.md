# Object-Oriented Programming (OOP) in Java

This README.md provides an overview of the fundamental Object-Oriented Programming (OOP) concepts implemented in Java, including Classes and Objects, Polymorphism, Encapsulation, Abstraction, and Inheritance.

## Classes and Objects

### Java Constructors
A constructor in Java is a special method used to initialize objects. The constructor is called when an object of a class is created. It can be used to set initial values for object attributes.

### Constructor Overloading
Constructor overloading in Java is a technique of having more than one constructor with different parameter lists. They are arranged in a way that each constructor performs a different task. They are differentiated by the compiler by the number of parameters in the list and their types.

## Polymorphism

### Compile-Time Polymorphism (Method Overloading)
Method overloading, also known as static polymorphism, occurs when two or more methods in the same class have the same name but different parameters. It helps to increase the readability of the program.

### Runtime Polymorphism (Method Overriding)
Method overriding, on the other hand, occurs when a derived class has a definition for one of the member functions of the base class. That base function is said to be overridden.

## Encapsulation
Encapsulation is a mechanism of wrapping the data (variables) and code acting on the data (methods) together as a single unit. In encapsulation, the variables of a class are hidden from other classes and can be accessed only through the methods of their current class. Therefore, it is also known as data hiding.

## Abstraction

### Abstract Classes
An abstract class cannot be instantiated, but they can have a subclass. Abstract classes may contain abstract methods which do not have a body, so the method body must be provided by the subclass.

### Interfaces
An interface in Java is a completely "abstract class" that is used to group related methods with empty bodies. To access the interface methods, the interface must be "implemented" (kinda like inherited) by another class with the `implements` keyword (instead of `extends`). The body of the interface method is provided by the "implement" class.

## Inheritance

### Types of Inheritance
Inheritance is one of the fundamental features of OOP that allows a class to inherit commonly used state and behavior from another class. In Java, there are several types of inheritance:

- **Single Inheritance:** A class extends another class.
- **Multilevel Inheritance:** A class extends a derived class.
- **Hierarchical Inheritance:** Multiple classes extend the same base class.
- **Multiple Inheritance (Through Interfaces):** A class implements multiple interfaces.
- **Hybrid Inheritance:** A combination of two or more types of inheritance. In Java, this is implemented using a mix of classes and interfaces.

---

This README.md provides a brief overview of the key OOP concepts in Java. For more detailed explanations and examples, refer to the respective Java documentation or explore the source code provided in this repository.
