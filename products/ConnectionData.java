
public enum ConnectionData {
	
	URL("jdbc:mysql://localhost:3360/products"),USERNAME("root"),PASSWORD("X-workzodc@123");
	
	private String value;
	
	private ConnectionData() {
		this.value
	}
	
	public String getValue() {
		return value;
	}

}
