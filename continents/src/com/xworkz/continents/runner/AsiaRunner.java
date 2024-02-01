package com.xworkz.continents.runner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.xworkz.continents.constants.ConnectionData;

public class AsiaRunner {
	
	
		public static void main(String[] args) {		
			String query="INSERT INTO continent_table(continent_name,continent_population,continent_color,continent_type,continent_area,continent_feetl,continent_famousPlace)"
					+ "values(?,?,?,?,?,?,?)";
			
			try (Connection connection=DriverManager.getConnection(ConnectionData.URL.getValue(),ConnectionData.USERNAME.getValue(),
					ConnectionData.PASSWORD.getValue());
					PreparedStatement preparedStatment=connection.prepareStatement(query)){
				
				System.out.println("class is connected");
				preparedStatment.setString(1,"NorthAmerica");
				preparedStatment.setInt(2, 364154);
				preparedStatment.setString(3,"yellow");
				preparedStatment.setInt(4,7);
				preparedStatment.setFloat(5,319.0f);
				preparedStatment.setDouble(6,50.0);
				preparedStatment.setString(7,"lake");	
				
				preparedStatment.executeUpdate();
				
			}
			catch(SQLException exception) {
				System.out.println("class is not connected");
				exception.printStackTrace();
			}
			
		}


}
