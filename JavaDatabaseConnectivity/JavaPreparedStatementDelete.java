package JavaDatabaseConnectivity;

import java.util.Scanner;
import java.sql.*;

/**
 * JavaPreparedStatementDelete demonstrates how to delete a student record
 * from an Oracle database using JDBC and a PreparedStatement.
 *
 * The program connects to the database, prompts the user to provide a student
 * ID, and deletes the record with the corresponding ID from the 'students'
 * table.
 */
public class JavaPreparedStatementDelete {

    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");

            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "<Username>",
                    "<Password>");

            // SQL query to delete a student record from the 'students' table where the
            // student ID matches the input
            String query = "DELETE FROM students WHERE student_id = ?";

            // Create a PreparedStatement object to execute the delete query
            PreparedStatement pstmt = con.prepareStatement(query);

            // Prompt the user to enter the student ID of the record they wish to delete
            System.out.print("Enter student's id that you wish to delete: ");
            // Set the student ID in the PreparedStatement (1st parameter)
            pstmt.setInt(1, in.nextInt());

            // Execute the delete query and retrieve the number of rows affected
            int rows = pstmt.executeUpdate();

            System.out.println(rows + " row deleted");

            pstmt.close();
            con.close();
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }
}
