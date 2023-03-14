
<%@ page import="com.example.textquest.Content" %>
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
<hr>
<h1 id="idSession"> ID session : <%=Content.getIdSession()%></h1>
<h2 id="player_name"> Player name : <%=Content.getName()%></h2>
<h2 id="current game"> Current game: <%=Content.getCurrent()%></h2>

</body>
<hr>



</html>