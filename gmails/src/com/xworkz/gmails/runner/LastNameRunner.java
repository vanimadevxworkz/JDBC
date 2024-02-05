package com.xworkz.gmails.runner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.xworkz.gmails.constant.ConnectionData;

public class LastNameRunner {
	
	public static void main(String[] args) throws SQLException{
		String query="SELECT first_name  FROM gmail_table where gmail_id=?";
	    Connection connection=DriverManager.getConnection(ConnectionData.URL.getValue(),ConnectionData.USERNAME.getValue(),
				ConnectionData.PASSWORD.getValue());
		
		PreparedStatement preparedStatment=connection.prepareStatement(query);
		preparedStatment.setInt(1, 2);
		ResultSet rs=preparedStatment.executeQuery();
				
		//preparedStatment.execute();
		
		while(rs.next()) {
			System.out.println(rs.getString(1));
		} 
		
	}


}
