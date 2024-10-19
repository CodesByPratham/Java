package JavaDatabaseConnectivity;

import java.sql.*;

/**
 * JavaMetaData demonstrates how to retrieve and display metadata information
 * from a table in an Oracle database using ResultSetMetaData.
 * 
 * The program connects to the database, executes a query on the 'students'
 * table,
 * and displays the number of columns, their names, and their data types.
 */
public class JavaMetaData {
    public static void main(String[] args) {
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "<Username>",
                    "<Password>");

            // Create a Statement object to execute SQL queries
            Statement stmt = con.createStatement();

            // SQL query to select all records from the 'students' table
            String query = "SELECT * FROM Students";

            // Execute the query and obtain the result set
            ResultSet rs = stmt.executeQuery(query);

            // Retrieve metadata about the result set
            ResultSetMetaData rsmd = rs.getMetaData();

            // Display the total number of columns in the 'students' table
            System.out.println("Table ColumnCount: " + rsmd.getColumnCount());

            // Loop through each column and display its name and data type
            for (int i = 1; i <= rsmd.getColumnCount(); i++) {
                System.out.println(
                        "ColumnName: " + rsmd.getColumnName(i) + " " + "ColumnType: " + rsmd.getColumnTypeName(i));
            }

            rs.close();
            stmt.close();
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
