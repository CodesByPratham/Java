/**
 * The JavaFileReader class demonstrates how to read data from a file using the FileReader class.
 * It reads the contents of a file named "read.txt" located in the "Streams" directory and prints
 * the data to the console.
 */
package Streams;

import java.io.FileReader;
import java.io.IOException;

public class JavaFileReader {

    /**
     * The main method serves as the entry point of the program. It performs the
     * following operations:
     * 1. Opens the file "read.txt" in the "Streams" directory.
     * 2. Reads up to 100 characters from the file and stores them in a character
     * array.
     * 3. Prints the contents of the character array to the console.
     *
     * @param args Command line arguments (not used).
     */
    public static void main(String[] args) {

        // Reading data from the file "read.txt"
        try (FileReader fr = new FileReader("Streams/read.txt")) {

            // Create a character array to store the data read from the file
            char[] charArray = new char[100];
            fr.read(charArray); // Read characters from the file into the array

            // Print the data read from the file to the console
            System.out.println("Data in the file:");
            System.out.println(charArray);

        } catch (IOException ioe) {
            // Handle any IOExceptions that may occur
            System.out.println(ioe.getMessage());
        }
    }
}
