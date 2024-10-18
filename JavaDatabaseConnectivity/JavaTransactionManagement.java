package JavaDatabaseConnectivity;

import java.util.Scanner;
import java.sql.*;

public class JavaTransactionManagement {

    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        try {
            Class.forName("oracle.jdbc.OracleDriver");
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "<Username>", "<Password>");

            con.setAutoCommit(false);

            Savepoint sp = con.setSavepoint("savePoint");
            String query = "INSERT INTO students VALUES(?, ?, ?, ?, ?, ?)";
            PreparedStatement pstmt = con.prepareStatement(query);

            while (true) {
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

                int rows = pstmt.executeUpdate();
                System.out.println(rows + " row inserted");
                
                System.out.println("Do you wish to add more rows(Y/N)?");
                if (in.next().equals("N")) {
                    break;
                }
            }
            
            System.out.println("Do you wish to commit the above transactions(Y/N): ");
            if (in.next().equals("N")) {
                con.rollback(sp);
                System.out.println("All transactions rollbacked successfully");
            } else {
                con.commit();
                System.out.println("All transactions commited successfully");
            }

            pstmt.close();
            con.close();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
