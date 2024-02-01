package com.xworkz.countries.runner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.xworkz.countries.constant.ConnectionData;

public class AmericaUpdate {
	
	public static void main(String[] args) {
		 String query="UPDATE country_table set country_name=? where country_id=?";
			
			try(Connection connection=DriverManager.getConnection(ConnectionData.URL.getValue(), 
					ConnectionData.USERNAME.getValue(),ConnectionData.PASSWORD.getValue());
					PreparedStatement preparedStatment=connection.prepareStatement(query)){
				System.out.println("class is connectd");
				preparedStatment.setString(1, "SouthKoriya");
				preparedStatment.setInt(2, 3);
				
				preparedStatment.executeUpdate();
				
			} 
			catch(SQLException exception) {
				System.out.println("class in not connected");
			exception.printStackTrace();
			
			}
			
		}


}
