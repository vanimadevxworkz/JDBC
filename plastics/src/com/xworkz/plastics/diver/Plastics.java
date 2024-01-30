package com.xworkz.plastics.diver;

import java.sql.Connection;
import java.sql.DriverManager;

public class Plastics {
	
	public static void main(String[] args) {
		String url="jdbc:mysql://localhost:3306/plastics";
		String userName="root";
		String password="X-workzodc@123";
		
		try
			(Connection connection=DriverManager.getConnection(url,userName,password)){
			System.out.println("try with resources");
			if(connection!=null) {
				System.out.println("not saved successfull");
			}else {
				System.out.println("connection failed");
			}
		}
		catch(Exception e) {
			System.out.println("connection fails:"+e.getMessage());
			e.printStackTrace();
		}
	}

}
