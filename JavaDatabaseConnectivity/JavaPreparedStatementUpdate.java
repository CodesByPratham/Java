package JavaDatabaseConnectivity;

import java.util.Scanner;
import java.sql.*;

public class JavaPreparedStatementUpdate {

    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "system", "Pratham");

            String query = "UPDATE students SET first_name = ?, last_name = ?, age = ?, gender = ?, email = ? WHERE student_id = ?";
            PreparedStatement pstmt = con.prepareStatement(query);

            System.out.print("Enter student's id that you wish to update: ");
            pstmt.setInt(6, in.nextInt());

            System.out.print("Enter student's first name: ");
            pstmt.setString(1, in.next());

            System.out.print("Enter student's last name: ");
            pstmt.setString(2, in.next());

            System.out.print("Enter student's age: ");
            pstmt.setInt(3, in.nextInt());

            System.out.print("Enter student's gender: ");
            pstmt.setString(4, in.next());

            System.out.print("Enter student's email: ");
            pstmt.setString(5, in.next());

            int rows = pstmt.executeUpdate();

            System.out.println(rows + " row updated");

            pstmt.close();
            con.close();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
