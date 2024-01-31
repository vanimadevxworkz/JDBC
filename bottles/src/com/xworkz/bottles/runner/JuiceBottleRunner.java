package com.xworkz.bottles.runner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.xworkz.bottles.constant.ConnectionData;

public class JuiceBottleRunner {
	
	 public static void main(String[] args) {
			
			try(Connection connection=DriverManager.getConnection(ConnectionData.URL.getValue(), 
					ConnectionData.USERNAME.getValue(),ConnectionData.PASSWORD.getValue());
					Statement statment=connection.createStatement()){
				
				System.out.println("class is connectd");
					String query="insert into bottle_info values('bislari',20)";
					String query1="update bottle_info set bottle_name='Bislary' where bottle_name='bislari'";
							statment.execute(query);
							int row=statment.executeUpdate(query1);
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
