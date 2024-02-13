package com.xworkz.oceans.runner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.xworkz.oceans.constants.ConnectionData;
import com.xworkz.oceans.dto.OceansDto;

public class OceansRunner {
	
	public static void main(String[] args) throws SQLException {
		OceansDto dto=new OceansDto();
		dto.setName("Antartica");
		dto.setLocation("india");
		
		String query="insert into oceans_table(oceans_name,oceans_location)values(?,?)";
        Connection connection=DriverManager.getConnection(ConnectionData.URL.getValue(),
				ConnectionData.USERNAME.getValue(),ConnectionData.PASSWORD.getValue());
        PreparedStatement preparedStatement=connection.prepareStatement(query);
        preparedStatement.setString(1, dto.getName());
        preparedStatement.setString(2, dto.getLocation());
        preparedStatement.executeUpdate();
        
        System.out.println("class is connected");

	}
}
