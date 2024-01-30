package com.xworkz.bus.driver;

public class Bus {
	
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		}
		catch(ClassNotFoundException exception) {
			exception.printStackTrace();
		}
	}

}
