package java112.employee;
import java.util.*;
import java.lang.*;
import java.sql.*;

/**
 * This servlet is the main work class for the application.
 * It does the work of accessing the database, and moves information between
 * the database and the user interfaces
 * @author Louis Kaplan
 * @version 1.0
 */
public class EmployeeDirectory {
    Properties properties;
    Connection connection = null;
    Statement statement = null;
    ResultSet resultSet = null;

    public EmployeeDirectory(Properties properties) {
        this.properties = properties;
    }

    /**
     * establishCOnnection creates a connection to the database and logs in.
     */
    private Connection establishConnection() throws SQLException, Exception{

        Class.forName(properties.getProperty("driver"));

        connection = DriverManager.getConnection(properties.getProperty("url"),
                                                 properties.getProperty("username"),
                                                 properties.getProperty("password"));
        System.out.println("Connection made");
        statement = connection.createStatement();
        return connection;
    }

    /**
     * addNewRecord opens a database connection, then uses that interface to insert a
     * new employee record into the database
     * @param firstName is the employee's first name as entered by user
     * @param lastName is the employee's last name as entered by user
     * @param socialSecurityNumber is the social security number as entered by user
     * @param department is the employee's department as entered by user
     * @param roomNumber is the employee's room number as entered by user
     * @param phoneNumber is the employee's phone number as entered by user
     */
    public void addNewRecord(String firstName,
                              String lastName,
                              String socialSecurityNumber,
                              String department,
                              String roomNumber,
                              String phoneNumber){
        try {
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

        } catch (ClassNotFoundException classNotFound) {
            System.err.println("Cannot find database driver ");
            classNotFound.printStackTrace();
        } catch (SQLException sqlException) {
            System.err.println("Error in connecting to database "
                    + sqlException);
            sqlException.printStackTrace();
        } catch (Exception exception) {
            System.err.println("General Error");
            exception.printStackTrace();
        } finally {
            closeEverything();
        }
    }


    /**
     * searchRecordById opens a connection to the database, then queries that database based on
     * information entered by the user. If a match is found, a new employee object is created,
     * and its information is filled out and added to the search.
     * @param userSearch is the current search object as referenced by the EmployeeSearch JSP
     */
    public void searchRecordById(Search userSearch){

        try {
            establishConnection();
            String searchTerm = userSearch.getSearchTerm();
            String queryString = "SELECT emp_id, first_name, last_name, ssn, dept, room, phone"
                    + " FROM employees " + "WHERE emp_id like '"
                    + searchTerm + "%'";

            System.out.println("queryString: " + queryString);

            resultSet = statement.executeQuery(queryString);

            checkForRecordAndUpdate(userSearch);

        }catch (ClassNotFoundException classNotFound) {
            System.err.println("Cannot find database driver ");
            classNotFound.printStackTrace();
        } catch (SQLException sqlException) {
            System.err.println("Error in connecting to database "
                    + sqlException);
            sqlException.printStackTrace();
        } catch (Exception exception) {
            System.err.println("General Error");
            exception.printStackTrace();
        } finally {
            closeEverything();
        }
    }


    /**
     * searchRecordByLastName opens a connection to the database, then queries that database based on
     * information entered by the user. If a match is found, a new employee object is created,
     * and its information is filled out and added to the search.
     * @param userSearch is the current search object as referenced by the EmployeeSearch JSP
     */
    public void searchRecordByLastName(Search userSearch){

        try {
            establishConnection();
            String searchTerm = userSearch.getSearchTerm();
            String queryString = "SELECT emp_id, first_name, last_name, ssn, dept, room, phone"
                    + " FROM employees " + "WHERE last_name like '"
                    + searchTerm + "%'";

            System.out.println("queryString: " + queryString);

            resultSet = statement.executeQuery(queryString);

            checkForRecordAndUpdate(userSearch);

        }catch (ClassNotFoundException classNotFound) {
            System.err.println("Cannot find database driver ");
            classNotFound.printStackTrace();
        } catch (SQLException sqlException) {
            System.err.println("Error in connecting to database "
                    + sqlException);
            sqlException.printStackTrace();
        } catch (Exception exception) {
            System.err.println("General Error");
            exception.printStackTrace();
        } finally {
            closeEverything();
        }
    }

    /**
     * checkForRecordAndUpdate determines if any results were found when searching the database.
     * If matches are found, it calls the createNewEmployeeRecord method
     * @param userSearch is the current search object as referenced by the EmployeeSearch JSP
     */
    public void checkForRecordAndUpdate(Search userSearch) throws SQLException, Exception {
        if (!resultSet.next()) {
            userSearch.setAnyEmployeesFound(false);
        } else {
            userSearch.setAnyEmployeesFound(true);
            while (resultSet.next()) {
                createNewEmployeeRecord(userSearch);
            }
        }
    }


    /**
     * createNewEmployeeRecord makes a new employee object, updates it with user-entered information,
     * then adds it to the search object
     * @param userSearch is the current search object as referenced by the EmployeeSearch JSP
     */
    public void createNewEmployeeRecord(Search userSearch) throws SQLException, Exception {
        Employee searchEmployee = new Employee();
        searchEmployee.setEmployeeId(resultSet.getString("emp_id"));
        searchEmployee.setFirstName(resultSet.getString("first_name"));
        searchEmployee.setLastName(resultSet.getString("last_name"));
        searchEmployee.setSocialSecurityNumber(resultSet.getString("ssn"));
        searchEmployee.setDepartment(resultSet.getString("dept"));
        searchEmployee.setRoomNumber(resultSet.getString("room"));
        searchEmployee.setPhoneNumber(resultSet.getString("phone"));
        userSearch.addFoundEmployee(searchEmployee);
    }


    /**
     * closeEverything shuts down the resultSet, statement, and connection once they're no longer needed.
     */
    public void closeEverything(){
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
            System.err.println("Error in connecting to database "
                    + sqlException);
            sqlException.printStackTrace();
        } catch (Exception exception) {
            System.err.println("General Error");
            exception.printStackTrace();
        }
    }
}