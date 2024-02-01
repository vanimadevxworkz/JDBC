package com.xworkz.fruits.runner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.xworkz.fruits.constants.ConnectionData;

public class AppleRunner {
	
	 public static void main(String[] args) {
		 String query="INSERT INTO fruits_table(fruits_name,fruits_price,fruits_discount,fruits_color,fruits_quality,"
		 		+ "fruits_type,fruits_place)values(?,?,?,?,?,?,?)";
			
			try(Connection connection=DriverManager.getConnection(ConnectionData.URL.getValue(), 
					ConnectionData.USERNAME.getValue(),ConnectionData.PASSWORD.getValue());
					PreparedStatement preparedStatment=connection.prepareStatement(query)){
				System.out.println("class is connectd");
				preparedStatment.setString(1, "Mango");
				preparedStatment.setInt(2, 120);
				preparedStatment.setDouble(3, 10.00);
				preparedStatment.setString(4, "yellow");
				preparedStatment.setFloat(5, 20.0f);
				preparedStatment.setInt(6, 7);
				preparedStatment.setString(7, "maharastra");
				preparedStatment.executeUpdate();
				
			} 
			catch(SQLException exception) {
				System.out.println("class in not connected");
			exception.printStackTrace();
			
			}
			
		}

}
