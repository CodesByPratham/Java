package JavaDatabaseConnectivity;

import java.util.Scanner;
import java.sql.*;

/**
 * JavaPreparedStatementInsert demonstrates how to insert a new student record
 * into an Oracle database using JDBC and PreparedStatement.
 *
 * This program connects to the database, collects student information from the
 * user, and inserts it into the 'students' table.
 */
public class JavaPreparedStatementInsert {

    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");

            Connection con = DriverManager.getConnection(
                    "jdbc:oracle:thin:@localhost:1521:XE", "<Username>", "<Password>");

            // SQL query to insert a new record into the 'students' table
            String query = "INSERT INTO students VALUES(?, ?, ?, ?, ?, ?)";

            // Create a PreparedStatement object to execute the insert query
            PreparedStatement pstmt = con.prepareStatement(query);

            // Get student ID and set it in the PreparedStatement (1st parameter)
            System.out.print("Enter student's id: ");
            pstmt.setInt(1, in.nextInt());

            // Get the student's first name and set it in the PreparedStatement (2nd
            // parameter)
            System.out.print("Enter student's first name: ");
            pstmt.setString(2, in.next());

            // Get the student's last name and set it in the PreparedStatement (3rd
            // parameter)
            System.out.print("Enter student's last name: ");
            pstmt.setString(3, in.next());

            // Get the student's age and set it in the PreparedStatement (4th parameter)
            System.out.print("Enter student's age: ");
            pstmt.setInt(4, in.nextInt());

            // Get the student's gender and set it in the PreparedStatement (5th parameter)
            System.out.print("Enter student's gender: ");
            pstmt.setString(5, in.next());

            // Get the student's email and set it in the PreparedStatement (6th parameter)
            System.out.print("Enter student's email: ");
            pstmt.setString(6, in.next());

            // Execute the insert query, which adds the new student record to the database
            int rows = pstmt.executeUpdate();

            System.out.println(rows + " row inserted");

            pstmt.close();
            con.close();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
