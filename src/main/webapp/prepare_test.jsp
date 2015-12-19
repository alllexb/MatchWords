<%@ page contentType="text/html;charset=UTF-8" language="java" import="java.io.*,java.util.*"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html;charset=UTF-8">
    <link rel="stylesheet" href='<c:url value="/css/main.css"/>' />
    <title>Match Words</title>
</head>
<body>

<div id="top">
    <h1>Welcome to Magic Match Words!</h1>
    <p>Selecting test parameters</p>
</div>

<form action="/test/start" method="post">
    <label for="pair_number"> Выберите количество слов для тестирования:
        <%--<input type="text" id="pair_number" value="${pair_number}" name="pairNumber" />--%>
        <select id="pair_number" required size="1" name="pairNumber">
            <option>5</option>
            <option selected = "selected">10</option>
            <option>15</option>
            <option>20</option>
        </select>
    </label> <br />
    <label for="category"> Выберите категорию слов:
        <%--<input type="text" id="category" value="${category}" name="category" />--%>
        <select id="category" required size="1" name="category">
            <option selected = "selected">Room</option>
            <option>Music</option>
        </select>
    </label> <br />
    <div class="center">
        <input class="buttonStyle" type="submit" value="Начать тест" />
    </div>
</form>