<HTML>
    <HEAD>
     <TITLE>Java112 HTTP Request</TITLE>
    </HEAD>
    <BODY>
        The user agent is
        <%= request.getHeader("user-agent") %><br />
        Locale method:
        <%= request.getLocale() %><br />
        Context Path:
        <%= request.getContextPath() %><br />
        Local Name:
        <%= request.getLocalName() %><br />
        Scheme:
        <%= request.getScheme() %><br />
    </BODY>
</HTML>