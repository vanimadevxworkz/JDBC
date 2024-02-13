package com.xworkz.army.Runner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.xworkz.army.constants.ConnectionData;
import com.xworkz.army.dto.ArmyDto;



public class ArmyRunner {
	

	public static void main(String[] args) throws SQLException {
		ArmyDto dto=new ArmyDto();
		dto.setName("lokesh");
		dto.setAge(25);
	
		
		String query="insert into army2_table(army2_person_namel,army2_age)values(?,?)";
        Connection connection=DriverManager.getConnection(ConnectionData.URL.getValue(),
				ConnectionData.USERNAME.getValue(),ConnectionData.PASSWORD.getValue());
        PreparedStatement preparedStatement=connection.prepareStatement(query);
        preparedStatement.setString(1, dto.getPersonName());
        preparedStatement.setInt(2, dto.getAge());
        preparedStatement.executeUpdate();
        
        System.out.println("class is connected");

	}
}
