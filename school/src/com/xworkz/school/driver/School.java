package com.xworkz.school.driver;

public class School {
	
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		}
		catch(ClassNotFoundException exception) {
			exception.printStackTrace();
		}
	}

}
