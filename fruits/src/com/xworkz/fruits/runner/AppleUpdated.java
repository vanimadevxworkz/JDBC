package com.xworkz.fruits.runner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.xworkz.fruits.constants.ConnectionData;

public class AppleUpdated {
	
	 public static void main(String[] args) {
		 String query="UPDATE fruits_table set fruits_name=? where fruits_id=?";
			
			try(Connection connection=DriverManager.getConnection(ConnectionData.URL.getValue(), 
					ConnectionData.USERNAME.getValue(),ConnectionData.PASSWORD.getValue());
					PreparedStatement preparedStatment=connection.prepareStatement(query)){
				System.out.println("class is connectd");
				preparedStatment.setString(1, "Watermelon");
				preparedStatment.setInt(2, 3);
				
				preparedStatment.executeUpdate();
				
			} 
			catch(SQLException exception) {
				System.out.println("class in not connected");
			exception.printStackTrace();
			
			}
			
		}

}
