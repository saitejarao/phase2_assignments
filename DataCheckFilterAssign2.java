package test;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class DataCheckFilterAssign2 implements Filter {
	private FilterConfig filterConfig=null;

	public void destroy() {
		// TODO Auto-generated method stub
	}
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		String name = request.getParameter("name");
		String age=request.getParameter("age");
		 
        if( (name.equalsIgnoreCase("admin"))&& (age.equals(30))){
        	response.getWriter().write("Data is Checked...............");
            chain.doFilter(request, response);
    }else            
        response.getWriter().write("blocked by DataCheckFilter as there is no userid");
	}

	public void init(FilterConfig fConfig) throws ServletException {
		this.filterConfig = fConfig;
	}

}
