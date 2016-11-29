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

                <h2>Java 112: Project 2</h2>
                <h3>Oct 16, 2016</h3>


                <h3>The concepts we will be exploring with this project include:</h3>
                <ul>
                    <li>Extending a working Java application</li>
                    <li>The Java Collection Framework</li>
                    <li>Running a servlet engine</li>
                    <li>Coding a servlet</li>
                    <li>Accessing a servlet from an html page</li>
                    <li>The Properties class</li>
                    <li>Loading and using a properties file</li>
                </ul>
                </br>

                <h3>Readings</h3>
                <ul>
                    <li>From Core Servlets and JavaServer Pages by Marty Hall</li>
                    <li>Chapter 1: An Overview of Servlet and JSP Technology</li>
                    <li>Chapter 3: Servlet Basics</li>
                    <li>The official Servlets tutorial from Sun</li>
                </ul>
                </br>

                <h3>Project Overview</h3>
                <p>This project will extend project 1 with more file analyzers and a project properties file.
                    This project will also be an introduction to Servlets and server-side java web programming.
                    You will be starting to create a web application.</p>

            </div><!-- end #blogItem -->

        </div><!-- end #mainContent -->

        <div class="clearfloat"></div>

        <c:import url="template/footer_template.jsp" />

    </div><!-- end #container -->

</body>
</html>
