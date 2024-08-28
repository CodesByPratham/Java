/**
 * The JavaOutputStreamWriter class demonstrates how to write various types of data to the standard output (console)
 * using the OutputStreamWriter class. It writes integers, strings, and characters to the console.
 */
package Streams;

import java.io.IOException;
import java.io.OutputStreamWriter;

public class JavaOutputStreamWriter {

    /**
     * The main method serves as the entry point of the program. It performs the
     * following operations:
     * 1. Writes integer values as characters to the console.
     * 2. Writes strings and character arrays to the console.
     * 3. Writes individual characters to the console.
     *
     * @param args Command line arguments (not used).
     * @throws IOException If an I/O error occurs during writing.
     */
    public static void main(String[] args) {

        // Writing data to the console using OutputStreamWriter
        try (OutputStreamWriter osw = new OutputStreamWriter(System.out)) {

            // Write integer values as characters
            osw.write(10); // Writes the newline character (ASCII value 10)
            osw.write(85); // Writes the character 'U' (ASCII value 85)

            // Write strings and character arrays
            osw.write("Hello World!");
            osw.write("Pratham Rathod".toCharArray());

            // Write individual characters
            osw.write('\n'); // Writes a newline character
            osw.write('A'); // Writes the character 'A'

        } catch (IOException ioe) {
            // Handle any IOExceptions that may occur
            System.out.println(ioe.getMessage());
        }
    }
}
