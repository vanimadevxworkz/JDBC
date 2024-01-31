package com.xworkz.book.runner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.xworkz.book.constant.ConnectionData;

public class GeetaBookRunner {
	
	public static void main(String[] args) {
		try(Connection connection=DriverManager.getConnection( ConnectionData.URL.getValue(),
				 ConnectionData.USERNAME.getValue(), ConnectionData.PASSWORD.getValue());
				Statement statment=connection.createStatement()){
					System.out.println("class is connceted");
					String query="insert into book_details values('Geetanjali','Rabhindrnath tagore')";
					String query1="update book_details set book_name='Ramayanadarshnum' where book_name='Geetanjali' ";
					statment.execute(query);
					int rs=statment.executeUpdate(query1);
					if(rs>=1) {
						System.out.println("this is update");
					}else {
						System.out.println("this not updated");
					}
				}
		catch(SQLException exception) {
			System.out.println("class in not connected");
		exception.printStackTrace();
		
		}
}

}
