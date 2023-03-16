
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
<p>Ты — искатель приключений. Ты дстигаешь своей цели после долгого пути, пройдя через леса и горы, и руины старых городов, в поисках сокровищ. Теперь ты стоишь перед огромной пирамидой. Вход ؅— прямоугольная дыра в стене — прямо перед тобой. Вокруг безлюдная пустыня. Сфинкс позади нависает над тобой, его тень от солнца закрывает. Ты идёшь вперёд, ноги увязают в песке, горячий ветер треплет одежду. Ты у входа, тьма впереди закрывает взор. .</p>
<br>
<br>
<br>
<br>
<hr>
<form action="${pageContext.request.contextPath}/init" method="POST">
<label for="lname" >what will you be called, my young friend?:</label><br>
    <input type="text" id="lname" name="lname" value="Write your name here"><br><br>
    <input type="submit"  id="submit" value="forward to adventure">
</form>

</body>
</html>