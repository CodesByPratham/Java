package JavaDatabaseConnectivity;

import java.sql.*;

/* 
 * Procedure:-
 * CREATE OR REPLACE PROCEDURE highest_age(var_sfname OUT VARCHAR2, var_sage OUT NUMBER) AS
 * BEGIN
 * SELECT first_name, age INTO var_sfname, var_sage FROM students WHERE age = (SELECT MAX(age) FROM students);
 * END;
 */

public class JavaCallableStatementAge {
    public static void main(String[] args) {
        try {
            Class.forName("oracle.jdbc.OracleDriver");
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "<Username>", "<Password>");

            CallableStatement csmt = con.prepareCall("{call highest_age(?, ?)}");

            csmt.registerOutParameter(1, Types.VARCHAR);
            csmt.registerOutParameter(2, Types.NUMERIC);
            csmt.execute();

            System.out.println(csmt.getString(1) + " is the student with highest age as " + csmt.getInt(2));

            csmt.close();
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}