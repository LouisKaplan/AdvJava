package java112.project4;

import java112.employee.EmployeeDirectory;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.lang.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

@WebServlet(
        name = "applicationStartup",
        urlPatterns = { "/project4-startup" },
        loadOnStartup = 1
        )

public class ApplicationStartup extends HttpServlet {

    public void init() throws ServletException {

        Properties properties = new Properties();
        try {
            properties.load(this.getClass().getResourceAsStream("/project4.properties"));
            getServletContext().setAttribute("project4Properties", properties);

            EmployeeDirectory employeeDirectory = new EmployeeDirectory(properties);
            getServletContext().setAttribute("employeeDirectory", employeeDirectory);
        }
        catch(IOException ioe) {
            System.out.println("Can't load the properties file");
            ioe.printStackTrace();
        }
        catch(Exception e) {
            System.out.println("Problem: " + e);
            e.printStackTrace();
        }
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



        String url = "/.jsp";

        RequestDispatcher dispatcher
                = getServletContext().getRequestDispatcher(url);
        dispatcher.forward(request, response);
    }
}