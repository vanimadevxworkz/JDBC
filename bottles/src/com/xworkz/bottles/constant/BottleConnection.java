package com.xworkz.bottles.constant;

public enum BottleConnection {
	

	URL("jdbc:mysql://localhost:3306/bottel"),USERNAME("root"),PASSWORD("X-workzodc@123");
     
	
	private String value;
	
	private BottleConnection(String value) {
		this.value=value;
	}

	public String getValue() {
		return value;
	}

}
