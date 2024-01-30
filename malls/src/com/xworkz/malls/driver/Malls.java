package com.xworkz.malls.driver;

public class Malls {
	
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		}
		catch(ClassNotFoundException exception) {
			exception.printStackTrace();
		}
	}

}
