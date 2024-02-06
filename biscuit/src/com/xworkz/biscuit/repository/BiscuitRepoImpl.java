package com.xworkz.biscuit.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.xworkz.biscuit.constant.ConnectionData;
import com.xworkz.biscuit.dto.BiscuitDto;

public class BiscuitRepoImpl implements BiscuitRepo {

	@Override
	public boolean save(BiscuitDto dto) {
		
		System.out.println("this is repo");
		String query="INSERT INTO biscuit_table(biscuit_name,biscuit_price,biscuit_manufactureDate)Values(?,?,?)";
		
		try(Connection connection=DriverManager.getConnection(ConnectionData.URL.getValue(), ConnectionData.USERNAME.getValue(),ConnectionData.PASSWORD.getValue());
			PreparedStatement preparedStatment=connection.prepareStatement(query)){	
			preparedStatment.setString(1, dto.getBiscuit_name());
			preparedStatment.setInt(2, dto.getBiscuit_price());
			preparedStatment.setInt(3, dto.getBiscuit_manufactureDate());
			preparedStatment.executeUpdate();
			System.out.println("this data saved in repo");
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return true;
	}

}
