/**
 * The JavaFile class demonstrates file operations in Java, including creating a file,
 * writing data to it, reading data from it, and the option to delete the file.
 * It uses BufferedWriter and BufferedReader to handle file I/O operations.
 */
package Streams;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class JavaFile {

    /**
     * The main method serves as the entry point of the program. It performs the
     * following operations:
     * 1. Creates a new file named "new-file.txt" in the "Streams" directory.
     * 2. Writes "Hello World!" to the newly created file.
     * 3. Reads the content of the file and prints it to the console.
     * 4. (Optional) Deletes the file after reading its content (commented out).
     *
     * @param args Command line arguments (not used).
     */
    public static void main(String[] args) {

        try {
            // Create a new file object representing "new-file.txt" in the "Streams"
            // directory
            File f = new File("Streams/new-file.txt");

            // Create the file if it does not already exist
            f.createNewFile();

            // Write "Hello World!" to the file using BufferedWriter
            BufferedWriter bw = new BufferedWriter(new FileWriter(f));
            bw.write("Hello World!");
            bw.close(); // Close the BufferedWriter to ensure data is written to the file

            // Read the content of the file using BufferedReader
            BufferedReader br = new BufferedReader(new FileReader(f));
            char[] charArray = new char[100];
            br.read(charArray); // Read the file content into the character array
            System.out.println(charArray); // Print the content to the console
            br.close(); // Close the BufferedReader

            // Uncomment the following line to delete the file after reading its content
            // f.delete();

        } catch (IOException ioe) {
            // Handle any IOExceptions that may occur
            System.out.println(ioe.getMessage());
        }
    }
}
