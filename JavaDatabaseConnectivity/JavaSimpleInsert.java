package JavaDatabaseConnectivity;

import java.sql.*;
import java.util.Scanner;

public class JavaSimpleInsert {

    // Creating a static Scanner object to take user input from the console
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        try {
            // Loading and registering the Oracle JDBC driver
            Class.forName("oracle.jdbc.driver.OracleDriver");

            // Establishing a connection to the database
            // Replace <Username> and <Password> with your actual Oracle DB credentials
            Connection con = DriverManager.getConnection(
                    "jdbc:oracle:thin:@localhost:1521:XE", "<Username>", "<Password>");

            // Prompting the user to enter student details
            System.out.print("Enter student's id: ");
            int id = in.nextInt(); // Reading student ID (integer)

            System.out.print("Enter student's first name: ");
            String fname = in.next(); // Reading student's first name (string)

            System.out.print("Enter student's last name: ");
            String lname = in.next(); // Reading student's last name (string)

            System.out.print("Enter student's age: ");
            int age = in.nextInt(); // Reading student's age (integer)

            System.out.print("Enter student's gender: ");
            String gender = in.next(); // Reading student's gender (string)

            System.out.print("Enter student's email: ");
            String email = in.next(); // Reading student's email (string)

            // SQL query to insert the student's data into the "students" table
            String query = "INSERT INTO students VALUES(" + id + ", '" + fname + "', '" + lname + "', " + age + ", '"
                    + gender + "', '" + email + "')";

            // Creating a Statement object to execute the query
            Statement stmt = con.createStatement();

            // Executing the SQL INSERT query using the executeUpdate() method
            // executeUpdate() is used for queries that modify the database (INSERT, UPDATE,
            // DELETE)
            stmt.executeUpdate(query);

            // Closing the Statement and Connection objects to release resources
            stmt.close();
            con.close();
        } catch (Exception e) {
            // Handling any exceptions that may occur during the process
            System.out.println("Error: " + e.getMessage());
        }
    }
}
