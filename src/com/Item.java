package com;

import java.sql.Connection;
import java.sql.DriverManager;

public class Item {
	public Connection connect()
	{ 
	 Connection con = null; 
	 
	 try 
	 { 
		 Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/paf","root","");
	 //For testing
	 System.out.print("Successfully connected"); 
	 } 
	 catch(Exception e) 
	 { 
	 e.printStackTrace(); 
	 } 
	 
	 return con; 
	}
}
