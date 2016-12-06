package java112.employee;
import java.io.*;
import java.util.*;
import java.lang.*;

/**
 * Created by student on 11/29/16.
 */
public class Search {

    public Search(){    }

    String searchType;
    String searchTerm;
    List<Employee> resultsDataQuery = new ArrayList();
    boolean anyEmployeesFound = false;

    public String getSearchType() {
        return searchType;
    }

    public void setSearchType(String searchType) {
        this.searchType = searchType;
    }

    public String getSearchTerm() {
        return searchTerm;
    }

    public void setSearchTerm(String searchTerm) {
        this.searchTerm = searchTerm;
    }

    public List<Employee> getResultsDataQuery() {
        return resultsDataQuery;
    }

    public void setResultsDataQuery(List<Employee> resultsDataQuery) {
        this.resultsDataQuery = resultsDataQuery;
    }

    public boolean isAnyEmployeesFound() {
        return anyEmployeesFound;
    }

    public void setAnyEmployeesFound(boolean anyEmployeesFound) {
        this.anyEmployeesFound = anyEmployeesFound;
    }

    public void addFoundEmployee(Employee employee) {
        resultsDataQuery.add(employee);
    }

}
