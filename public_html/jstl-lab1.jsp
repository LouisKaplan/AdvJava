<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">

<c:set var="myFirstJstl" value="this is cool!" />
<html>
<head>
    <title>JSTL Demo</title>
</head>
<body>
<p>
    Wow, ${myFirstJstl}
</p>
</body>
</html>