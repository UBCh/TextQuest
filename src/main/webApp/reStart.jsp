<%@ page import="com.example.textquest.entities.Content" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<!DOCTYPE html>
<html>
<head>
    <title>reStart</title>
    <link href="static/main.css" rel="stylesheet">
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <script src="<c:url value="static/jquery-3.6.0.min.js"/>"></script>
</head>
<button type="button" id="reStart_button" onclick="window.location=<%="'/reStart'"%>">return to the beginning</button>
</body>
<% Content.setLevel(1);%>
</html>