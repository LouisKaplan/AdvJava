package java112.project3;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.lang.*;
import java.util.Properties;

/**
 * This servlet loads a properties file and makes the information
 * found within available to a corresponding JSP.
 * @author Louis Kaplan
 * @version 0.2
 */
@WebServlet(
        name = "project3PropertiesServlet",
        urlPatterns = { "/project3-properties" }
)

public class PropertiesServlet extends HttpServlet {

    private Properties servletProperties;

    /**
     * loadProperties opens the properties file and assigns it to a variable.<p>
     * This class loads the properties file, assigning it to the servletProperties variable.
     */
    private void loadProperties(){
        servletProperties = new Properties();
        try {
            servletProperties.load(this.getClass().getResourceAsStream("/project3.properties"));
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
     * init runs loadProperties the first time the servlet is initialized
     */
    public void init() throws ServletException {
        loadProperties();
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

        request.setAttribute("servletProperties", servletProperties);

        String url = "/projectProperties.jsp";

        RequestDispatcher dispatcher
                = getServletContext().getRequestDispatcher(url);
        dispatcher.forward(request, response);
    }
}