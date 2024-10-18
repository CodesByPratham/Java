package JavaDatabaseConnectivity;

import java.sql.*;

public class JavaSimpleFetch {
    public static void main(String[] args) {
        try {
            // Loading and registering the Oracle JDBC driver
            Class.forName("oracle.jdbc.driver.OracleDriver");

            // Establishing a connection to the Oracle database
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "<Username>",
                    "<Password>");

            // SQL query to fetch all student records from the "students" table
            String query = "SELECT * FROM students";

            // Creating a Statement object to execute the SQL SELECT query
            Statement stmt = con.createStatement();

            // Executing the SQL SELECT query and storing the result in a ResultSet
            ResultSet rs = stmt.executeQuery(query);

            // Looping through the ResultSet and printing each student record
            while (rs.next()) {
                System.out.println(rs.getInt("student_id") + " | " + rs.getString("first_name") + " | "
                        + rs.getString("last_name") + " | " + rs.getInt("age") + " | " + rs.getString("gender") + " | "
                        + rs.getString("email"));
            }

            rs.close();
            stmt.close();
            con.close();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
