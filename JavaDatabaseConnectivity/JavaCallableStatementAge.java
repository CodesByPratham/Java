package JavaDatabaseConnectivity;

import java.sql.*;

/**
 * JavaCallableStatementAge demonstrates how to use a CallableStatement to
 * call a stored procedure from an Oracle database that retrieves the student 
 * with the highest age.
 * 
 * The stored procedure 'highest_age' returns the first name and age of the student
 * with the maximum age in the 'students' table.
 * 
 * Stored Procedure Syntax:
 * CREATE OR REPLACE PROCEDURE highest_age(var_sfname OUT VARCHAR2, var_sage OUT NUMBER) AS
 * BEGIN
 *     SELECT first_name, age 
 *     INTO var_sfname, var_sage 
 *     FROM students 
 *     WHERE age = (SELECT MAX(age) FROM students);
 * END;
 */
public class JavaCallableStatementAge {
    public static void main(String[] args) {
        try {
            Class.forName("oracle.jdbc.OracleDriver");

            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "<Username>", "<Password>");

            // Prepare a CallableStatement to call the stored procedure 'highest_age'
            CallableStatement csmt = con.prepareCall("{call highest_age(?, ?)}");

            // Register the OUT parameters to receive the first name and age from the stored procedure
            csmt.registerOutParameter(1, Types.VARCHAR); // First OUT parameter for the student's first name
            csmt.registerOutParameter(2, Types.NUMERIC); // Second OUT parameter for the student's age

            // Execute the stored procedure
            csmt.execute();

            // Retrieve and display the results from the OUT parameters
            System.out.println(csmt.getString(1) + " is the student with highest age as " + csmt.getInt(2));

            csmt.close();
            con.close();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
