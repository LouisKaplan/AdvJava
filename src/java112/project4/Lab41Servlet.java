package java112.project4;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.lang.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

/**
 * This servlet loads a properties file and makes the information
 * found within available to a corresponding JSP.
 * @author Louis Kaplan
 * @version 0.2
 */
@WebServlet(
        name = "Lab41Servlet",
        urlPatterns = { "/Lab41Servlet" }
)

public class Lab41Servlet extends HttpServlet {


    public void init() throws ServletException {
    }

    /**
     *  doGet uses the setAttribute method to make the properties file available to the JSP.
     *
     *@param  request                   the HttpServletRequest object
     *@param  response                   the HttpServletResponse object
     *@exception  ServletException  if there is a Servlet failure
     *@exception  IOException       if there is an IO failure
     */
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String userName = request.getParameter("nameEntryField");
        String userText = request.getParameter("someTextField");

        String fullString = "Hello " + userName + ", here is your text: " + userText;

        request.setAttribute("outputString", fullString);

        String url = "/lab41.jsp";

        RequestDispatcher dispatcher
                = getServletContext().getRequestDispatcher(url);
        dispatcher.forward(request, response);
    }
}
