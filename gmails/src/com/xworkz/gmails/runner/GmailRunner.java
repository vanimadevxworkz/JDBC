package com.xworkz.gmails.runner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.xworkz.gmails.constant.ConnectionData;

public class GmailRunner {
	
	public static void main(String[] args) {
		String query="INSERT INTO gmail_table(first_name,last_name,gmail_contactNum,gmail_password,gmail_address)"
				+ "values(?,?,?,?,?)";
		try(Connection connection=DriverManager.getConnection(ConnectionData.URL.getValue(),ConnectionData.USERNAME.getValue(),
				ConnectionData.PASSWORD.getValue());
		
		PreparedStatement preparedStatment=connection.prepareStatement(query)){
			
	
		preparedStatment.setString(1, "vanishri");
		preparedStatment.setString(2, "g");
		preparedStatment.setLong(3, 6361400696l);
		preparedStatment.setString(4, "Vani@mg");
		preparedStatment.setString(5, "Bhatkal");
		preparedStatment.addBatch();
		preparedStatment.executeBatch();
		
		
		preparedStatment.setString(1, "Priyanka");
		preparedStatment.setString(2, "M");
		preparedStatment.setLong(3,8792036739l);
		preparedStatment.setString(4, "priya@gmail");
		preparedStatment.setString(5, "Honnavara");
		preparedStatment.addBatch();
		preparedStatment.executeBatch();
		
		
		preparedStatment.setString(1, "Hita");
		preparedStatment.setString(2, "g");
		preparedStatment.setLong(3, 9880979037l);
		preparedStatment.setString(4, "hita@mg");
		preparedStatment.setString(5, "Honnegadde");
		preparedStatment.addBatch();
		preparedStatment.executeBatch();
		
		
		preparedStatment.setString(1, "Bhavya");
		preparedStatment.setString(2, "g");
		preparedStatment.setLong(3, 9901435603l);
		preparedStatment.setString(4, "bhavya@mg");
		preparedStatment.setString(5, "benglore");
		preparedStatment.addBatch();
		preparedStatment.executeBatch();
		
		
		preparedStatment.setString(1, "tejas");
		preparedStatment.setString(2, "G");
		preparedStatment.setLong(3, 9801435603l);
		preparedStatment.setString(4, "teju@mg");
		preparedStatment.setString(5, "mysore");
		preparedStatment.addBatch();
		preparedStatment.executeBatch();
		
		preparedStatment.setString(1, "Monika");
		preparedStatment.setString(2, "M");
		preparedStatment.setLong(3, 7901435603l);
		preparedStatment.setString(4, "moni@moger");
		preparedStatment.setString(5, "belgvi");
		preparedStatment.addBatch();
		preparedStatment.executeBatch();
		
		preparedStatment.setString(1, "Hema");
		preparedStatment.setString(2, "N");
		preparedStatment.setLong(3, 9456435603l);
		preparedStatment.setString(4, "hema@mg");
		preparedStatment.setString(5, "hubli");
		preparedStatment.addBatch();
		preparedStatment.executeBatch();
		
		preparedStatment.setString(1, "UMA");
		preparedStatment.setString(2, "N");
		preparedStatment.setLong(3, 99014378903l);
		preparedStatment.setString(4, "uma@mg");
		preparedStatment.setString(5, "benglore");
		preparedStatment.addBatch();
		preparedStatment.executeBatch();
		
		preparedStatment.setString(1, "Seema");
		preparedStatment.setString(2, "N");
		preparedStatment.setLong(3, 9801435603l);
		preparedStatment.setString(4, "sema@n");
		preparedStatment.setString(5, "udupi");
		preparedStatment.addBatch();
		preparedStatment.executeBatch();
		
		preparedStatment.setString(1, "Bhagya");
		preparedStatment.setString(2, "G");
		preparedStatment.setLong(3, 9701435603l);
		preparedStatment.setString(4, "Bhagya@mg");
		preparedStatment.setString(5, "benglore");
		preparedStatment.addBatch();
		preparedStatment.executeBatch();
		
		preparedStatment.setString(1, "Bhairava");
		preparedStatment.setString(2, "L");
		preparedStatment.setLong(3, 94833811247l);
		preparedStatment.setString(4, "bhaira_va@90");
		preparedStatment.setString(5, "sdm");
		preparedStatment.addBatch();
		preparedStatment.executeBatch();
		
	
		
		preparedStatment.executeUpdate();
		
		
		}
		catch(SQLException exception) {
			exception.printStackTrace();
	
		
		
	}

}
}
