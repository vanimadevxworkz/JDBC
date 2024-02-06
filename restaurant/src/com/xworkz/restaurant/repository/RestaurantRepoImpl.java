package com.xworkz.restaurant.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.xworkz.restaurant.constants.ConnectionData;
import com.xworkz.restaurant.dto.RestaurantDto;

public class RestaurantRepoImpl implements RestaurantRepo {

	@Override
	public boolean save(RestaurantDto dto) {
		System.out.println("this is repo class");
		
		String query="INSERT INTO restaurant_table(restaurant_name,restaurant_location,restaurant_openTime,restaurant_closeTime,restaurant_splFood,"
				+ "restaurant_foodPrice,restaurant_managerName,restaurant_contactNum,restaurant_mailId)values(?,?,?,?,?,?,?,?,?)";
		
		try(Connection connection=DriverManager.getConnection(ConnectionData.URL.getValue(),ConnectionData.USERNAME.getValue(), ConnectionData.PASSWORD.getValue());
				PreparedStatement preparedStatment=connection.prepareStatement(query)){
			preparedStatment.setString(1, dto.getName());
			preparedStatment.setString(2, dto.getLocation());
			preparedStatment.setDouble(3, dto.getOpenTime());
			preparedStatment.setDouble(4, dto.getCloseTime());
			preparedStatment.setString(5, dto.getSplFood());
			preparedStatment.setInt(6,dto.getFoodPrice());
			preparedStatment.setString(7,dto.getManagerName());
			preparedStatment.setLong(8, dto.getContactNum());
			preparedStatment.setString(9, dto.getMailId());
			preparedStatment.executeUpdate();
			System.out.println("this data stored in repo class");
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		return true;
	}

}
