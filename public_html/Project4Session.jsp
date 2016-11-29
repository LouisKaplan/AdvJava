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

            <p>Session Count: ${project4SessionCounter}</p>

        </div><!-- end #blogItem -->

    </div><!-- end #mainContent -->

    <div class="clearfloat"></div>

    <c:import url="template/footer_template.jsp" />

</div><!-- end #container -->

</body>
</html>
