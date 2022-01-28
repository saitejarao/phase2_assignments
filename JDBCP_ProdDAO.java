package raiser.dao;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import raiser1.Product;

public class JDBCP_ProdDAO {
	public Product getProduct(int id) {
		Product p1=new Product();
		 try{
				String query="select * from product where id="+id;
				
				
				Class.forName("com.mysql.jdbc.Driver");
			    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/db_world","root","root");
				Statement st=con.createStatement();
				ResultSet rs=st.executeQuery(query);
				if(rs.next())
				{
					p1.setId(rs.getInt("id"));
					p1.setName(rs.getString("name"));
				    p1.setPrice(rs.getInt("price"));
				}
				
			}catch(Exception e)
			{
				System.out.println(e);
			}
			
		return p1;
	}
}
