package JavaDatabaseConnectivity;

import java.sql.*;

/**
 * JavaResultSet demonstrates how to work with a scrollable and updatable ResultSet.
 * The program allows navigation through the records of the 'students' table 
 * and updates/deletes specific records using JDBC.
 */
public class JavaResultSet {
    public static void main(String[] args) {
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");

            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "<Username>", "<Password>");

            // Create a Statement object with options to create a scrollable and updatable ResultSet
            Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);

            // SQL query to select student details ordered by student_id
            String query = "SELECT student_id, first_name, age, gender, email FROM students ORDER BY student_id";

            // Execute the query and obtain a scrollable/updatable ResultSet
            ResultSet rs = stmt.executeQuery(query);

            // Move the cursor to the next record and print the data
            rs.next();
            System.out.println("Next Record: " + rs.getString("student_id") + "  " + rs.getString("first_name") + "  "
                    + rs.getString("age") + "\n");

            // Move the cursor to the last record and print the data
            rs.last();
            System.out.println("Last Record: " + rs.getString("student_id") + "  " + rs.getString("first_name") + "  "
                    + rs.getString("age") + "\n");

            // Move the cursor to the previous record from the last and print the data
            rs.previous();
            System.out.println("Previous Record: " + rs.getString("student_id") + "  " + rs.getString("first_name") + "  "
                    + rs.getString("age") + "\n");

            // Move the cursor to the first record and print the data
            rs.first();
            System.out.println("First Record: " + rs.getString("student_id") + "  " + rs.getString("first_name") + "  "
                    + rs.getString("age") + "\n");

            // Move the cursor to the 3rd record and print the data at that position
            rs.absolute(3);
            System.out.println("Record at Absolute Index-3: " + rs.getString("student_id") + "  "
                    + rs.getString("first_name") + "  " + rs.getString("age") + "\n");

            // If cursor is at the first row, update the first name and age, and commit the changes
            if (rs.first()) {
                System.out.println("Current Value: " + rs.getString("first_name"));

                // Update the first name and age of the current record (first row)
                rs.updateString(2, "Kavita");
                rs.updateInt(3, 11);  // Update age to 11

                // Commit the changes for the current row
                rs.updateRow();
                System.out.println("Updated Value: " + rs.getString("first_name"));
            }

            // Move the cursor to the last record and delete it from the table
            rs.last();
            rs.deleteRow();  // Delete the last row
            rs.updateRow();  // Commit the deletion

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
