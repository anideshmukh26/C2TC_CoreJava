

package com.tns.day66;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Properties;

public class StudentStatementInsertDemo
{
	public static void main(String[] args) throws Exception
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		String url ="jdbc:mysql://localhost:3306/b3tns";
		
		Properties p = new Properties();
		p.put("user", "root");
		p.put("password","1234");
		
		Connection con= DriverManager.getConnection(url,p);
		
		Statement st = con.createStatement();
		
		String query = "insert into student value(1, 'Aniket', 50)";
		int i = st.executeUpdate(query);
		
		boolean b = st.execute("insert into student value(2, 'Rutik', 65)");
		
		System.out.println("No of rows affected : "+i);
		System.out.println("\nQuery executed : "+b);
		System.out.println("\nRow inserted successfully..!!");
		
		st.close();
		con.close();
	}
}
