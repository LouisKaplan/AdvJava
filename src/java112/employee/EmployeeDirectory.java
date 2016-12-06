package java112.employee;
import java.io.*;
import java.util.*;
import java.lang.*;
import java.sql.*;

/**
 * Created by student on 11/29/16.
 */
public class EmployeeDirectory {
    Properties properties;
    Connection connection = null;
    Statement statement = null;
    ResultSet resultSet = null;

    public EmployeeDirectory(Properties properties) {
        this.properties = properties;
    }

    private Connection establishConnection() throws SQLException, Exception{
        connection = DriverManager.getConnection("jdbc:mysql://localhost/student", "student", "student");
        System.out.println("Connection made");
        statement = connection.createStatement();
        return connection;
    }


    private void addNewRecord(String firstName,
                              String lastName,
                              String socialSecurityNumber,
                              String department,
                              String roomNumber,
                              String phoneNumber) throws SQLException, Exception{

        establishConnection();
        String insertString = "INSERT INTO employees (first_name, last_name, ssn, dept, room, phone)" +
                " VALUES " +
                "('" + firstName +
                "', '" + lastName +
                "', '" + socialSecurityNumber +
                "', '" + department +
                "', '" + roomNumber +
                "', '" + phoneNumber +
                "');";

        System.out.println("insertString: " + insertString);

        int numberOfRecords = statement.executeUpdate(insertString);
    }

    private void searchRecordById(Search search)throws SQLException, Exception{
        establishConnection();


        String searchId = "Smith";
        String queryString = "SELECT emp_id, first_name, last_name"
                + " FROM employees " + "WHERE emp_id like '"
                + searchId + "%'";

        System.out.println("queryString: " + queryString);

        resultSet = statement.executeQuery(queryString);

        System.out.println();

        while (resultSet.next()) {
            String employeeId = resultSet.getString("emp_id");
            String firstName = resultSet.getString("first_name");
            String lastName = resultSet.getString("last_name");
            System.out.println(" Row: " + employeeId + " "
                    + firstName + " " + lastName);
        }

        System.out.println();

        ResultSetMetaData resultSetMetaData = resultSet.getMetaData();
        int columns = resultSetMetaData.getColumnCount();
        String nameOne = resultSetMetaData.getColumnName(1);
        String typeOne = resultSetMetaData.getColumnTypeName(1);
        String labelOne = resultSetMetaData.getColumnLabel(1);
        System.out.println(" Column count : " + columns);
        System.out.println(" Column 1 name : " + nameOne);
        System.out.println(" Column 1 type : " + typeOne);
        System.out.println(" Column 1 label name : " + labelOne);



    }
}