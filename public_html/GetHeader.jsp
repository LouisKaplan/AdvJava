<html>
  <head>
    <title>GetHeader() Louis, Sue</title>
  </head>

  <body>
    <h2>getHeader()</h2>
    <h2>Description</h2>
        getHeader() allows you to see hidden information about the request to
        the webpage. <br />A lot of different information is available.<br />
    <h2>Syntax / Example:</h2>

    The user agent is &lt;%= request.getHeader("user-agent") %&gt;<br />
	Request method: 
	&lt;%= request.getMethod() %&gt;<br />
	Request URI: 
	&lt;%= request.getRequestURI() %&gt;<br />
	Request protocol: 
	&lt;%= request.getProtocol() %&gt;<br />
	Remote Host: 
	&lt;%= request.getRemoteHost() %&gt;<br />
	Remote Address: 
	&lt;%= request.getRemoteAddr() %&gt;<br /><br />

    This returns:<br /><br />

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
	<%= request.getRemoteAddr() %><br /><br />

    <h2>JSP Translator</h2>
        N/A<br />
    <h2>Best Practices</h2>
        Explain best practices for your technology<br />
        
    <h2>Drawbacks</h2>
        When shouldn't you use the technology?<br />
        What shouldn't it be used for?<br />
  </body>
</html>