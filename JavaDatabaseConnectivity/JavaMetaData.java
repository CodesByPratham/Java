package JavaDatabaseConnectivity;

import java.sql.*;

public class JavaMetaData {
    public static void main(String[] args) {
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "<Username>", "<Password>");

            Statement stmt = con.createStatement();
            String query = "SELECT * FROM Students";

            ResultSet rs = stmt.executeQuery(query);
            ResultSetMetaData rsmd = rs.getMetaData();

            System.out.println("Table ColumnCount: " + rsmd.getColumnCount());
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
