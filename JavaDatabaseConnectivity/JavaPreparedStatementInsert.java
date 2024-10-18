package JavaDatabaseConnectivity;

import java.util.Scanner;
import java.sql.*;

public class JavaPreparedStatementInsert {

    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        try {
            // Loading and registering the Oracle JDBC driver
            Class.forName("oracle.jdbc.driver.OracleDriver");

            // Establishing a connection to the Oracle database
            Connection con = DriverManager.getConnection(
                    "jdbc:oracle:thin:@localhost:1521:XE", "<Username>", "<Password>");

            // SQL query with placeholders (using '?' for dynamic input values)
            String query = "INSERT INTO students VALUES(?, ?, ?, ?, ?, ?)";

            // Creating a PreparedStatement to execute the SQL query
            PreparedStatement pstmt = con.prepareStatement(query);

            // Binding values to the placeholders in the query (from user input)
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

            // Executing the SQL INSERT query
            int rows = pstmt.executeUpdate();

            // Outputting the number of rows inserted
            System.out.println(rows + " row inserted");

            pstmt.close();
            con.close();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
