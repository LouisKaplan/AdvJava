<%@ page import="java.util.Random"%>

<html>

<head>
	<title>Java Code Geeks Snippets - Get Request Header in JSP Page</title>
</head>

<body>


	The user agent is <%= request.getHeader("user-agent") %><br />
	Request method: 
	<%= request.getMethod() %><br />
	Request URI: 
	<%= request.getRequestURI() %><br />
	Request protocol: 
	<%= request.getProtocol() %><br />
	Remote Host: 
	<%= request.getRemoteHost() %><br />
	Remote Address: 
	<%= request.getRemoteAddr() %><br />
	
</body>
