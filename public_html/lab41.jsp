<html xmlns="http://www.w3.org/1999/xhtml">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
        <title>Form Data Lab</title>
    </head>

    <body>
    <h1>Form Data Lab</h1>

        <form action="Lab41Servlet" method="GET">
            <h4>Enter your name:</h4>
            <input type="text" name="nameEntryField" /><br />
            <h4>Enter some text:</h4>
            <input type="text" name="someTextField" value="default value" /><br />
            <br />
            <input type="submit" name="" value="Enter" />
        </form>

        <p>${outputString}</p>
    </body>
</html>