/**
 * The JavaInputStreamReader class demonstrates how to read character data from standard input (console)
 * using the InputStreamReader class. It reads the input from the user and prints the entered characters.
 */
package Streams;

import java.io.IOException;
import java.io.InputStreamReader;

public class JavaInputStreamReader {

    /**
     * The main method serves as the entry point of the program. It performs the
     * following operations:
     * 1. Prompts the user to enter some letters.
     * 2. Reads up to 100 characters from the user's input.
     * 3. Prints the entered characters to the console.
     *
     * @param args Command line arguments (not used).
     */
    public static void main(String[] args) {

        // Reading input from the console using InputStreamReader
        try (InputStreamReader isr = new InputStreamReader(System.in)) {

            // Create a character array to store the input
            char[] charArray = new char[100];

            // Prompt the user to enter some letters
            System.out.print("Enter Some Letters: ");
            isr.read(charArray); // Read characters from the console into the array

            // Print the entered characters to the console
            System.out.println("You Entered:");
            System.out.println(charArray);

        } catch (IOException ioe) {
            // Handle any IOExceptions that may occur
            System.out.println(ioe.getMessage());
        }
    }
}
