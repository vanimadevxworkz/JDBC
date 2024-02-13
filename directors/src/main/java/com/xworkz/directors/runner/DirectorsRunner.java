package com.xworkz.directors.runner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.xworkz.directors.dto.DirectorsDto;

public class DirectorsRunner {

	
	public static void main(String[] args) {
		DirectorsDto dto=new DirectorsDto("Neel", "KGF", 10, 35);
		String query="INSERT INTO directors_table(directors_name,directors_movieName,"
				+ "directors_numOfMovies,directors_age)Values(?,?,?,?)";
		
		try(Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/directors", "root", "X-workzodc@123");
			PreparedStatement preparedStatement=connection.prepareStatement(query)){
			preparedStatement.setString(1, dto.getDirectors_name());
			preparedStatement.setString(2,dto.getMovie_name());
			preparedStatement.setInt(3,dto.getNumOfMovies());
			preparedStatement.setInt(4, dto.getAge());
			
			preparedStatement.executeUpdate();
			System.out.println("class is connected");
			
		}catch(SQLException e) {
			
		}
	}
}
