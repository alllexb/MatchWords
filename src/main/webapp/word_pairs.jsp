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
    <p>Here is the list of all words.</p>
</div>

<table cellpadding="0">
    <thead>
    <tr>
        <th>Id</th>
        <th>English Word</th>
        <th>Russian Translation</th>
        <th>Category</th>
    </tr>
    </thead>
    <tbody>
    <%! Integer counter = 0; %>
    <c:forEach items="${word_pairs}" var="word_pair">

        <% if (counter%2 == 0) {
            out.println("<tr class = \"even\">");
        } else {
            out.println("<tr>");
        }%>
        <td>${word_pair.id}</td>
        <td>${word_pair.firstWord}</td>
        <td>${word_pair.secondWord}</td>
        <td>${word_pair.category}</td>
        </tr>
        <% counter++; %>
    </c:forEach>
    </tbody>
</table>
</body>
</html>