package com.xworkz.gmails.runner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.xworkz.gmails.constant.ConnectionData;

public class ChromeRunner {
	public static void main(String[] args) throws SQLException {
		
	String query="SELECT * FROM gmail_table";
    Connection connection=DriverManager.getConnection(ConnectionData.URL.getValue(),ConnectionData.USERNAME.getValue(),
			ConnectionData.PASSWORD.getValue());
	
	PreparedStatement preparedStatment=connection.prepareStatement(query);
	preparedStatment.getResultSet();
	ResultSet rs=preparedStatment.executeQuery();
			
	//preparedStatment.execute();
	
	while(rs.next()) {
		System.out.println(rs.getInt(1)+""+rs.getString(2)+""+rs.getString(3)+""+rs.getLong(4)+""+
	rs.getString(5)+""+rs.getString(5));
		
	} 
	
	
	
}
	}


