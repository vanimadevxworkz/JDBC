package com.xworkz.bag.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.xworkz.bag.constants.ConnectionData;
import com.xworkz.bag.dto.BagDto;

public class BagRepoImpl implements BagRepo {

	@Override
	public boolean save(BagDto dto) {
		System.out.println("this is repo");
		String query="INSERT INTO bag_table(bag_name,bag_price,bag_color)Values(?,?,?)";
		
		try(Connection connection=DriverManager.getConnection(ConnectionData.URL.getValue(), ConnectionData.USERNAME.getValue(),ConnectionData.PASSWORD.getValue());
				PreparedStatement preparedStatement=connection.prepareStatement(query)){
			preparedStatement.setString(1, dto.getBag_name());
			preparedStatement.setInt(2, dto.getBag_price());
			preparedStatement.setString(3, dto.getBag_color());
			preparedStatement.executeUpdate();
			System.out.println("this data stored in repo");
			
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		return true;
	}

}
