package eminds.MavenProject;

import java.sql.*;
//connecting database and fitching data from the table. 
//insert the data into the database by hard code.
//update the data from the table.
public class DataBaseConnect {
	
		static	String url="jdbc:mysql://localhost:3306/sample"; 
		static	String username="root";
		static	String password="root";	
 
		// main method for the database connect
	public static void main(String[] args) throws SQLException {
		
			
		Insert();
		getData();
		Update();

	}
	 
	public static void getData()  throws SQLException {
		
        String query="select * from customer";
		
		Connection connection = DriverManager.getConnection(url,username,password);
		Statement statement =connection.createStatement();
		ResultSet result=statement.executeQuery(query);
		
		while(result.next())
		{
		System.out.println("customer id is : "+" "+result.getInt(1));
		System.out.println("customer name is : "+" "+result.getString(2));
		System.out.println("customer address is : "+" "+result.getString(3));
		System.out.println(" ");
		}
	}
	
	public static void Insert()  throws SQLException {
		
        String  query=" insert into customer values(2,'mark','UK') ";
		
		Connection connection = DriverManager.getConnection(url,username,password);
		Statement statement =connection.createStatement();
		int result=statement.executeUpdate(query);
				
		System.out.println("number of row affected :"+" "+result);
		
        }
	
public static void Update()  throws SQLException {
		
        String  query="update customer set customer_address= 'France' where idcustomer=3 ";
		
		Connection connection = DriverManager.getConnection(url,username,password);
		Statement statement =connection.createStatement();
		int result=statement.executeUpdate(query);
				
		System.out.println("number of row affected :"+" "+result);
		
        }
}