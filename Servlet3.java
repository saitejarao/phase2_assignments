package test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Servlet3 extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter pw=response.getWriter();
		response.setContentType("text/html");

		ServletConfig conf=getServletConfig();  
        ServletContext context=getServletContext();
        int s1=Integer.parseInt(conf.getInitParameter("a"));  
		int s2=Integer.parseInt(conf.getInitParameter("b"));
		int s3=Integer.parseInt(conf.getInitParameter("c"));
		int s4=Integer.parseInt(context.getInitParameter("d"));

		pw.println("a value is " +s1+ " and b value is " +s2+" and c value is "+s3+" and d value is "+s4+",");
		int j=s1+s2+s4;
		if( s1 >= s2 && s1 >= s3 && s1>=s4)
			pw.println(s1+" is the largest Number");
	      else if (s2>= s1 && s2 >= s3 && s2>=s4)
	    	  pw.println(s2+" is the largest Number");
	      else if (s3>= s1 && s3 >= s2 && s3>=s4)
	    	  pw.println(s3+" is the largest Number");
	      else
	    	  pw.println(s4+" is the largest Number");
		
		pw.println(", Sum is= " +j);
		pw.println(", Servlet Name=" + conf.getServletName());
		

	   pw.close();	
	}

}
