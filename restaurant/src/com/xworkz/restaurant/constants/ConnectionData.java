package com.xworkz.restaurant.constants;

public enum ConnectionData {
	
	 URL("jdbc:mysql://localhost:3306/restaurants"),USERNAME("root"),PASSWORD("X-workzodc@123");
	
		private String value;

		private ConnectionData(String value) {
			this.value = value;
		}

		public String getValue() {
			return value;
		}

}
