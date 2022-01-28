package com.raiser;

import java.io.IOException;

import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import raiser.dao.JDBCP_ProdDAO;
import raiser1.Product;

@SuppressWarnings({ "serial", "unused" })
public class JDBCProject extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		int id=Integer.parseInt(request.getParameter("id"));
		JDBCP_ProdDAO dao=new JDBCP_ProdDAO();
		Product p1=dao.getProduct(id);
		  
		out.print("This is JDBC Project");
		request.setAttribute("product",p1);
		
		RequestDispatcher rd=request.getRequestDispatcher("ShowProduct.jsp");
		rd.forward(request, response);
	}
}
