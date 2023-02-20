package projectDemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
	 
public class TestCollection{
	
	public static void main(String[] args)  {
		
	
//		TestCollection1 tc= new TestCollection1();
		
		try {
			
		//Class.forName("com.MySql.jdbc.Driver");
		Connection con=DriverManager.getConnection(null);
		Statement stmt=con.createStatement();
		ResultSet rs=stmt.executeQuery("select * from tablename;");
	    System.out.println(rs.getString(1));
	    
	    }catch(Exception e) {

			System.out.println(e);
		}
		
				
}
}