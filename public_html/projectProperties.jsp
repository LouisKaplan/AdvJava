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

<c:import url="template/footer_template.jsp" />

</div><!-- end #container -->

</body>
</html>
