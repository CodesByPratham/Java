package JavaDatabaseConnectivity;

import java.util.Scanner;
import java.sql.*;

public class JavaPreparedStatementDelete {

    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "system",
                    "Pratham");

            String query = "DELETE FROM students WHERE student_id = ?";
            PreparedStatement pstmt = con.prepareStatement(query);

            System.out.print("Enter student's id that you wish to delete: ");
            pstmt.setInt(1, in.nextInt());

            int rows = pstmt.executeUpdate();

            System.out.println(rows + " row deleted");

            pstmt.close();
            con.close();
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }
}
