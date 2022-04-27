<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>List page</title>
</head>
<body>

<h1> List page 입니다 ~! </h1>
<h1> ${listDTO} </h1>


<script>

        const result = '${result}'
        console.log(result)

    if(result !== ''){
        alert("처리되었습니다")
    }

</script>

</body>
</html>
