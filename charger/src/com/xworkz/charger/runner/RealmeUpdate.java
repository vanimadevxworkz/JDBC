package com.xworkz.charger.runner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.xworkz.charger.constants.ConnectionData;

public class RealmeUpdate {
	
	public static void main(String[] args) {
		 String query="UPDATE charger_table set charger_name=? where charger_name=?";
			
			try(Connection connection=DriverManager.getConnection(ConnectionData.URL.getValue(), 
					ConnectionData.USERNAME.getValue(),ConnectionData.PASSWORD.getValue());
					PreparedStatement preparedStatment=connection.prepareStatement(query)){
				System.out.println("class is connectd");
				preparedStatment.setString(1, "Realme narzo55");
				preparedStatment.setString(2, "Realme");
				
				preparedStatment.executeUpdate();
				
			} 
			catch(SQLException exception) {
				System.out.println("class in not connected");
			exception.printStackTrace();
			
			}
			
		}

}
