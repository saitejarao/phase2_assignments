package test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class servlet4Register extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try{
		      response.setContentType("text/html");
		      PrintWriter pwriter = response.getWriter();
		     
		      HttpSession session=request.getSession(false);
		      
		      String myName=(String)session.getAttribute("uname");
		      String myPass=(String)session.getAttribute("pass");
		      String myage=(String)session.getAttribute("age");
		      String myemail=(String)session.getAttribute("email");
		      String mycountry=(String)session.getAttribute("country");
		      
		      
		      pwriter.println("session creation time" + session.getCreationTime());
		      pwriter.println("session last accessed time" +session.getLastAccessedTime());
		      pwriter.println("session max interval time" +session.getMaxInactiveInterval());
		      pwriter.println("session servelt context" +session.getServletContext());
		      pwriter.println("session servelt context" +session.getId());
		      pwriter.println(session.isNew());
		      
		      pwriter.print("Name: "+myName+" Pass: "+myPass+" Age: "+myage+"Email:"+myemail+"Country:"+mycountry);
		      pwriter.close();
		  }catch(Exception exp){
		      System.out.println(exp);
		   }
	}
}
