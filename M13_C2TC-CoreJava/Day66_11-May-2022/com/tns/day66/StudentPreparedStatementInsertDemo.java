

package com.tns.day66;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class StudentPreparedStatementInsertDemo
{
	public static void main(String[] args) 
	{
		Connection con = null;
		PreparedStatement pt = null;
		
		try 
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			con =DriverManager.getConnection("jdbc:mysql://localhost:3306/b3tns","root","1234");
			
			pt= con.prepareStatement("insert into student1 values(?,?,?)");
			pt.setInt(1, 1);
			pt.setString(2, "Siddhu");
			pt.setInt(3, 40);
			
			int i = pt.executeUpdate();
			
			System.out.println("No.of rows affected : "+i);
			System.out.println("\nRows insterted successfully..!!");	
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		finally {}
		try 
		{
			if(pt!=null);
			pt.close();
			pt=null;
		}
		catch(Exception e) {}
		try 
		{
			if(con!=null);
			con.close();
			con=null;
		}
		catch(Exception e) {}	
	}
}