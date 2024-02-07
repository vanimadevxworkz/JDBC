package com.xworkz.bluetooth.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.xworkz.bluetooth.constants.ConnectionData;
import com.xworkz.bluetooth.dto.BluetoothDto;

public class BluetoothRepoImpl implements BluetoothRepo {

	@Override
	public boolean save(BluetoothDto dto) {
		System.out.println("this is repo");
		
		String query="INSERT INTO bluetooth_table(bluetooth_name,bluetooth_color,bluetooth_price)VALUES(?,?,?)";
		try(Connection connection=DriverManager.getConnection(ConnectionData.URL.getValue(), ConnectionData.USERNAME.getValue(),ConnectionData.PASSWORD.getValue());
			PreparedStatement preparedStatement=connection.prepareStatement(query)){
			preparedStatement.setString(1, dto.getBluetooth_name());
			preparedStatement.setString(2, dto.getBluetooth_color());
			preparedStatement.setInt(3, dto.getBluetooth_price());
			preparedStatement.executeUpdate();
			
			System.out.println("this data has been stored repo");
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		return true;
	}

}
