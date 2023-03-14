
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<!DOCTYPE html>
<html>
<head>
    <title>TextQuest</title>
    <link href="static/main.css" rel="stylesheet">
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <script src="<c:url value="static/jquery-3.6.0.min.js"/>"></script>
</head>
<body>
<h1 style="text-align:center;">prologue</h1>
<p>My first paragraph.</p>
<br>
<br>
<br>
<br>
<hr>
<form action="${pageContext.request.contextPath}/init" method="POST">
<%--    <label for="lname">what will you be called, my young friend?:</label><br>--%>
    <input type="text" id="lname" name="lname" value="what will you be called, my young friend? Write your name here"><br><br>
    <input type="submit"  id="submit" value="forward to adventure">
</form>

</body>
</html>