<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<c:import url="template/head_template.jsp" />

<body>

<div id="container">

    <c:import url="template/header_template.jsp" />

    <c:import url="template/topmenu_template.jsp" />

    <c:import url="template/sidebar_template.jsp" />

    <div id="mainContent">

        <div class="blogItem">

            <h2>Header Responses</h2>
            <ul>
                <li><b>The remote computer making the request:</b></li>
                <li>${httpRequest.remoteComputer}</li>
                <li><b>The address of the remote computer making the request:</b></li>
                <li>${httpRequest.remoteAddress}</li>
                <li><b>The HTTP method of the request:</b></li>
                <li>${httpRequest.httpMethod}</li>
                <li><b>The request URI:</b></li>
                <li>${httpRequest.requestURI}</li>
                <li><b>The request URL:</b></li>
                <li>${httpRequest.requestURL}</li>
                <li><b>The protocol of the request:</b></li>
                <li>${httpRequest.requestProtocol}</li>
                <li><b>The server name:</b></li>
                <li>${httpRequest.serverName}</li>
                <li><b>The server port number:</b></li>
                <li>${httpRequest.serverPort}</li>
                <li><b>The current Locale of the server:</b></li>
                <li>${httpRequest.currentLocale}</li>
                <li><b>The query string:</b></li>
                <li>${httpRequest.queryString}</li>
                <li><b>The value of a query parameter with the name of "queryParameter":</b></li>
                <li>${httpRequest.queryParameter}</li>
                <li><b>The value of the request header with the name of "User-Agent":</b></li>
                <li>${httpRequest.userAgent}</li>
            </ul>
            </br>




        </div><!-- end #blogItem -->

    </div><!-- end #mainContent -->

    <div class="clearfloat"></div>

    <c:import url="template/footer_template.jsp" />

</div><!-- end #container -->

</body>
</html>
