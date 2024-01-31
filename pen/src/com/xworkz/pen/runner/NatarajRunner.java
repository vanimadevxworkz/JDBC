package com.xworkz.pen.runner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.xworkz.pen.constant.ConnectionData;

public class NatarajRunner {
	
	public static void main(String[] args) {
		try(Connection connection=DriverManager.getConnection(ConnectionData.URL.getValue(), 
				ConnectionData.USERNAME.getValue(), ConnectionData.PASSWORD.getValue());
				
				Statement statement=connection.createStatement()){
			System.out.println("class is connectd");
				String query="insert into pen_info values('better',10)";
				String query1="update pen_info set pen_name='Grren' where pen_name='better'";
						statement.execute(query);
						int row=statement.executeUpdate(query1);
						if(row>=1) {
							System.out.println("this is updated");
						}else {
							System.out.println("this is not updated");
						}
		}
		catch(SQLException exception) {
			System.out.println("class in not connected");
		exception.printStackTrace();
		
		}
	}


}
