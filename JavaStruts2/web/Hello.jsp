<%--
  Created by IntelliJ IDEA.
  User: King
  Date: 2016/2/5
  Time: 19:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="/struts-tags" prefix="s"%>
<html>
  <head>
    <title>啦啦啦啦</title>
  </head>
  <body>
  用户：<s:property value="name" />
  年龄：<s:property value="#parameters.age[0]"/>
  <s:set var="age" value="#parameters.age[0]"/>
  <s:if test="#age<0">wrong!</s:if>
  <s:elseif test="#parameters.age[0]<20">yes!</s:elseif>
  <s:else>no!</s:else>
  <s:debug></s:debug>
  <br/>
  <s:iterator value="{1,2,3,4,5}" begin="2" end="4" >
    <!-- current iteration value (2,3,4) -->
    <s:property/>
  </s:iterator>
  <s:iterator value="{'aaa','bbb','ccc'}" var="x">
    <s:property value="#x.toUpperCase()"/>
  </s:iterator>
  <br/>
  <s:iterator value="#{1:'a', 2:'b', 3:'c'}" >
    <s:property value="key"/> | <s:property value="value"/> <br />
  </s:iterator>

  </body>
</html>
