/**
 * The JavaFileWriter class demonstrates how to write data to a file using the FileWriter class.
 * It writes data to a file named "write.txt" located in the "Streams" directory and appends
 * additional data to the file.
 */
package Streams;

import java.io.FileWriter;
import java.io.IOException;

public class JavaFileWriter {

    /**
     * The main method serves as the entry point of the program. It performs the
     * following operations:
     * 1. Writes a string to the file "write.txt" in the "Streams" directory
     * (overwrites if the file exists).
     * 2. Appends additional text to the file.
     *
     * @param args Command line arguments (not used).
     */
    public static void main(String[] args) {

        // Writing data to the file "write.txt" (overwrites the file if it exists)
        try (FileWriter fw = new FileWriter("Streams/write.txt")) {
            fw.write("Hello my name is Pratham");
        } catch (IOException ioe) {
            // Handle any IOExceptions that may occur
            System.out.println(ioe.getMessage());
        }

        // Appending additional data to the file "write.txt"
        try (FileWriter fw = new FileWriter("Streams/write.txt", true)) {
            fw.write("\nThis text is appended ");
        } catch (IOException ioe) {
            // Handle any IOExceptions that may occur
            System.out.println(ioe.getMessage());
        }
    }
}
