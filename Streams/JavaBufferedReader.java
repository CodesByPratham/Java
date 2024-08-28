/**
 * The JavaBufferedReader class demonstrates the use of BufferedReader to read input from
 * both the console and a file. It showcases two different ways of reading character data using
 * BufferedReader - from standard input and from a text file.
 */
package Streams;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class JavaBufferedReader {

    /**
     * The main method serves as the entry point of the program. It performs two
     * primary functions:
     * 1. Reads character data from standard input (console).
     * 2. Reads character data from a file named "read.txt" located in the "Streams"
     * directory.
     *
     * @param args Command line arguments (not used).
     */
    public static void main(String[] args) {

        // Reading character data from standard input (console)
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {

            // Create a character array to store the input data
            char[] charArray = new char[100];

            // Prompt the user to enter some letters
            System.out.print("Enter Some Letters: ");

            // Read characters into the array from the console
            br.read(charArray);

            // Display the characters entered by the user
            System.out.print("You Entered: ");
            System.out.println(charArray);

        } catch (IOException ioe) {
            // Handle any IOExceptions that may occur
            System.out.println(ioe.getMessage());
        }

        // Reading character data from a file ("Streams/read.txt")
        try (BufferedReader br = new BufferedReader(new FileReader("Streams/read.txt"))) {

            // Create a character array to store the data read from the file
            char[] charArray = new char[100];

            // Read characters from the file into the array
            br.read(charArray);

            // Display the data read from the file
            System.out.print("Data In File: ");
            System.out.println(charArray);

        } catch (IOException ioe) {
            // Handle any IOExceptions that may occur
            System.out.println(ioe.getMessage());
        }
    }
}
