package com.xworkz.countries.runner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.xworkz.countries.constant.ConnectionData;

public class AmericaRunner {
	
	 public static void main(String[] args) {
		 String query="INSERT INTO country_table(country_name,country_numOfState,country_population,country_color,"
		 		+ "country_numOfTaluks,quality,country_code)values(?,?,?,?,?,?,?)";
			
			try(Connection connection=DriverManager.getConnection(ConnectionData.URL.getValue(), 
					ConnectionData.USERNAME.getValue(),ConnectionData.PASSWORD.getValue());
					PreparedStatement preparedStatment=connection.prepareStatement(query)){
				System.out.println("class is connectd");
				preparedStatment.setString(1, "America");
				preparedStatment.setInt(2, 29);
				preparedStatment.setDouble(3, 121.16);
				preparedStatment.setString(4, "White");
				preparedStatment.setInt(5, 12422);
				preparedStatment.setFloat(6, 100.0f);
				preparedStatment.setInt(7, 123);
				preparedStatment.executeUpdate();
				
			} 
			catch(SQLException exception) {
				System.out.println("class in not connected");
			exception.printStackTrace();
			
			}
			
		}


}
