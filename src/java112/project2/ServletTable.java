package java112.project2;

import java.io.*;
import java.util.*;
import java.lang.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(
    name = "ServletTable", 
    urlPatterns = { "/serveletTable" }
)
/**
 * ServletTable is a servlet java file that displays a table with 
 * some information from a properties file.
 * @author Louis Kaplan
 * @version 0.1
 */
public class ServletTable extends HttpServlet {

    Properties properties;

/**
 * init loads the properties file into the properties variable.<p>
 * This method prints a variety of HTML, which causes it to be displayed on the page.
 *@exception  ServletException  if there is a Servlet failure
 *@exception  IOException       if there is an IO failure
 */
    public void init() throws ServletException {
        properties = new Properties();
        try {
            properties.load(this.getClass().getResourceAsStream("/project2.properties"));
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
 * doGet creates a table and fills it with information from the properties file.<p>
 * This method prints a variety of HTML, which it uses to create a table, 
 * and then fills that table with information from the properties file.
 *@param  request                   the HttpServletRequest object
 *@param  response                   the HttpServletResponse object
 *@exception  ServletException  if there is a Servlet failure
 *@exception  IOException       if there is an IO failure
 */
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

                PrintWriter  out  = response.getWriter();
        out.print("<HTML>");
        out.print("<HEAD><TITLE>ServletTable</TITLE></HEAD>");
        out.print("<BODY>");
        out.print("<table style=\"width:100%\">");
        out.print("<tr>");
        out.print("<th>Course Name:</th>");
        out.print("<th>Author:</th>");
        out.print("<th>Email:</th>");
        out.print("<th>Meeting Time:</th>");
        out.print("<th>Instructor:</th>");
        out.print("<th>Project:</th>");
        out.print("</tr><tr>");
        out.print("<td>" + properties.getProperty("course.name") + "</td>");
        out.print("<td>" + properties.getProperty("author") + "</td>");
        out.print("<td>" + properties.getProperty("author.email.address") + "</td>");
        out.print("<td>" + properties.getProperty("class.meeting.times") + "</td>");
        out.print("<td>" + properties.getProperty("instructor.name") + "</td>");
        out.print("<td>" + properties.getProperty("project.description") + "</td>");
        out.print("</tr></table>");
        out.print("<h2><a href = \"/java112\">Return Home</a></h2>");
        out.print("</BODY>");
        out.print("</HTML>");
        out.close();
    }
}