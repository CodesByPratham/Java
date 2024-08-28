/**
 * The JavaBufferedWriter class demonstrates the use of BufferedWriter to write output 
 * to both the console and a file. It showcases two different ways of writing character data 
 * using BufferedWriter - to standard output and to a text file.
 */
package Streams;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class JavaBufferedWriter {

    /**
     * The main method serves as the entry point of the program. It performs two
     * primary functions:
     * 1. Writes character data to standard output (console).
     * 2. Writes character data to a file named "write.txt" located in the "Streams"
     * directory.
     *
     * @param args Command line arguments (not used).
     */
    public static void main(String[] args) {

        // Writing character data to standard output (console)
        try (BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {

            // Write a string to the console
            bw.write("Pratham Rathod");

        } catch (IOException ioe) {
            // Handle any IOExceptions that may occur
            System.out.println(ioe.getMessage());
        }

        // Writing character data to a file ("Streams/write.txt")
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("Streams/write.txt"))) {

            // Write a string to the file
            bw.write("Hello, Myself Pratham Rathod");

            // Append additional text to the file
            bw.append("\nThis text is appended");

        } catch (IOException ioe) {
            // Handle any IOExceptions that may occur
            System.out.println(ioe.getMessage());
        }
    }
}
