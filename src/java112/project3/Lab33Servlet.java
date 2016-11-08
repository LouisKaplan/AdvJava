package java112.project3;

import java.io.*;
import java.util.*;
import java.lang.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
/**
 * Created by student on 11/7/16.
 */

@WebServlet(
        name = "Lab33Servlet",
        urlPatterns = { "/lab33" }
)
public class Lab33Servlet extends HttpServlet{

    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Map elMap = new HashMap();
        Date date = new Date();
        elMap.put("number", 4);
        elMap.put("text", "This is some sample text.");
        elMap.put("html", "<h2>This is an h2</h2>");
        elMap.put("aDate", date);
        request.setAttribute("myMap", elMap);
        String url = "/lab33.jsp";
        RequestDispatcher dispatcher =
                getServletContext().getRequestDispatcher(url);
        dispatcher.forward(request, response);

    }
}