package Exceptions;

import java.io.IOException;

/*
 * You can also throw checked exceptions using the throw keyword. These
 * exceptions must be declared in a throws clause or handled using a try-catch
 * block.
 */
public class JavaThrows {

    // Function to check if a person is eligible to vote or not
    public static void validate(int age) throws IOException {
        if (age < 18) {

            // Throw an IOException if not eligible to vote
            throw new IOException("Sorry, device error");

        } else {

            System.out.println("Person is eligible to vote!!");

        }
    }

    public static void main(String[] args) {
        try {

            validate(13);

        } catch (IOException e) {

            System.out.println("Exception: " + e.getMessage());

        }

        System.out.println("Rest of the code...");
    }

}
