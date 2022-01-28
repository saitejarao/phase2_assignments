package test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Servlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter pw=response.getWriter();
		response.setContentType("text/html");

		ServletConfig conf=getServletConfig();  
        ServletContext context=getServletContext();
        int s1=Integer.parseInt(conf.getInitParameter("a"));  
		int s2=Integer.parseInt(conf.getInitParameter("b"));
		int s3=Integer.parseInt(conf.getInitParameter("c"));
		int s4=Integer.parseInt(context.getInitParameter("d"));

		pw.println("a value is " +s1+ " and b value is " +s2+" and c value is "+s3+" and d value is "+s4 );
		int j=s1*s4;
		int k=s2-s4;
		pw.println(", Multiplication is= " +j);
		pw.println(", Substraction is= " +k);
		
		pw.println(", Servlet Name=" + conf.getServletName());
		

	   pw.close();	
	}

}
