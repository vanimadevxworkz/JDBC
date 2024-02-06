package com.xworkz.hospital.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.xworkz.hospital.constants.ConnectionData;
import com.xworkz.hospital.dto.HospitalDto;

public class HospitalRepoImpl implements HospitalRepo {

	@Override
	public boolean save(HospitalDto dto) {
		
		System.out.println("this is repo class");
		String query="INSERT INTO hospital_table(hospital_name,hospital_numOfDoctors,hospital_mailId,hospital_contactNum,hospital_numOfNurse,hospital_address,"
				+ "hospital_numOfMedicine,hospital_openTiming,hospital_closeTime)values(?,?,?,?,?,?,?,?,?)";
		
		try(Connection connection=DriverManager.getConnection(ConnectionData.URL.getValue(),ConnectionData.USERNAME.getValue(), ConnectionData.PASSWORD.getValue());
			PreparedStatement preparedStatment=connection.prepareStatement(query)){
				
				 preparedStatment.setString(1, dto.getHospitalName());
				 preparedStatment.setInt(2, dto.getNumOfDoctors());
				 preparedStatment.setString(3, dto.getHospitalMailId());
				 preparedStatment.setLong(4, dto.getContactNumber());
				 preparedStatment.setInt(5, dto.getNumOfNurse());
				 preparedStatment.setString(6, dto.getAddress());
				 preparedStatment.setInt(7,dto.getNumOfMedicine());
				 preparedStatment.setInt(8,dto.getOpenTime());
				 preparedStatment.setInt(9,dto.getCloseTime());
				 preparedStatment.executeUpdate();
				 System.out.println("dto is saved in repo class");
				 
				 
			}catch(SQLException e) {
				e.printStackTrace();
			}
		
				
		return true;
	}

}
