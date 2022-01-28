package test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class servlet3Register
 */
public class servlet3Register extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try{
		      response.setContentType("text/html");
		      PrintWriter pwriter = response.getWriter();

		      String name = request.getParameter("uname");
		      String password = request.getParameter("pass");
		      String age= request.getParameter("age");
		      String email = request.getParameter("email");
		      String country = request.getParameter("country");
		      
		      
		      pwriter.print("Hello "+name);
		      pwriter.print("Your Password is: "+password);
		      
		      //creating the HttpSession below
		      HttpSession session=request.getSession(); 
		      
		      session.setAttribute("uname",name);
		      session.setAttribute("pass",password);
		      session.setAttribute("age",age);
		      session.setAttribute("email",email);
		      session.setAttribute("country",country);
		     
		      pwriter.print("<a href='servlet4Register'>view details</a>");
		      pwriter.close();
		    }catch(Exception exp){
		       System.out.println(exp);
		     }
		
		
		
		
		
		
	}
}
