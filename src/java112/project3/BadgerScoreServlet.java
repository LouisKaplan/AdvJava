package java112.project3;

import java.io.*;
import java.util.*;
import java.lang.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
/**
 * Created by Louis Kaplan on 11/12/16.
 */

@WebServlet(
        name = "badgerscoreservlet",
        urlPatterns = { "/badgerscore" }
)
public class BadgerScoreServlet extends HttpServlet{
    /**
     *  Handles HTTP GET requests.
     *
     *@param  request                   the HttpServletRequest object
     *@param  response                   the HttpServletResponse object
     *@exception  ServletException  if there is a Servlet failure
     *@exception  IOException       if there is an IO failure
     */
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

                BadgerScores currentBadgerScores = new BadgerScores();

                request.setAttribute("badgerScoreData", currentBadgerScores);

                String url = "/BadgerScores.jsp";

                RequestDispatcher dispatcher
                      = getServletContext().getRequestDispatcher(url);
                dispatcher.forward(request, response);
    }
}