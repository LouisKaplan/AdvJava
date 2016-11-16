<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">

<head>

    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />

    <title>Louis Kaplan - Page Parser</title>
    <link href="style.css" rel="stylesheet" type="text/css" />

    <!--[if IE]>
    <style type="text/css">
        .twoColFixRtHdr #mainContent { zoom: 1; }
    </style>
    <![endif]-->

</head>

<body>

<div id="container">

    <div id="header">

        <h1><a href="#">Louis Kaplan - Page Parser</a></h1>

        <h2>Everything you never wanted to know about your file</h2>

    </div><!-- end #header -->

    <div id="topMenu">

        <ul>
            <li><a href="#">Home</a></li>
            <li>-</li>
            <li><a href="https://madisoncollege.edu/">Madison College</a></li>
            <li>-</li>
            <li><a href="http://paulawaite.com/education/java112/">Java112</a></li>
            <li>-</li>
            <li><a href="http://docs.oracle.com/javase/8/docs/api/">JavaAPI</a></li>
            <li>-</li>
            <li><a href="https://madjavaadvfall2016.slack.com/messages/general/">Slack</a></li>
        </ul>

    </div><!-- end #topMenu -->

    <div id="sidebar">


        <h3>Explore</h3>
        <ul>
            <li><a href="/java112/first">Name and Image</a></li>
            <li><a href="/java112/serveletTable">Info Table</a></li>
            <li><a href="myFirstJSP.jsp">MyFirst JSP</a></li>
            <li><a href="/java112/lab33">Using the EL</a></li>
            <li><a href="/java112/mvc-demo">MVC Demo</a></li>
            <li><a href="/java112/request-servlet">HTTP Request</a></li>
            <li><a href="/java112/project3-properties">Properties Servlet</a></li>
        </ul>

    </div><!-- end #sidebar -->

    <div id="mainContent">

        <div class="blogItem">

            <h2>Properties Table</h2>
            <table>

                <tr>
                    <td>Author:</td>
                    <td>${servletProperties.getProperty("author")}</td>
                </tr>
                <tr>
                    <td>Author Email Address:</td>
                    <td>${servletProperties.getProperty("author.email.address")}</td>
                </tr>
                <tr>
                    <td>Course Name:</td>
                    <td>${servletProperties.getProperty("course.name")}</td>
                </tr>
                <tr>
                    <td>Class Meeting Times:</td>
                    <td>${servletProperties.getProperty("class.meeting.times")}</td>
                </tr>
                <tr>
                    <td>Instructor Name</td>
                    <td>${servletProperties.getProperty("instructor.name")}</td>
                </tr>
                <tr>
                    <td>Project Description</td>
                    <td>${servletProperties.getProperty("project.description")}</td>
                </tr>
            </table>
            </br>




        </div><!-- end #blogItem -->

    </div><!-- end #mainContent -->

    <div class="clearfloat"></div>

    <div id="footer">

        <p>Copyright &copy; Louis Kaplan</p>

    </div><!-- end #footer -->

</div><!-- end #container -->

</body>
</html>
