<%--
  Created by IntelliJ IDEA.
  User: King
  Date: 2016/2/6
  Time: 14:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page pageEncoding="UTF-8" %>
<html>
<head>
    <title>hhhhh</title>
</head>
<body>
    使用action属性接收参数，测试中文问题
    <form action="hello!add" method="post">
        姓名：<input type="text" name="name"> </input>
        年龄：<input type="text" name="age"> </input>
        <input type="submit" value="submit"/>
    </form>
    取得Map类型request,session,application,使用IoC方法
    <form action="login" method="post">
        年龄：<input type="text" name="age"> </input>
        <input type="submit" value="submit"/>
    </form>
    <br/>
<br/>
    动态结果
    一定不要忘了为动态结果的保存值设置set get方法
    <ol>
        <li><a href="user/user?type=1">返回success</a></li>
        <li><a href="user/user?type=2">返回error</a></li>
    </ol>

</body>
</html>
