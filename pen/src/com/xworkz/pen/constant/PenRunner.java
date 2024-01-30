package com.xworkz.pen.constant;

public enum PenRunner {
	
	URL("jdbc:mysql://localhost:3306/pen"),USERNAME("root"),PASSWORD("X-workzodc@123");
     
	
	private String value;
	
	private PenRunner(String value) {
		this.value=value;
	}

	public String getValue() {
		return value;
	}
	
	
	

	
	

}
