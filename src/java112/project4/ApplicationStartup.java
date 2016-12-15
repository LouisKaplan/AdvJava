package java112.project4;

import java112.employee.EmployeeDirectory;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.lang.*;
import java.util.Properties;

@WebServlet(
        name = "applicationStartup",
        urlPatterns = { "/project4-startup" },
        loadOnStartup = 1
        )

public class ApplicationStartup extends HttpServlet {

    /**
     *  init loads a properties file, adds it to the servletContext,
     *  then creates an EmployeeDirectory, passes in the properties,
     *  and adds that to the servletContext as well.
     *
     *@exception  ServletException  if there is a Servlet failure
     */
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
}