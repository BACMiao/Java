<%@ page import="java.sql.Connection" %>
<%@ page import="java.sql.DriverManager" %>
<%@ page import="java.sql.PreparedStatement" %>
<%@ page import="java.sql.ResultSet" %>
<%@ page import="com.ssh.registration.model.User" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
    String username = request.getParameter("username");
    String password = request.getParameter("password");
    String password2 = request.getParameter("password2");

    User u = new User();
    u.setUsername(username);
    u.setPassword(password);
    Class.forName("com.mysql.jdbc.Driver");
    Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/spring", "root", "root");

    UserManager um = new UserManagerImpl();
    boolean exist = um.exists(u);
    if(exist) {
        response.sendRedirect("registerFail.jsp");
        return;
    }

    um.add(u);
    response.sendRedirect("registerSuccess.jsp");
%>

