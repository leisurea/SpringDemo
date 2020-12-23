<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script src="${pageContext.request.contextPath}/js/jquery-3.3.1.js"></script>
    <script>
        var userList = new Array();
        userList.push({username:"空虚公子", age:18});
        userList.push({username:"肾虚公子", age:28});

        $.ajax({
            type:"POST",
            url:"${pageContext.request.contextPath}/user/quick15",
            data:JSON.stringify(userList),
            contentType:"application/json;charset=utf-8",
            // method:"get",
            dataType:"json",
            success:function (data){
                alert(data+"success");
            },
            error:function (msg){
                alert(msg+"error");
            }
        });

    </script>
</head>
<body>

</body>
</html>
