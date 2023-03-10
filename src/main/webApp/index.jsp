
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<!DOCTYPE html>
<html>
<head>
    <title>TextQuest</title>
    <link href="main.css" rel="stylesheet">
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <script src="<c:url value="jquery-3.6.0.min.js"/>"></script>
</head>
<body>
<h1>    prologue</h1>
<p>My first paragraph.</p>

<form action="/level">
    <label for="lname">Last name:</label><br>
    <input type="text" id="lname" name="lname" value="Doe"><br><br>
    <input type="submit" value="forward to adventure">
</form>

</body>
</html>