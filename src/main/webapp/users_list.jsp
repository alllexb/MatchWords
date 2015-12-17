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
    <p>Here is the list of all our friends.</p>
</div>

<table cellpadding="0">
    <thead>
    <tr>
        <th>Id</th>
        <th>Nick Name</th>
        <th>First Name</th>
        <th>Last Name</th>
        <th>E-mail</th>
        <th>Registration date</th>
    </tr>
    </thead>
    <tbody>
    <%! Integer counter = 0; %>
    <c:forEach items="${users_list}" var="user">

        <% if (counter%2 == 0) {
            out.println("<tr class = \"even\">");
        } else {
            out.println("<tr>");
        }%>
            <td>${user.id}</td>
            <td class="left">${user.nickName}</td>
            <td class="left">${user.name}</td>
            <td class="left">${user.lastName}</td>
            <td class="left">${user.email}</td>
            <td>${user.registrationDate}</td>
        </tr>
        <% counter++; %>
    </c:forEach>
    </tbody>
</table>
</body>
</html>
