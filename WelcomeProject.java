package test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class WelcomeProject extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setHeader("cache-control","no-cache,no-store,must-revalidate");
		HttpSession session=request.getSession();
		String uname=request.getParameter("uname");
		String pass=request.getParameter("pass");
		
		
		if(session.getAttribute("username")==null)
       {
	      response.sendRedirect("LoginProjecthtml.html");
       }
		PrintWriter pw=response.getWriter();
		pw.print("Welcome "+session.getAttribute("username"));
		
		pw.print("<br> Welcome this is our website <br>");
		pw.print("<a href='AboutUsProject' >About Us <br></a>");
		pw.print("<a href='LogoutProject' >Logout <br></a>");
		pw.close();
	}

	
}
