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
    <title>嘿嘿嘿</title>
</head>
<body>
    Age is error
    <br/>
    <s:property value="#request.r1"/> | <%=request.getAttribute("r1") %> <br />
    <s:property value="#session.s1"/> | <%=session.getAttribute("s1") %> <br />
    <s:property value="#application.a1"/> | <%=application.getAttribute("a1") %> <br />
    []:<s:property value="[0]"/><br/>
    <s:debug></s:debug>

</body>
</html>
