package com.xworkz.charger.runner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.xworkz.charger.constants.ConnectionData;

public class RealmeRunner {
	
public static void main(String[] args) {
		
		String query="INSERT INTO charger_table(charger_name,charger_cost,charger_color,charger_quality,"
				+ "charger_discount,charger_CompanyName,charger_numOfType)values(?,?,?,?,?,?,?)";
		
		try (Connection connection=DriverManager.getConnection(ConnectionData.URL.getValue(),ConnectionData.USERNAME.getValue(),
				ConnectionData.PASSWORD.getValue());
				PreparedStatement preparedStatment=connection.prepareStatement(query)){
			System.out.println("class is connected");
			preparedStatment.setString(1, "Realme");
			preparedStatment.setInt(2, 250);
			preparedStatment.setString(3, "black");
			preparedStatment.setFloat(4, 10.0f);
			preparedStatment.setDouble(5, 12.00);
			preparedStatment.setString(6, "BBK");
			preparedStatment.setInt(7, 5);	
			
			preparedStatment.executeUpdate();
			
		}
		catch(SQLException exception) {
			System.out.println("class is not connected");
			exception.printStackTrace();
		}
		
	}
	
	
}


