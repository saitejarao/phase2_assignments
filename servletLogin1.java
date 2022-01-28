package test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class servletLogin1 extends HttpServlet {
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	try{
		PrintWriter out = response.getWriter();
        out.println("<html><body>");
        
        String username=request.getParameter("uname");
        String password=request.getParameter("pass");
        
        out.println("Welcome"+username);
        out.println("Password"+password);
        
        Cookie ck=new Cookie("uname",username);
        Cookie cp=new Cookie("pass",password);                                           
        response.addCookie(ck);	
        response.addCookie(cp);                                  
      
        //creating submit button  
        out.print("<form action='servletLogin2'>");  
        out.print("<input type='submit' value='go'>");  
        out.print("</form>");  
              
        out.close();  
    	}catch(Exception e){System.out.println(e);} 
	}
}
