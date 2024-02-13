package com.xworkz.directors.runner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ReadRunner {
	
	public static void main(String[] args) {
		String query="SELECT * FROM directors_table";
		 try(Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/directors","root","X-workzodc@123");
			PreparedStatement preparedStatement=connection.prepareStatement(query)){ 
			 preparedStatement.getResultSet();
			 ResultSet rs=preparedStatement.executeQuery();
			 
			 while(rs.next()) {
					System.out.println(rs.getInt(1)+""+rs.getString(2)+""+rs.getString(3)+""+rs.getInt(4)+""+rs.getInt(5));			
				} 
			 
		 }catch(SQLException e) {
			 e.printStackTrace();
			 
		 }
	}

}
