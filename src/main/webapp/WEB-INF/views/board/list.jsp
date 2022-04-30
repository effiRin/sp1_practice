<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>List page</title>
</head>
<body>

<h1> List page 입니다 ~! </h1>

<ul>
    <c:forEach items = "${dtoList}" var="board">
        <li>
            <span> ${board.bno}</span>
            <span> ${board.title}</span>
        </li>

    </c:forEach>
</ul>

${pageMaker}

<hr>

${listDTO}

<script>

</script>

</body>
</html>
