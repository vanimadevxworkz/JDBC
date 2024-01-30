package com.xworkz.book.runner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.xworkz.book.constant.BooksConncetion;

public class BookRunner {
	
	
		public static void main(String[] args) {
			try(Connection connection=DriverManager.getConnection( BooksConncetion.URL.getValue(),
					 BooksConncetion.USERNAME.getValue(), BooksConncetion.PASSWORD.getValue());
					Statement statment=connection.createStatement()){
						System.out.println("class is connceted");
						String quary="insert into book_details values('wings of fire','apj')";
						statment.execute(quary);
					}
			catch(SQLException exception) {
				System.out.println("class in not connected");
			exception.printStackTrace();
			
			}
	}


}
