package com.xworkz.mountainss.contants;

public enum ConnectionData {
	 URL("jdbc:mysql://localhost:3306/mountains"),USERNAME("root"),PASSWORD("X-workzodc@123");
	
		private String value;

		private ConnectionData(String value) {
			this.value = value;
		}

		public String getValue() {
			return value;
		}


}
