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
        name = "JSTLLab1Servlet",
        urlPatterns = { "/JSTLServlet" }
)

public class JSTLLab1Servlet extends HttpServlet {


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

        List<String> decklist = new ArrayList<>();
        decklist.add("4 Glistener Elf");
        decklist.add("4 Might of Old Krosa");
        decklist.add("4 Blighted Agent");
        decklist.add("4 Noble Hierarch");
        decklist.add("4 Become Immense");

        request.setAttribute("myDecklist", decklist);

        String url = "/jstl-lab2.jsp";

        RequestDispatcher dispatcher
                = getServletContext().getRequestDispatcher(url);
        dispatcher.forward(request, response);
    }
}
