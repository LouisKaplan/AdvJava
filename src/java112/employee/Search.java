package java112.employee;
import java.util.*;
import java.lang.*;

/**
 * This bean contains a series of variables.
 * The page will have instance variables for the following HTTP Request Parameters:
 * searchType
 * searchTerm
 * resultsDataQuery
 * anyEmployeesFound
 * @author Louis Kaplan
 * @version 1.0
 */
public class Search {

    /**
     * This is a constructor class
     */
    public Search(){    }

    private String searchType;
    private String searchTerm;
    private List<Employee> resultsDataQuery = new ArrayList();
    private boolean anyEmployeesFound;

    /**
     * getSearchType returns the value of the String searchType,
     * which is passed in through the EmployeeSearch JSP
     * @return searchType is the value of the String searchType.
     */
    public String getSearchType() {
        return searchType;
    }

    /**
     * setSearchType sets the value of the String searchType.
     * @param searchType is the value of the String searchType.
     */
    public void setSearchType(String searchType) {
        this.searchType = searchType;
    }

    /**
     * getSearchTerm returns the value of the String searchTerm,
     * which is passed in through the EmployeeSearch JSP
     * @return searchTerm is the value of the String searchTerm.
     */
    public String getSearchTerm() {
        return searchTerm;
    }

    /**
     * setSearchTerm sets the value of the String searchTerm.
     * @param searchTerm is the value of the String searchTerm.
     */
    public void setSearchTerm(String searchTerm) {
        this.searchTerm = searchTerm;
    }

    /**
     * getResultsDataQuery returns the value of the ArrayList resultsDataQuery,
     * which is populated with employee objects
     * @return resultsDataQuery is the value of the ArrayList resultsDataQuery.
     */
    public List<Employee> getResultsDataQuery() {
        return resultsDataQuery;
    }

    /**
     * setResultsDataQuery sets the value of the ArrayList resultsDataQuery.
     * @param resultsDataQuery is the value of the ArrayList resultsDataQuery.
     */
    public void setResultsDataQuery(List<Employee> resultsDataQuery) {
        this.resultsDataQuery = resultsDataQuery;
    }

    /**
     * isAnyEmployeesFound returns the value of the boolean anyEmployeesFound,
     * which is set after querying the database and checking for results
     * @return anyEmployeesFound is the value of the boolean anyEmployeesFound.
     */
    public boolean isAnyEmployeesFound() {
        return anyEmployeesFound;
    }

    /**
     * setAnyEmployeesFound sets the value of the boolean anyEmployeesFound.
     * @param anyEmployeesFound is the value of the boolean anyEmployeesFound.
     */
    public void setAnyEmployeesFound(boolean anyEmployeesFound) {
        this.anyEmployeesFound = anyEmployeesFound;
    }

    /**
     * addFoundEmployee adds an employee object to resultsDataQuery.
     * @param employee is the Employee object to be added.
     */
    public void addFoundEmployee(Employee employee) {
        resultsDataQuery.add(employee);
    }
}