package com.xworkz.animals.runner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.xworkz.animals.constants.ConnectionData;


public class AnimalRunner {
	
	public static void main(String[] args) {		
		String query="INSERT INTO animal_table(animal_name,animal_size,animal_cost,animal_rating,"
				+ "animal_discount,animal_color,animal_type)values(?,?,?,?,?,?,?)";
		
		try (Connection connection=DriverManager.getConnection(ConnectionData.URL.getValue(),ConnectionData.USERNAME.getValue(),
				ConnectionData.PASSWORD.getValue());
				PreparedStatement preparedStatment=connection.prepareStatement(query)){
			System.out.println("class is connected");
			preparedStatment.setString(1, "Cat");
			preparedStatment.setString(2, "l");
			preparedStatment.setInt(3, 300);
			preparedStatment.setFloat(4, 20.0f);
			preparedStatment.setDouble(5, 25.00);
			preparedStatment.setString(6, "white");
			preparedStatment.setInt(7, 5);	
			
			preparedStatment.executeUpdate();
			
		}
		catch(SQLException exception) {
			System.out.println("class is not connected");
			exception.printStackTrace();
		}
		
	}

	

}
