package java112.project2;

import java.io.*;
import java.util.*;
import java.lang.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(
    name = "labFiveServlet", 
    urlPatterns = { "/labFive" }
)

public class LabFiveServlet extends HttpServlet {

    int hitCounter;
    Date firstDate;
    Date currentDate;
    String formattedFirstDate;
    String formattedCurrentDate;

    public void init() throws ServletException {
        log("Init has run");
        hitCounter = 0;
        firstDate = new Date();
        formattedFirstDate = firstDate.toString();
        
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        log("doGet has run");

        hitCounter++;
        
        currentDate = new Date();
        formattedCurrentDate = currentDate.toString();

        PrintWriter  out  = response.getWriter();
        out.print("<HTML>");
        out.print("<HEAD><TITLE>Lab Five Output</TITLE></HEAD>");
        out.print("<BODY>");
        out.print("<table style=\"width:100%\">");
        out.print("<tr>");
        out.print("<th>Hit Counter:</th>");
        out.print("<th>Current Date:</th>");
        out.print("<th>First Accessed:</th>");
        out.print("</tr><tr>");
        out.print("<td>" + hitCounter + "</td>");
        out.print("<td>" + formattedCurrentDate + "</td>");
        out.print("<td>" + formattedFirstDate + "</td>");
        out.print("</tr></table>");
        out.print("</BODY>");
        out.print("</HTML>");
        out.close();
    }

}