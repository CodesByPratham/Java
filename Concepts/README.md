# Java Concepts

## Types of Lanugages

1. Procedural Programming Languages
   Follows a step-by-step approach where instructions execute sequentially, using reusable procedures to manipulate data systematically. Ideal for applications requiring clear logic and control flow.

   - Examples:
     C,C++,Java,Pascal,BASIC

   - Use cases:
     Systems programming (i.e. operating systems, embedded systems, device drivers)
     High-performance applications
     Game development

2. Functional Programming Languages
   Treats computation as the evaluation of mathematical functions, avoiding changing values or states. It focuses on immutability and pure functions for predictable, maintainable code, suitable for handling large datasets and parallel processing.

   - Examples:
     Scala,Erlang,Haskell,Elixir,F#

   - Use cases:
     Data science and data manipulation
     Mathematical computations
     Distributed systems

3. Object-Oriented Programming Languages
   Organizes code into objects, each defined by attributes and methods. It enables modular, reusable, and maintainable structures using principles like inheritance and encapsulation, making it great for large-scale software applications.

   - Examples:
     Java,Python,PHP,C++,Ruby

   - Use cases:
     Large or complex software applications
     Web development
     AI applications

## Static vs Dynamic typed language

A language is statically typed if the type of a variable is known at compile time. For some languages this means that you as the programmer must specify what type each variable is; other languages (e.g.: Java, C, C++) offer some form of type inference, the capability of the type system to deduce the type of a variable (e.g.: OCaml, Haskell, Scala, Kotlin).

The main advantage here is that all kinds of checking can be done by the compiler, and therefore a lot of trivial bugs are caught at a very early stage.

Examples: C, C++, Java, Rust, Go, Scala

A language is dynamically typed if the type is associated with run-time values, and not named variables/fields/etc. This means that you as a programmer can write a little quicker because you do not have to specify types every time (unless using a statically-typed language with type inference).

Examples: Perl, Ruby, Python, PHP, JavaScript, Erlang

## Memory Management

1. Stack Memory
   Purpose: Stores method-specific values like local variables, method calls, and references to objects in the heap.
   Characteristics:
   LIFO (Last In, First Out): Memory is allocated and deallocated in a specific order.
   Thread-Specific: Each thread has its own stack.
   Automatic Management: Memory is automatically freed when a method call ends.
   Size: Limited and smaller compared to heap memory.
   Example:

   ```java
   void example() {
        int x = 10; // 'x' is stored in stack memory
   }
   ```

2. Heap Memory
   Purpose: Stores objects and class-level variables (e.g., instance variables).
   Characteristics:
   Global Access: Objects in the heap are accessible globally via references.
   Garbage Collection: Managed by Java's Garbage Collector to free unused memory.
   Shared: Shared across all threads.
   Size: Larger and more flexible than stack memory.
   Example:

   ```java
   class Example {
        int y = 20; // 'y' is stored in heap memory
   }
   ```

## How java code works

# Java Code Execution Flow Diagram

                                    +-------------------+
                                    |   Source Code     |
                         +--------->|                   |
                         |          |   Sample.java     |
                         |          +--------+----------+
                         |                   |
             Compilation |                   | javac
               Errors    |                   v
                         |          +-------------------+
                         |          |    Compiler       |
                         |          +--------+----------+
                         |                   |
                         +-------------------+
                                             |
                                             |
                                             |
                                             |
                                             v
                                   +-------------------+
                                   |     Bytecode      |
                                   |                   |
                                   |   Sample.class    |
                                   +--------+----------+
                                            |
                                            |
                                            v
                                   +-------------------+
                                   |        JVM        |
                                   +-------------------+
                                            |
              +------------------+----------+----------+------------------+
              |                  |                     |                  |
              v                  v                     v                  v
     +----------------+  +----------------+   +----------------+  +----------------+
     |  Windows OS    |  |   UNIX OS      |   |   Mac OS       |  |  Mobile OS     |
     | (Machine Code) |  | (Machine Code) |   | (Machine Code) |  | (Machine Code) |
     +----------------+  +----------------+   +----------------+  +----------------+

- Java code is written in a .java file using a text editor or an Integrated Development Environment (IDE).
  ```java
  public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
  }
  ```
- The Java Compiler (javac) converts the .java file into bytecode, which is stored in a .class file.
  Bytecode is a platform-independent, intermediate representation of the code.
  ```bash
  javac HelloWorld.java
  ```
- The Java Class Loader (part of the Java Virtual Machine, JVM) loads the .class file into memory.
- The JVM verifies the bytecode to ensure it adheres to Java's security and integrity rules, preventing malicious or corrupted code from executing.
- The JVM interprets or compiles the bytecode into machine code using:
  Interpreter: Executes bytecode line by line (slower).
  Just-In-Time (JIT) Compiler: Converts frequently used bytecode into native machine code for faster execution.
  ```bash
  java HelloWorld
  ```
- The JVM provides a runtime environment, managing memory (via Garbage Collection), threads, and other resources during execution.
  ```output
  Hello, World!
  ```

This process ensures Java's "Write Once, Run Anywhere" capability, as the bytecode can run on any platform with a compatible JVM.

## Platform Independence

- It means that byte code can run on all operating systems.
- We need to convert source code to machine code so computer can understand
- Compiler helps in doing this by turning it into executable code
- this executable code is a set of instructions for the computer
- After compiling C/C++ code we get .exe file which is platform dependent
- In Java we get bytecode, JVM converts this to machine code
- Java is platform-independent but JVM is platform dependent

## Java architecture

```
+-----------------------------------------------------+
| JDK = JRE + Development Tools                       |
| (Java Development Kit)                              |
|                                                     |
|   +---------------------------------------------+   |
|   | JRE = JVM + Library Classes                 |   |
|   | (Java Runtime Environment)                  |   |
|   |                                             |   |
|   |   +-------------------------------------+   |   |
|   |   | Java Virtual Machine (JVM)          |   |   |
|   |   |                                     |   |   |
|   |   |   +---------------------------+     |   |   |
|   |   |   | JIT (Just-In-Time)        |     |   |   |
|   |   |   +---------------------------+     |   |   |
|   |   +-------------------------------------+   |   |
|   +---------------------------------------------+   |
+-----------------------------------------------------+
```

- JDK(Java Developement Kit)
  Provides environment to develop and run Java program.
  It provides packages that includes:

  - Development tools to provide an environment to develop your program.
  - JRE to execute your program.
  - A compiler - javac
  - Archiver - .jar
  - Docs generator - javadoc
  - interpreter/loader

- JRE(Java Runtime Environment)
  It is an installation prackage that provides environment to only run the program.
  It consists of:

  - Deployment technologies
  - User interface technologies.
  - Integration libraries
  - Base libraries
  - JVM

  After we get the .class file, the next thing happen at rutime:

  - Class loader loads all the classes needed to execute the program in the memory.
  - JVM sends the code to byte code verifier to check the format of the code.

- JVM(Java Virtual Machine)
  Interpreter:

  - Executes code line by line.
  - If a method is called repeatedly,
    it's re-interpreted each time.

  JIT (Just-In-Time):

  - Converts frequently-used methods into machine code.
  - Avoids re-interpretation.
  - Improves performance.

  Garbage Collector:

  - Manages memory by clearing unused objects.

```
               Compile Time                    Runtime
               ------------                    -------
              +------------+             +------------------+
              | .java file |             |    Class Loader  |
              +------------+             +------------------+
                     |                             |
              javac  |                             v
       (compilation) v                  +----------------------+
              +--------------+          | Byte Code Verifier   |
              |  .class file |          +----------------------+
              +--------------+                     |
                                                   v
                                            +---------------+
                                            |  Interpreter  |
                                            +---------------+
                                                   |
                                                   v
                                            +--------------+
                                            |   Runtime    |
                                            +--------------+
                                                   |
                                                   v
                                            +--------------+
                                            |   Hardware   |
                                            +--------------+
```

- How JVM works:
  Class Loader:

  - Loading:
    - Reads .class file, generates binary data.
    - Creates object in heap.
  - Linking:
    - Verifies .class file.
    - Allocates memory for class variables & default values.
    - Replaces symbolic refs with direct refs.
  - Initialization:
    - Assigns values to static variables and blocks.

  JVM contains:

  - Stack and Heap memory allocations.

## Datatypes

- Primitive Data Types in Java
  Primitive data types in Java store only single values and do not provide additional functionality. Java defines 8 primitive data types, as described in the table below:

  | Type    | Description                    | Default  | Size                             | Example Literals                                   | Range of Values                                         |
  | ------- | ------------------------------ | -------- | -------------------------------- | -------------------------------------------------- | ------------------------------------------------------- |
  | boolean | true or false                  | false    | JVM-dependent (typically 1 byte) | `true`, `false`                                    | `true`, `false`                                         |
  | byte    | 8-bit signed integer           | 0        | 1 byte                           | _(none)_                                           | -128 to 127                                             |
  | char    | Unicode character (16-bit)     | `\u0000` | 2 bytes                          | `'a'`, `'\u0041'`, `'\101'`, `'\\'`, `'\n'`, `'β'` | 0 to 65,535 (unsigned)                                  |
  | short   | 16-bit signed integer          | 0        | 2 bytes                          | _(none)_                                           | -32,768 to 32,767                                       |
  | int     | 32-bit signed integer          | 0        | 4 bytes                          | `-2`, `0`, `1`                                     | -2,147,483,648 to 2,147,483,647                         |
  | long    | 64-bit signed integer          | 0L       | 8 bytes                          | `-2L`, `0L`, `1L`                                  | -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807 |
  | float   | 32-bit IEEE 754 floating-point | 0.0f     | 4 bytes                          | `3.14f`, `-1.23e-10f`                              | ~6-7 significant decimal digits                         |
  | double  | 64-bit IEEE 754 floating-point | 0.0d     | 8 bytes                          | `3.1415d`, `1.23e100d`                             | ~15-16 significant decimal digits                       |


## Arrays

Arrays in Java are used to store multiple values of the same data type under a single name. They have a fixed size and are indexed from 0 to (length-1). Arrays can be of primitive data types or objects.

## ArrayLists

ArrayLists in Java are dynamic arrays that can grow and shrink in size dynamically. They are part of the Java Collections Framework and provide methods for adding, removing, and accessing elements. ArrayLists can only store objects, not primitive data types.

## Methods

Methods in Java are blocks of code that perform a specific task and are reusable. They are declared within a class and can be called from other parts of the program. Methods can have parameters and return values, or they can be void.

## Shadowing

Shadowing occurs in Java when a variable declared within a certain scope has the same name as a variable declared in an outer scope. In such cases, the inner variable "shadows" the outer variable, making it inaccessible within that scope.

## Type Casting

Type casting in Java is the process of converting one data type into another. It can be either implicit or explicit. Implicit type casting (widening) occurs when converting from a smaller data type to a larger data type, while explicit type casting (narrowing) requires an explicit cast operator and may result in data loss.

## Strings

Strings in Java are sequences of characters enclosed in double quotes. They are immutable, meaning their values cannot be changed once they are created. Java provides a rich set of methods for manipulating strings, such as concatenation, substring extraction, and searching.

## Stream API

The Stream API, introduced in Java 8, is a powerful tool for processing sequences of elements in a functional and declarative style. It allows developers to perform operations such as filtering, mapping, and reducing data with concise and expressive code. Streams can be created from collections, arrays, or other data sources, and support both sequential and parallel operations. Key operations include Intermediate operations and Terminal Operations. The Stream API simplifies data processing tasks, enhances code readability, and supports parallelism, making it a valuable addition to the Java language.

---

This README.md provides a brief overview of fundamental Java concepts. For more detailed explanations and examples, refer to the respective Java documentation or explore the source code provided in this repository.
