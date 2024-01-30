package com.xworkz.bottles.runner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.xworkz.bottles.constant.BottleConnection;



public class BottleRunner {
	
	public static void main(String[] args) {
		
		
		try(Connection connection=DriverManager.getConnection(BottleConnection.URL.getValue(), 
				BottleConnection.USERNAME.getValue(),BottleConnection.PASSWORD.getValue());
				Statement statment=connection.createStatement()){
			
			System.out.println("class is connectd");
				String quary="insert into bottle_info values('speedex stainless',377)";
						statment.execute(quary);
		}
		catch(SQLException exception) {
			System.out.println("class in not connected");
		exception.printStackTrace();
		
		}
		
	}

}
