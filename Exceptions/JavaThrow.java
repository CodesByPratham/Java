package Exceptions;

/*
 * The throw keyword is used to explicitly throw an exception from a method or
 * block of code when an error or exceptional condition occurs that the program
 * cannot handle at runtime.
 */
public class JavaThrow {

    // Function to check if a person is eligible to vote or not
    public static void validate(int age) {
        if (age < 18) {
            // Throw an ArithmeticException if not eligible to vote
            throw new ArithmeticException("Person is not eligible to vote");
        } else {
            System.out.println("Person is eligible to vote!!");
        }
    }

    public static void main(String[] args) {
        validate(13);
        System.out.println("Rest of the code...");
    }
}