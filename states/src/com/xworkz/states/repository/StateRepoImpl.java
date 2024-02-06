package com.xworkz.states.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.xworkz.states.constants.ConnectionData;
import com.xworkz.states.dto.StateDto;

public class StateRepoImpl implements StateRepo {

	@Override
	public boolean save(StateDto dto) {
		
		System.out.println("this is repo class infomation");
		
		String query="INSERT INTO state_table(state_name,state_capital,state_numOfDistrict,state_numOfTaluks,state_population,state_splFood,"
				+ "state_famousPlace,state_cmName,state_danceName)values(?,?,?,?,?,?,?,?,?)";
		
		try(Connection connection=DriverManager.getConnection(ConnectionData.URL.getValue(),ConnectionData.USERNAME.getValue(),ConnectionData.PASSWORD.getValue());
			PreparedStatement preparedStatement=connection.prepareStatement(query)){
			preparedStatement.setString(1,dto.getStateName());
			preparedStatement.setString(2, dto.getCapital());
			preparedStatement.setInt(3, dto.getNumOfDistrict());
			preparedStatement.setInt(4, dto.getNumOfTaluks());
			preparedStatement.setDouble(5, dto.getPopulation());
			preparedStatement.setString(6,dto.getSplFood());
			preparedStatement.setString(7, dto.getFamousPlace());
			preparedStatement.setString(8, dto.getCmName());
			preparedStatement.setString(9, dto.getDanceName());
			preparedStatement.executeUpdate();
			
			System.out.println("this data stored in repo class");
		
	}
			catch(SQLException exception) {
				exception.printStackTrace();
			}
		return true;
}
}
