<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>List page</title>
</head>
<body>

<h1> List page 입니다 ~! </h1>

<h2>${listDTO}</h2>

<hr>

${listDTO.link}


<ul>
    <c:forEach items = "${dtoList}" var="board">
        <li>
            <span> ${board.bno}</span>
            <span><a href='/board/read${listDTO.link}&bno=${board.bno}' ${board.title} </a></span>
        </li>

    </c:forEach>
</ul>


<script>

</script>

</body>
</html>
