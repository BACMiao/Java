<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<html>
<head>
    <title>用户注册</title>
</head>
<body>
    <form method="post" action="user.action">
        用户名：<input type="text" name="username"><br>
        密码：<input type="password" name="password"><br>
        确认密码：<input type="password" name="password2"><br>
        <input type="submit" value="提交">
    </form>

</body>
</html>
