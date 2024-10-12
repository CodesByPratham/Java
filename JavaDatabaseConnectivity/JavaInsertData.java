package JavaDatabaseConnectivity;

import java.sql.*;
import java.util.Scanner;

public class JavaInsertData {

    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        try {
            System.out.print("Enter student's id: ");
            int id = in.nextInt();

            System.out.print("Enter student's first name: ");
            String fname = in.next();

            System.out.print("Enter student's last name: ");
            String lname = in.next();

            System.out.print("Enter student's age: ");
            int age = in.nextInt();

            System.out.print("Enter student's gender: ");
            String gender = in.next();

            System.out.print("Enter student's email: ");
            String email = in.next();

            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "<Username>", "<Password>");

            String query = "INSERT INTO students VALUES(" + id + ", '" + fname + "', '" + lname + "', " + age + ", '" + gender + "', '" + email + "')";
            Statement stmt = con.createStatement();

            stmt.executeQuery(query);
            con.close();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
