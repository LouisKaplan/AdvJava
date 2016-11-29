package java112.project4;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.lang.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

@WebServlet(
        name = "SessionLab",
        urlPatterns = { "/SessionLab" }
)

public class Project4SessionLab extends HttpServlet {


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

        HttpSession session = request.getSession();
        Integer sessionCounter = (Integer) session.getAttribute("project4SessionCounter");

        if(sessionCounter == null){
            sessionCounter = 1;
        } else {
            sessionCounter++;
        }

        session.setAttribute("project4SessionCounter", sessionCounter);

        String url = "/Project4Session.jsp";

        RequestDispatcher dispatcher
                = getServletContext().getRequestDispatcher(url);
        dispatcher.forward(request, response);
    }
}
