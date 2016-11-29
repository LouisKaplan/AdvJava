package java112.project4;

import java.io.*;
import java.sql.*;

/**
 *
 *@author     Eric Knapp
 *
 */
public class JDBCInsertEmployee {

    String first_name;
    String last_name;
    String ssn;
    String dept;
    String room;
    String phone;

    public void runSample() {

        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;

        try {
            Class.forName("com.mysql.jdbc.Driver");

            connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost/student", "student", "student");

            statement = connection.createStatement();

            String insertString = "INSERT INTO employees (first_name, last_name, ssn, dept, room, phone)" +
                    " VALUES " +
                    "('" + first_name +
                    "', '" + last_name +
                    "', '" + ssn +
                    "', '" + dept +
                    "', '" + room +
                    "', '" + phone +
                    "');";

            System.out.println("insertString: " + insertString);

            int numberOfRecords = statement.executeUpdate(insertString);

            System.out.println();


        } catch (ClassNotFoundException classNotFound) {
            System.err.println("Cannot find database driver ");
            classNotFound.printStackTrace();
        } catch (SQLException sqlException) {
            System.err.println("Error in connection.ecting to database "
                    + sqlException);
            sqlException.printStackTrace();
        } catch (Exception exception) {
            System.err.println("General Error");
            exception.printStackTrace();
        } finally {
            try {
                if (resultSet != null) {
                    resultSet.close();
                }

                if (statement != null) {
                    statement.close();
                }

                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException sqlException) {
                System.err.println("Error in connection.ecting to database "
                        + sqlException);
                sqlException.printStackTrace();
            } catch (Exception exception) {
                System.err.println("General Error");
                exception.printStackTrace();
            }
        }

    }

    /**
     * The main program for the JDBCSelectWhereExample class
     *
     * @param args The command line arguments
     */
    public static void main(String[] args) {

        JDBCInsertEmployee insertEmployees = new JDBCInsertEmployee();

        insertEmployees.first_name = args[0];
        insertEmployees.last_name = args[1];
        insertEmployees.ssn = args[2];
        insertEmployees.dept = args[3];
        insertEmployees.room = args[4];
        insertEmployees.phone = args[5];

        insertEmployees.runSample();
    }
}