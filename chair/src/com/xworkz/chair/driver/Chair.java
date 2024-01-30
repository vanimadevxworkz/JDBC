package com.xworkz.chair.driver;

public class Chair {
	
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		
	}
		catch(ClassNotFoundException exception) {
			exception.printStackTrace();
		}
	}

}
