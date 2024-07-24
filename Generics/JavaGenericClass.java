package Generics;

class IntegerPrinter {
    private Integer value;

    public IntegerPrinter(Integer value) {
        this.value = value;
    }

    public void print() {
        System.out.println(value);
    }
}

class DoublePrinter {
    private Double value;

    public DoublePrinter(Double value) {
        this.value = value;
    }

    public void print() {
        System.out.println(value);
    }
}

// Define a generic class Printer with a type parameter T
class Printer<T> {
    // Declare a variable of type T
    private T value;

    // Constructor that accepts a parameter of type T
    public Printer(T value) {
        this.value = value;
    }

    // Method to print the value
    public void print() {
        System.out.println(value);
    }
}

public class JavaGenericClass {
    public static void main(String[] args) {
        // Create a Printer object for Integer type and print the value
        Printer<Integer> integerPrinter = new Printer<>(123);
        integerPrinter.print();  // Output: 123

        // Create a Printer object for Double type and print the value
        Printer<Double> doublePrinter = new Printer<>(45.67);
        doublePrinter.print();  // Output: 45.67

        // Create a Printer object for String type and print the value
        Printer<String> stringPrinter = new Printer<>("Hello, Generics!");
        stringPrinter.print();  // Output: Hello, Generics!
    }
}