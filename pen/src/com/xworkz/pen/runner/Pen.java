package com.xworkz.pen.runner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.xworkz.pen.constant.PenRunner;

public class Pen {

	
	public static void main(String[] args) {
		try(Connection connection=DriverManager.getConnection(PenRunner.URL.getValue(), 
				PenRunner.USERNAME.getValue(), PenRunner.PASSWORD.getValue());
				
				Statement statement=connection.createStatement()){
			System.out.println("class is connectd");
				String quary="insert into pen_info values('writometer',20)";
						statement.execute(quary);
		}
		catch(SQLException exception) {
			System.out.println("class in not connected");
		exception.printStackTrace();
		
		}
	}
}
