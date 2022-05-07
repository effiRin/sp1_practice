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

<h3>${listDTO.link}</h3>

<div class="searchDiv">
    <select class="type">
        <option value="">---</option>
        <option value="t" ${listDTO.type =="t"?"selected":""}>제목</option>
        <option value="tc" ${listDTO.type =="tc"?"selected":""}>제목 내용</option>
        <option value="tcw" ${listDTO.type =="tcw"?"selected":""}>제목 내용 작성자</option>
    </select>
    <input type="text" name="keyword" value="${listDTO.keyword}">
    <button class = "searchBtn">Search</button>
</div>

<ul>
    <c:forEach items = "${dtoList}" var="board">
        <li>
            <span> ${board.bno}</span>
            <span><a href='/board/read${listDTO.link}&bno=${board.bno}'> ${board.title} </a></span>
        </li>

    </c:forEach>
</ul>

${pageMaker}

<style>

    .pagination {
        display: flex;
    }
    .pagination .page-item {
        margin: 0.3em;
        list-style: none;
    }
</style>

<nav aria-label="Page navigation example">
    <ul class="pagination">
        <li class="page-item">
            <a class="page-link" href="#" aria-label="Previous">
                <span aria-hidden="true">&laquo;</span>
                <span class="sr-only">Previous</span>
            </a>
        </li>

        <c:forEach begin="${pageMaker.start}" end="${pageMaker.end}" var="num">
            <li class="page-item"><a class="page-link" href="${num}">${num}</a></li>
        </c:forEach>

        <li class="page-item">
            <a class="page-link" href="#" aria-label="Next">
                <span aria-hidden="true">&raquo;</span>
                <span class="sr-only">Next</span>
            </a>
        </li>
    </ul>
</nav>

<form class="actionForm" action="/board/list" method="get">
    <input type="hidden" name="page" value="${listDTO.page}">
    <input type="hidden" name="size" value="${listDTO.size}">
    <input type="hidden" name="type" value="${listDTO.type == null? '' : listDTO.type}">
    <input type="hidden" name="keyword" value="${listDTO.keyword == null? '' : listDTO.keyword}">
</form>

<script>
    const linkTags = document.querySelectorAll(".page-link")
    const actionForm = document.querySelector(".actionForm")

    console.log(linkTags)

    for (const tag of linkTags){
        tag.addEventListener("click", (e)=>{
            e.preventDefault()
            console.log(tag.getAttribute("href"))
            const pageNum = tag.getAttribute("href")

            actionForm.querySelector("input[name='page']").value = pageNum
            actionForm.submit()

        },false)
    }

    document.querySelector(".searchBtn").addEventListener("click", (e) =>  {
        const type = document.querySelector('.searchDiv .type').value
        const keyword = document.querySelector(".searchDiv input[name='keyword']").value

        console.log(type, keyword)

        actionForm.querySelector("input[name='page']").value = 1
        actionForm.querySelector("input[name='type']").value = type
        actionForm.querySelector("input[name='keyword']").value = keyword
        actionForm.submit()

    }, false)

</script>

</body>
</html>
