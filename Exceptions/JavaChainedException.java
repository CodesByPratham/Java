package Exceptions;

/*
 * Chained exception is a technique that allows programmers to associate one
 * exception with another. It simplifies debugging by providing additional
 * information about a specific exception.
 */
public class JavaChainedException {

    public static void main(String[] args) {

        try {

            String s = null;
            int num = Integer.parseInt(s); // This line throws a NumberFormatException
            System.out.println(num);

        } catch (NumberFormatException e) {

            RuntimeException ex = new RuntimeException("Exception");
            ex.initCause(new NullPointerException("Actual cause of the exception"));
            throw ex; // Throw the new exception with the chained exception

        }

    }
}
