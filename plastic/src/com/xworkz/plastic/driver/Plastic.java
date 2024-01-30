package com.xworkz.plastic.driver;

public class Plastic {
	
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		}
		catch(ClassNotFoundException exception) {
			exception.printStackTrace();
		}
	}

}
