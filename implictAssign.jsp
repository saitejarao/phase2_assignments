<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>



<strong>Config example - servlet name: </strong><%= config.getServletName()%><br><br>
<strong>Config example - servlet name: </strong><%= config.getServletContext()%><br><br>

<%-- session object --%>
<strong>Session example - creation time: </strong><%=session.getCreationTime()%><br><br>
<strong>Session example - LastAccessedTime: </strong><%=session.getLastAccessedTime()%><br><br>
<strong>Session example - ServletContext: </strong><%=session.getServletContext()%><br><br>
<strong>Session example - MaxInactiveInterval: </strong><%=session.getMaxInactiveInterval()%><br><br>

<%
String name=request.getParameter("uname");
String pass=request.getParameter("password");

out.println("Username:"+name);
out.println("Password:"+pass);
%>

</body>
</html>