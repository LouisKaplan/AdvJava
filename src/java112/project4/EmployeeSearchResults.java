package java112.project4;

import java112.employee.EmployeeDirectory;
import java112.employee.Search;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.lang.*;

/**
 * This servlet is the main controller class for the process of searching for an employee.
 * @author Louis Kaplan
 * @version 1.0
 */

@WebServlet(
        name = "employeeSearchResults",
        urlPatterns = { "/employeeSearchResults" }
)

public class EmployeeSearchResults extends HttpServlet {


    /**
     *  doGet uses the information from the JSP submission form to query a SQL database.
     *  It calls on the session and servletContext, then assigns values from the JSP form to variables.
     *  It creates a new search object and passes in the values from that form.
     *  Then it calls on a method in EmployeeDirectory that corresponds with the search criteria.
     *  Once that is complete, it forwards back to the employeeSearchDisplay servlet.
     *
     *
     *@param  request                   the HttpServletRequest object
     *@param  response                   the HttpServletResponse object
     *@exception  ServletException  if there is a Servlet failure
     *@exception  IOException       if there is an IO failure
     */
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        HttpSession session = request.getSession();

        ServletContext context = getServletContext();
        EmployeeDirectory employeeDirectory = (EmployeeDirectory) context.getAttribute("employeeDirectory");

        String userText = request.getParameter("variableEntryField");
        String userDataType = request.getParameter("type");

        Search newSearch = new Search();
        newSearch.setSearchType(userDataType);
        newSearch.setSearchTerm(userText);

        if(userDataType.equals("id")){
            employeeDirectory.searchRecordById(newSearch);
        } else {
            employeeDirectory.searchRecordByLastName(newSearch);
        }

        if (!newSearch.isAnyEmployeesFound()){
            session.setAttribute("IsEmployeeFound", "No employee found");
        } else {
            session.setAttribute("IsEmployeeFound", "Found the following employees:");
        }

        session.setAttribute("EnteredSearch", newSearch);

        String url = "/SearchResults.jsp";

        RequestDispatcher dispatcher
                = getServletContext().getRequestDispatcher(url);
        dispatcher.forward(request, response);
    }
}
