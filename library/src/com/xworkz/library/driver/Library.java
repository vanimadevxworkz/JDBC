package com.xworkz.library.driver;

public class Library {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		}
		catch(ClassNotFoundException exception) {
			exception.printStackTrace();
		}
	}

}
