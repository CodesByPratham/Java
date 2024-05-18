package Exceptions;

/*
 * The finally block is used to execute important code, such as closing
 * connections or cleaning up resources, regardless of whether an exception is
 * handled or not. The finally block is not just for exception handling; it
 * allows you to avoid accidentally bypassing cleanup code. Common use cases
 * include closing files, releasing resources, or cleaning up connections.
 */
public class JavaFinally {

    public static void main(String[] args) {

        try {

            System.out.println("Inside try block");
            int data = 25 / 0; // Throws divide by zero exception
            System.out.println(data);

        } catch (ArithmeticException e) {

            System.out.println("Exception handled");
            System.out.println(e);

        } finally {

            System.out.println("finally block is always executed");

        }

        System.out.println("rest of the code...");

    }
}
