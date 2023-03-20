
<%@ page contentType="text/html;charset=UTF-8"  %>

<!DOCTYPE html>
<html>
<head>
    <title>TextQuest</title>
    <link href="static/main.css" rel="stylesheet">
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <script src="<c:url value="static/jquery-3.6.0.min.js"/>"></script>
</head>
<body>
<div class="container">
    <img src='${pageContext.request.contextPath}/img/images.jpg' alt="pyramid">
    <section style="position:absolute; top: 1%; text-align: center; ">
        <h1 style="text-align:center;">ВЕЛИКАЯ ПИРАМИДА САГИ</h1>
        <p style="color: red">СТОЙ ИСКАТЕЛЬ ПРИКЛЮЧЕНИЙ!!!!</p>
        <p>Ты достиг своей цели после долгого пути, пройдя через леса и горы, и руины старых городов, в поисках
            сокровищ. Теперь ты стоишь перед огромной пирамидой. Вход — прямоугольная дыра в стене — прямо перед тобой.
            Вокруг безлюдная пустыня. Сфинкс позади нависает над тобой, его тень от солнца закрывает. Ты идёшь вперёд,
            ноги увязают в песке, горячий ветер треплет одежду. Ты у входа, тьма впереди закрывает взор...</p>
              <hr>
        <form action="${pageContext.request.contextPath}/init" method="POST" id="action">
            <label for="lname">как зовут тебя, мой юный друг?:</label><br>
            <input type="text" id="lname" name="lname" value="Индиана Джонс"><br><br>
            <input type="submit" id="submit" value="вперед, навстречу приключениям->">
        </form>
    </section>
</div>

</body>
</html>