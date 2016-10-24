package java112.project2;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;


@WebServlet(
    name = "first112Servlet", 
    urlPatterns = { "/first", "/1st" }
)
/**
 * First112Servlet is a servlet java file that displays a page with some text,
 * an image, and a link to the home page.
 * @author Louis Kaplan
 * @version 0.1
 */
public class First112Servlet extends HttpServlet {

/**
 * Handles HTTP GET requests.<p>
 * This method prints a variety of HTML, which causes it to be displayed on the page.
 *@param  request                   the HttpServletRequest object
 *@param  response                   the HttpServletResponse object
 *@exception  ServletException  if there is a Servlet failure
 *@exception  IOException       if there is an IO failure
 */
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        // set the response type before sending data
        PrintWriter out = response.getWriter();
        out.print("<HTML>");
        out.print("<HEAD><TITLE>Java112 FirstServlet</TITLE></HEAD>");
        out.print("<BODY>");
        out.print("<h1>Louis Kaplan</h1>");
        out.print("<h2>Java112</h2>");
        out.print("<img src=\"images/Java_Locator.png\" alt=\"Java Location\">");
        out.print("<h2><a href = \"/java112\">Return Home</a></h2>");
        out.print("</BODY>");
        out.print("</HTML>");
        out.close();
        log("Reached end of First112Servlet");
    }
}