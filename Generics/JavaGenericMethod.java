package Generics;

public class JavaGenericMethod {
    // Generic method with two type parameters
    public static <T1, T2> void printPair(T1 first, T2 second) {
        System.out.println("First: " + first);
        System.out.println("Second: " + second);
    }

    public static void main(String[] args) {
        // Using the generic method with different types
        printPair(1, "Hello"); // Output: First: 1 Second: Hello
        printPair(3.14, true); // Output: First: 3.14 Second: true
        printPair("Java", 2024); // Output: First: Java Second: 2024
    }

}
