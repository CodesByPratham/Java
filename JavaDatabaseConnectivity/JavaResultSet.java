package JavaDatabaseConnectivity;

import java.sql.*;

public class JavaResultSet {
    public static void main(String[] args) {
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "<Username>", "<Password>");

            Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
            String query = "SELECT student_id, first_name, age, gender, email FROM students ORDER BY student_id";

            ResultSet rs = stmt.executeQuery(query);

            System.out.println("\n");
            rs.next();

            System.out.println("Next Record: " + rs.getString("student_id") + "  " + rs.getString("first_name") + "  "
                    + rs.getString("age") + "\n");
            rs.last();

            System.out.println("Last Record: " + rs.getString("student_id") + "  " + rs.getString("first_name") + "  "
                    + rs.getString("age") + "\n");
            rs.previous();

            System.out
                    .println("Previous Record: " + rs.getString("student_id") + "  " + rs.getString("first_name") + "  "
                            + rs.getString("age") + "\n");
            rs.first();

            System.out.println("First Record: " + rs.getString("student_id") + "  " + rs.getString("first_name") + "  "
                    + rs.getString("age") + "\n");
            rs.absolute(3);
            System.out.println(
                    "Record at Absolute Index-3: " + rs.getString("student_id") + "  " + rs.getString("first_name")
                            + "  " + rs.getString("age") + "\n");

            if (rs.first()) {
                System.out.println("Current Value : " + rs.getString("first_name"));
                rs.updateString(2, "Kavita");
                rs.updateInt(3, 11);
                rs.updateRow();
                System.out.println("Updated Value : " + rs.getString("first_name"));
            }

            System.out.println("Last Record" + rs.last());

            rs.deleteRow();
            rs.updateRow();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
