package test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class validFilterAssign2 implements Filter {


	public void destroy() {
		// TODO Auto-generated method stub
	}
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		String name = request.getParameter("name");
		String age=request.getParameter("age");
		
		PrintWriter out = response.getWriter();
        out.println("<html><body>");
		
        out.println("Valid filter");
        out.println("<a href='DataCheckFilterAssign2.java'></a>");
        
        if( name != null && age != null){
                out.println("Its valid...............");
            chain.doFilter(request, response);
    }else            
        out.println("blocked by LoginFilter as there is no userid");
	}
	

	public void init(FilterConfig fConfig) throws ServletException {
		
	}

}
