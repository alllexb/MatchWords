<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html;charset=UTF-8">
    <link rel="stylesheet" href='<c:url value="/css/main.css"/>'/>
    <link rel="stylesheet" href='<c:url value="/css/test.css"/>'/>
    <script type="text/javascript" src="<c:url value="/js/lib/jquery-1.11.3.js" />"></script>
    <script type="text/javascript" src="<c:url value="/js/test-initialization.js" />"></script>
    <title>Match Words</title>
</head>
<body>

<div id="top">
    <h1>Welcome to Magic Match Words!</h1>
    <p>Test</p>
</div>

<table>
    <tr>
        <td>
            <div id="words"></div>
        </td>
        <td>
            <div id="translations"></div>
        </td>
    </tr>
</table>
<script type="text/javascript">
    <c:forEach items="${word_pairs}" var="word_pair">
    wordPairs.addWord("${word_pair.firstWord}", "${word_pair.secondWord}");
    </c:forEach>
    mixedWordPairs.mixedFill(wordPairs);
    createWordTable("words", "words_table", "English words", mixedWordPairs, "first");
    createWordTable("translations", "translations_table", "Russian words", mixedWordPairs, "second");
</script>
<script type="text/javascript" src="<c:url value="/js/test-performance.js" />"></script>

<div id="modal_form">
    <span id="modal_close">X</span>
    <div id="massage">Test was not completed!</div>
</div>
<div id="overlay"></div>

<div class="center" ><p><a href="/test/" id="massage_window"><button class="buttonStyle">Finish test</button></a></p></div>

</body>