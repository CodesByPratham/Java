# Java Concepts

This repository contains Java programs and solved problems focusing on various Java concepts, including the Collection Framework, Object-Oriented Programming (OOP), basic programming constructs like arrays, ArrayLists, methods, shadowing, type casting, strings, conditional loops, exceptions, multithreading, and more. Below is an overview of the contents and how to navigate through them.

## Contents

1. [Collection Framework](#collection-framework)
    - Arrays Class
    - Collections Class
    - Lists
    - Maps
    - Queues
    - Set
2. [Object-Oriented Programming (OOP)](#object-oriented-programming-oop)
    - Classes and Objects
    - Inheritance
    - Polymorphism
    - Abstraction
    - Encapsulation
3. [Basic Programming Concepts](#basic-programming-concepts)
    - Arrays
    - ArrayLists
    - Methods
    - Shadowing
    - Type Casting
    - Strings
4. [Exceptions](#exceptions)
    - Types of Exceptions
        - User-Defined Exceptions
        - Built-in Exceptions
            - Checked Exceptions
            - Unchecked Exceptions
    - Throw
    - Throws
    - Finally
    - Chained Exceptions
5. [Multithreading](#multithreading)
    - Basics of Multithreading
    - Two Ways to Use Multithreading
    - Thread Priorities
    - Thread States
    - Main Thread
    - Thread Methods
6. [Generics](#generics)
    - What are Generics?
    - Benefits of Generics
    - How Generics Work
    - Type Parameters
    - Generic Classes
    - Generic Methods
    - Wildcards

## [Collection Framework](https://github.com/Prathamr-codes/Java/tree/main/CollectionFramework)

This section covers various aspects of the Collection Framework in Java, including classes like Arrays, Collections, Lists, Maps, Queues, and Sets.

### Arrays Class

- Implementation and manipulation of arrays using Java's Arrays class methods.

### Collections Class

- Utilizing the Collections class for operations on collections such as sorting, searching, etc.

### Lists

- Working with List interfaces and implementations like ArrayList, LinkedList, etc.

### Maps

- Utilizing Map interfaces and implementations such as HashMap, TreeMap, etc., for key-value mappings.

### Queues

- Implementing Queue data structure using Java's Queue interface and related classes like LinkedList, PriorityQueue, etc.

### Set

- Understanding and utilizing Set interfaces and implementations like HashSet, TreeSet, etc., for storing unique elements.

## [Object-Oriented Programming (OOP)](https://github.com/Prathamr-codes/Java/tree/main/ObjectOrientedProgramming)

Exploring the core concepts of Object-Oriented Programming which form the foundation of Java's structure and modular approach.

### Classes and Objects

- Classes define a blueprint for objects. Objects are instances of classes and encapsulate state and behavior.

### Inheritance

- Inheritance is a mechanism where one class inherits the properties and behaviors of another class, promoting code reusability.

### Polymorphism

- Polymorphism allows methods to do different things based on the object it is acting upon, enhancing flexibility in code.

### Abstraction

- Abstraction simplifies complexity by hiding the detailed implementation and showing only the essential features of an object or system.

### Encapsulation

- Encapsulation protects the data in an object from unwanted access by binding the data with the code that manipulates it.

## [Basic Programming Concepts](https://github.com/Prathamr-codes/Java/tree/main/Concepts)

This section delves into fundamental Java concepts, providing explanations and examples for better understanding.

### Arrays

- Basic operations on arrays, including declaration, initialization, and manipulation.

### ArrayLists

- Working with ArrayLists, including adding, removing, and accessing elements dynamically.

### Methods

- Understanding methods in Java, including method declaration, invocation, and parameter passing.

### Shadowing

- Explaining variable shadowing in Java and its implications.

### Type Casting

- Covering type casting in Java, including implicit and explicit casting.

### Strings

- Operations on strings in Java, such as concatenation, substring, etc.

## [Exceptions](https://github.com/Prathamr-codes/Java/tree/main/Exceptions)

This section covers the concepts of handling exceptions in Java, ensuring robust and error-free code.

### Types of Exceptions

#### User-Defined Exceptions
- Creating custom exceptions to handle specific error scenarios.

#### Built-in Exceptions

##### Checked Exceptions
- Exceptions that are checked at compile-time.

##### Unchecked Exceptions
- Exceptions that occur at runtime and are not checked at compile-time.

### Throw
- The `throw` keyword is used to explicitly throw an exception.

### Throws
- The `throws` keyword is used in method signatures to declare that a method can throw certain exceptions.

### Finally
- The `finally` block contains code that is always executed, whether an exception is handled or not.

### Chained Exceptions
- Chained exceptions allow an exception to maintain a cause, which is useful for debugging.

## [Multithreading](https://github.com/Prathamr-codes/Java/tree/main/Multithreading)

This section explores multithreading concepts in Java, enabling concurrent execution of two or more threads for maximum utilization of CPU.

### Basics of Multithreading

- Understanding the core concepts of multithreading, including its advantages and basic structure.

### Two Ways to Use Multithreading

- Implementing multithreading using the `Thread` class and the `Runnable` interface.

### Thread Priorities

- Managing thread priorities to influence the order of thread execution.

### Thread States

- Exploring the lifecycle of a thread and various thread states such as new, runnable, blocked, waiting, timed waiting, and terminated.

### Main Thread

- Understanding the main thread in Java and how it controls the execution of a program.

### Thread Methods

- Using important thread methods such as `start()`, `run()`, `sleep()`, `join()`, `yield()`, and others for thread management.

## [Generics](https://github.com/Prathamr-codes/Java/tree/main/Generics)

This section introduces the concept of generics in Java, which allows for type-safe operations and code reusability.

### What are Generics?

Generics are a feature in Java that enable you to define classes, interfaces, and methods with a placeholder for the type they operate on. This placeholder, known as a type parameter, allows for flexible and reusable code.

### Benefits of Generics

1. **Type Safety**:
   - Generics provide compile-time type checking and help catch type-related errors early, reducing the risk of runtime exceptions.

2. **Code Reusability**:
   - Generics allow you to write a single class or method that can handle multiple types, avoiding the need for code duplication.

3. **Elimination of Casts**:
   - By using generics, explicit type casting is unnecessary, resulting in cleaner and more maintainable code.

### How Generics Work

#### Type Parameters

Generics use type parameters to specify the type of data a class, interface, or method will operate on. These parameters are defined within angle brackets (`<>`) and allow for type-safe operations.

#### Generic Classes

A generic class is a class that can operate on any type specified by a type parameter. This allows for the creation of versatile and reusable components.

#### Generic Methods

Generic methods are methods that use type parameters and can handle different types. They enable methods to perform operations on various types without needing multiple implementations.

#### Wildcards

Wildcards (`?`) represent an unknown type and provide flexibility in working with different types while maintaining type safety.

---

Feel free to explore the repository and dive into the Java concepts and solved problems provided. If you have any questions or suggestions, don't hesitate to reach out. Happy coding! 🚀
