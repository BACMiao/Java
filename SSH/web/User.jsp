<%--
  Created by IntelliJ IDEA.
  User: King
  Date: 2016/2/24
  Time: 21:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="s" uri="/struts-tags" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<html>
<head>
    <title>用户注册</title>
</head>
<body>
        <s:property value="u.username"/> <br>
<s:debug></s:debug>
</body>
</html>
