package test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class LoginProject extends HttpServlet {
	
    
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		
		String uname=request.getParameter("uname");
		String pass=request.getParameter("pass");
		if(uname.equals("saiteja")&& pass.equals("pass"))
		{
			HttpSession session=request.getSession();
			session.setAttribute("username", uname);
			response.sendRedirect("WelcomeProject");
			//out.print("<a href='WelcomeProject'>Welcome</a>");
			
		}else
			out.print("Invalid User");
			//response.sendRedirect("LoginProjecthtml.html");
		    
	}
	
}