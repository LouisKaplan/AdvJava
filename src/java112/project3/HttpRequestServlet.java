package java112.project3;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.lang.*;

/**
 * This servlet loads an httpRequest bean and populates its variables with
 * information from the request.get*x* methods, which are then made available
 * to the JSP.
 * @author Louis Kaplan
 * @version 0.2
 */
@WebServlet(
        name = "requestServlet",
        urlPatterns = { "/request-servlet" }
)

public class HttpRequestServlet extends HttpServlet {

    /**
     *  doGet uses get methods of request to populate variables in the bean,
     *  which are then made available to the JSP.
     *
     *@param  request                   the HttpServletRequest object
     *@param  response                   the HttpServletResponse object
     *@exception  ServletException  if there is a Servlet failure
     *@exception  IOException       if there is an IO failure
     */
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        HttpRequestData httpRequest = new HttpRequestData();

        httpRequest.setRemoteComputer(request.getRemoteHost());
        httpRequest.setRemoteAddress(request.getRemoteAddr());
        httpRequest.setHttpMethod(request.getMethod());
        httpRequest.setRequestUri(request.getRequestURI());
        httpRequest.setRequestUrl(request.getRequestURL().toString());
        httpRequest.setRequestProtocol(request.getProtocol());
        httpRequest.setServerName(request.getLocalName());
        httpRequest.setServerPort(Integer.toString(request.getLocalPort()));
        httpRequest.setCurrentLocale(request.getLocale().toString());
        httpRequest.setQueryString(request.getQueryString());
        httpRequest.setQueryParameter(request.getParameter("queryParameter"));
        httpRequest.setUserAgent(request.getHeader("user-agent"));

        request.setAttribute("httpRequest", httpRequest);

        String url = "/httpRequest.jsp";

        RequestDispatcher dispatcher
                = getServletContext().getRequestDispatcher(url);
        dispatcher.forward(request, response);
    }

}

/*
    Assign all properties of the HttpRequestData object with information from the request object.
    Add the HttpRequestData instance to the request instance as an attribute.
    Forward to the HTTP Request Data JSP page specified below.
    Add a link to this servlet to the index.jsp page. There will only be a link to the servlet NOT to the JSP page.
 */