package JavaDatabaseConnectivity;

import java.util.Scanner;
import java.sql.*;

public class JavaSimpleDelete {

    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        try {
            System.out.print("Enter student's id that you wish to delete: ");
            int id = in.nextInt();

            // Loading and registering the Oracle JDBC driver
            Class.forName("oracle.jdbc.driver.OracleDriver");

            // Establishing a connection to the Oracle database
            Connection con = DriverManager.getConnection(
                    "jdbc:oracle:thin:@localhost:1521:XE", "<Username>", "<Password>");

            // SQL query to delete the student record from the "students" table
            String query = "DELETE FROM students WHERE student_id = " + id;

            // Creating a Statement object to execute the SQL delete query
            Statement stmt = con.createStatement();

            // Executing the SQL DELETE query to remove the student record
            stmt.executeUpdate(query);

            stmt.close();
            con.close();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
