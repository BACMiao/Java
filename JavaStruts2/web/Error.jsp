<%--
  Created by IntelliJ IDEA.
  User: King
  Date: 2016/2/6
  Time: 16:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="/struts-tags" prefix="s"%>
<html>
<head>
    <title>哈哈哈</title>
</head>
<body>
    User is error
    <s:fielderror fieldName="name" />
    <br>
    <s:property value="'errors.name'"/>
    <s:property value="errors.name"/><!-- 取出debug中Value Stack Contents中errors的键--><br/>
    set设定adminName值（默认为request和ActionContext）:<s:set var="adminName" value="name"/>
    <br/>
    set从request中取值:<s:property value="#request.adminName"/><br/>
    set从ActionContext中取值:<s:property value="#adminName"/>
    <br/>
    使用scope指定范围：<s:set var="adminAge" value="age" scope="session"/><br/>
    从session中取值：<s:property value="#session.adminAge" />
    <s:debug></s:debug>
</body>
</html>
