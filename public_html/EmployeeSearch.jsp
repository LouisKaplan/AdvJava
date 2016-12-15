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

            <h1>Employee Search</h1>

            <form action="employeeSearchResults" method="GET">
                <h4>Enter your search:</h4>
                <input type="text" name="variableEntryField" /><br />
                <h4>Type of search:</h4>
                <input type="radio" name="type" value="id" checked="checked"> ID<br>
                <input type="radio" name="type" value="lastName"> Last Name<br>
                <br />
                <input type="submit" name="" value="Enter" />
            </form>

        </div><!-- end #blogItem -->

    </div><!-- end #mainContent -->

    <div class="clearfloat"></div>

    <c:import url="template/footer_template.jsp" />

</div><!-- end #container -->

</body>
</html>
