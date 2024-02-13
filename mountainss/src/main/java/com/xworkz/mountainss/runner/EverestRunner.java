package com.xworkz.mountainss.runner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.xworkz.mountainss.contants.ConnectionData;
import com.xworkz.mountainss.dto.MountainDto;

public class EverestRunner {
	
	public static void main(String[] args) throws SQLException {
		MountainDto dto=new MountainDto();
		dto.setName("Everst");
		dto.setLocation("Himalaya");
		dto.setHeight("100ft");
		
		String querry="insert into mountains_table(mountains_name,mountains_height,mountains_location)"
				+ "values(?,?,?)";
		
		Connection connection=DriverManager.getConnection(ConnectionData.URL.getValue(),
				ConnectionData.USERNAME.getValue(), ConnectionData.PASSWORD.getValue());
		
		PreparedStatement preparedStatement=connection.prepareStatement(querry);
		preparedStatement.setString(1,dto.getName());
		preparedStatement.setString(2,dto.getHeight());
		preparedStatement.setString(3,dto.getLocation());
		System.out.println("calss is connected");
		
		preparedStatement.executeUpdate();
		
	}

}
