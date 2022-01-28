<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%
  HttpSession session1=request.getSession();
  out.print("Product Name:"+session1.getAttribute("pname"));
  out.print("<br>Product ID:"+session1.getAttribute("pid"));
  out.print("<br>Product Price:"+session1.getAttribute("pprice"));
  out.print("<br>Product Size:"+session1.getAttribute("psize"));
  out.print("<br>Product Model:"+session1.getAttribute("pmodel"));
   
%>


</body>
</html>