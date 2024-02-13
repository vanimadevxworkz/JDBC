package com.xworkz.oceans.runner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.xworkz.oceans.constants.ConnectionData;


public class OceansUpdate {
	
	public static void main(String[] args) throws SQLException {
		
		String query="UPDATE oceans_table set oceans_name=? where oceans_name=?";
        Connection connection=DriverManager.getConnection(ConnectionData.URL.getValue(),
				ConnectionData.USERNAME.getValue(),ConnectionData.PASSWORD.getValue());
        PreparedStatement preparedStatement=connection.prepareStatement(query);
        preparedStatement.setString(1,"Indian");
        preparedStatement.setString(2, "Atlantica");
        preparedStatement.executeUpdate();
        
        System.out.println("class is connected");

	}

}
