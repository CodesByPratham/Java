package Exceptions;

/*
 * User-defined exceptions in Java are custom exceptions that developers create
 * for handling specific error conditions in their application. Unlike Java’s
 * standard exception classes, which cover general types of exceptions,
 * user-defined exceptions are defined by the programmer to address particular
 * issues unique to the application or its business logic1
 */
class MyException extends Exception {

    public MyException(String message) {

        super(message);
    }
}

public class JavaUserDefinedException {

    public static void main(String[] args) {

        try {

            throw new MyException("GeeksGeeks");

        } catch (MyException ex) {

            System.out.println("Caught");
            System.out.println(ex.getMessage());
        }
    }
}
