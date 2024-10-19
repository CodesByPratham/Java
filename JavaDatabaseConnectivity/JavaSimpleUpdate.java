package JavaDatabaseConnectivity;

import java.sql.*;
import java.util.Scanner;

public class JavaSimpleUpdate {

    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        try {
            // Loading and registering the Oracle JDBC driver
            Class.forName("oracle.jdbc.driver.OracleDriver");

            // Establishing a connection to the Oracle database
            Connection con = DriverManager.getConnection(
                    "jdbc:oracle:thin:@localhost:1521:XE", "<Username>", "<Password>");

            // Prompting the user to enter student details
            System.out.print("Enter student's id that you wish to update: ");
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

            // SQL query to update the student's record in the "students" table
            String query = "UPDATE students SET first_name = '" + fname + "', last_name = '" + lname + "', age = "
                    + age + ", gender = '" + gender + "', email = '" + email + "' WHERE student_id = " + id;

            // Creating a Statement object to execute the SQL update query
            Statement stmt = con.createStatement();

            // Executing the SQL UPDATE query to modify the student record
            stmt.executeUpdate(query);

            // Closing the Statement and Connection objects after the update is done
            stmt.close();
            con.close();
        } catch (Exception e) {
            // Handling any exceptions that may occur and printing the error message
            System.out.println("Error: " + e.getMessage());
        }
    }
}