package com.userstory;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class DBConnector {
	Connection con;
	
	
	public Connection getCon()  {
		// TODO Auto-generated method stub
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/schemaone","root","Hrittika1234@");
	    return con;
		}
		   catch(ClassNotFoundException e)
		{
			e.printStackTrace();
		}
		   catch(SQLException e)
		{
			e.printStackTrace();
		}
		return con;
	
	}
}
		
	
	


