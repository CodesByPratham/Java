package JavaDatabaseConnectivity;

import java.util.Scanner;
import java.sql.*;

/**
 * JavaPreparedStatementUpdate demonstrates how to update student records
 * in an Oracle database using JDBC and a PreparedStatement.
 *
 * The program connects to the database, prompts the user for student details,
 * and updates the specified student's information in the database.
 */
public class JavaPreparedStatementUpdate {

    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");

            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "<Username>",
                    "<Password>");

            // SQL query to update student details in the 'students' table
            String query = "UPDATE students SET first_name = ?, last_name = ?, age = ?, gender = ?, email = ? WHERE student_id = ?";

            // Create a PreparedStatement object to execute the query safely
            PreparedStatement pstmt = con.prepareStatement(query);

            // Prompt the user for the student ID they wish to update
            System.out.print("Enter student's id that you wish to update: ");
            // Set the student ID in the prepared statement (6th parameter)
            pstmt.setInt(6, in.nextInt());

            // Prompt for the student's first name and set it in the prepared statement (1st
            // parameter)
            System.out.print("Enter student's first name: ");
            pstmt.setString(1, in.next());

            // Prompt for the student's last name and set it in the prepared statement (2nd
            // parameter)
            System.out.print("Enter student's last name: ");
            pstmt.setString(2, in.next());

            // Prompt for the student's age and set it in the prepared statement (3rd
            // parameter)
            System.out.print("Enter student's age: ");
            pstmt.setInt(3, in.nextInt());

            // Prompt for the student's gender and set it in the prepared statement (4th
            // parameter)
            System.out.print("Enter student's gender: ");
            pstmt.setString(4, in.next());

            // Prompt for the student's email and set it in the prepared statement (5th
            // parameter)
            System.out.print("Enter student's email: ");
            pstmt.setString(5, in.next());

            // Execute the update query and retrieve the number of rows affected
            int rows = pstmt.executeUpdate();

            System.out.println(rows + " row updated");

            pstmt.close();
            con.close();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
