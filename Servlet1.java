package test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Servlet1 extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter pw=response.getWriter();
		response.setContentType("text/html");

		ServletConfig conf=getServletConfig();  // Step 1: instantiate ServeltConfig
        ServletContext context=getServletContext();
        
        
		int s1=Integer.parseInt(conf.getInitParameter("a"));   //Step 2: fetching the parameters from the web.xml
		int s2=Integer.parseInt(conf.getInitParameter("b"));
		int s3=Integer.parseInt(conf.getInitParameter("c"));
		int s4=Integer.parseInt(context.getInitParameter("d"));

		pw.println("a value is " +s1+ " and b value is " +s2+" and c value is "+s3+" and d value is "+s4 );
		int j=s1+s2+s3+s4;
		pw.println(", sum is=" +j);
		
		pw.println(", Servlet Name=" + conf.getServletName());
		

	   pw.close();	
	}

}
