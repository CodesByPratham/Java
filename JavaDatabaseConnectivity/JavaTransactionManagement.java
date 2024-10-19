package JavaDatabaseConnectivity;

import java.util.Scanner;
import java.sql.*;

/**
 * JavaTransactionManagement demonstrates transaction handling using JDBC.
 * The program inserts multiple records into the 'students' table in a single
 * transaction and allows the user to commit or roll back the transaction based
 * on user input.
 */
public class JavaTransactionManagement {

    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        try {
            Class.forName("oracle.jdbc.OracleDriver");

            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "<Username>",
                    "<Password>");

            // Disable auto-commit mode to manage transactions manually
            con.setAutoCommit(false);

            // Set a savepoint to allow partial rollback of transactions
            Savepoint sp = con.setSavepoint("savePoint");

            // SQL query for inserting data into the students table
            String query = "INSERT INTO students VALUES(?, ?, ?, ?, ?, ?)";

            // Create a PreparedStatement for executing the insert query
            PreparedStatement pstmt = con.prepareStatement(query);

            // Loop to insert multiple student records based on user input
            while (true) {
                // Get student details from the user and set them in the prepared statement
                System.out.print("Enter student's id: ");
                pstmt.setInt(1, in.nextInt());

                System.out.print("Enter student's first name: ");
                pstmt.setString(2, in.next());

                System.out.print("Enter student's last name: ");
                pstmt.setString(3, in.next());

                System.out.print("Enter student's age: ");
                pstmt.setInt(4, in.nextInt());

                System.out.print("Enter student's gender: ");
                pstmt.setString(5, in.next());

                System.out.print("Enter student's email: ");
                pstmt.setString(6, in.next());

                // Execute the insert query
                int rows = pstmt.executeUpdate();
                System.out.println(rows + " row inserted");

                // Ask the user if they want to insert more rows
                System.out.println("Do you wish to add more rows (Y/N)?");
                if (in.next().equals("N")) {
                    break;
                }
            }

            // Ask the user whether to commit or roll back the transactions
            System.out.println("Do you wish to commit the above transactions (Y/N): ");
            if (in.next().equals("N")) {
                // Roll back to the savepoint if the user chooses not to commit
                con.rollback(sp);
                System.out.println("All transactions rolled back successfully");
            } else {
                // Commit the transaction if the user chooses to commit
                con.commit();
                System.out.println("All transactions committed successfully");
            }

            pstmt.close();
            con.close();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}