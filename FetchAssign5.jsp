<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@include file="header.jsp"%><br><br>
<jsp:useBean id="entryBean" class="test.EntryBean" scope="session"></jsp:useBean>
       <jsp:getProperty property="id" name="entryBean" />
       <jsp:getProperty property="name" name="entryBean" />
       <jsp:getProperty property="age" name="entryBean" />
       <jsp:getProperty property="dept" name="entryBean" />

<jsp:forward page="LogoutAssign5.jsp"></jsp:forward>

</body>
</html>