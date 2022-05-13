

package com.tns.day66;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;

public class StudentStatementResultSetDemo
{
	public static void main(String args[])
	{
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/b3tns","root","1234");
			
			Statement st = con.createStatement();
			String query = "select * from student";
			ResultSet rs = st.executeQuery(query);
			
			ResultSetMetaData rsmt = rs.getMetaData();
			System.out.println(rsmt);
			int column = rsmt.getColumnCount();
			
			while(rs.next())
			{
				for(int i= 1; i<=column; i++)
				{
					System.out.println(rs.getString(i)+ "\t");
				}
				System.out.println("");
			}
			st.close();
			con.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}	
}
