package test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class ProductProject extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out=response.getWriter();
		
		HttpSession session1=request.getSession();
		String pname=request.getParameter("pname");
		String pid=request.getParameter("pid");
		String pprice=request.getParameter("pprice");
		String psize=request.getParameter("psize");
		String pmodel=request.getParameter("pmodel");
		
		session1.setAttribute("pname",pname);
		session1.setAttribute("pid",pid);
		session1.setAttribute("pprice",pprice);
		session1.setAttribute("psize",psize);
		session1.setAttribute("pmodel",pmodel);
		
		
		response.sendRedirect("ProductProject2nd.jsp");
		
		/*
		out.print("Product Name:"+pname);
		out.print("<br>Product Id:"+pid);
		out.print("<br>Product Price:"+pprice);
		out.print("<br>Product Size:"+psize);
		out.print("<br>Product Model:"+pmodel);
		*/
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
