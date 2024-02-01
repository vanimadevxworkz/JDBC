package com.xworkz.animals.runner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.xworkz.animals.constants.ConnectionData;


public class AinmalUpdate {
	
	public static void main(String[] args) {
		 String query="UPDATE animal_table set animal_name=? where animal_name=?";
			
			try(Connection connection=DriverManager.getConnection(ConnectionData.URL.getValue(), 
					ConnectionData.USERNAME.getValue(),ConnectionData.PASSWORD.getValue());
					PreparedStatement preparedStatment=connection.prepareStatement(query)){
				System.out.println("class is connectd");
				preparedStatment.setString(1, "Lion");
				preparedStatment.setString(2, "Cat");
				
				preparedStatment.executeUpdate();
				
			} 
			catch(SQLException exception) {
				System.out.println("class in not connected");
			exception.printStackTrace();
			
			}
			
		}

}
