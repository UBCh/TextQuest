
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<!DOCTYPE html>
<html>
<head>
    <title>reStart</title>
    <link href="main.css" rel="stylesheet">
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <script src="<c:url value="jquery-3.6.0.min.js"/>"></script>
</head>
<section>
    <nav>
        <ul>
             <li><button type="button" onclick="window.location=<%="'/reStart'"%>">return to the beginning</button></li>
        </ul>
    </nav>
</section>
</body>

</html>