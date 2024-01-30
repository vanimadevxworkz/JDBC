package com.xworkz.bike.runner;

import java.sql.Connection;
import java.sql.DriverManager;

public class Bike {
	
	public static void main(String[] args) {
		
		String url="jdbc:mysql://localhost:3306/bike";
		String userName="root";
		String password="X-workzodc@123";
		
		try
			(Connection connection=DriverManager.getConnection(url,userName,password)){
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
