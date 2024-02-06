package com.xworkz.restaurant.dto;

public class RestaurantDto {
	
	private String name;
	private String location;
	private double openTime;
	private double closeTime;
	private String splFood;
	private int foodPrice;
	private String managerName;
	private long contactNum;
	private String mailId;
	
	
	
	public RestaurantDto() {
		System.out.println("this is no args constructor");
	}



	public RestaurantDto(String name, String location, double openTime, double closeTime, String splFood, int foodPrice,
			String managerName, long contactNum, String mailId) {
		System.out.println("this is all args constructor");
		this.name = name;
		this.location = location;
		this.openTime = openTime;
		this.closeTime = closeTime;
		this.splFood = splFood;
		this.foodPrice = foodPrice;
		this.managerName = managerName;
		this.contactNum = contactNum;
		this.mailId = mailId;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getLocation() {
		return location;
	}



	public void setLocation(String location) {
		this.location = location;
	}



	public double getOpenTime() {
		return openTime;
	}



	public void setOpenTime(double openTime) {
		this.openTime = openTime;
	}



	public double getCloseTime() {
		return closeTime;
	}



	public void setCloseTime(double closeTime) {
		this.closeTime = closeTime;
	}



	public String getSplFood() {
		return splFood;
	}



	public void setSplFood(String splFood) {
		this.splFood = splFood;
	}



	public int getFoodPrice() {
		return foodPrice;
	}



	public void setFoodPrice(int foodPrice) {
		this.foodPrice = foodPrice;
	}



	public String getManagerName() {
		return managerName;
	}



	public void setManagerName(String managerName) {
		this.managerName = managerName;
	}



	public long getContactNum() {
		return contactNum;
	}



	public void setContactNum(long contactNum) {
		this.contactNum = contactNum;
	}



	public String getMailId() {
		return mailId;
	}



	public void setMailId(String mailId) {
		this.mailId = mailId;
	}



	@Override
	public String toString() {
		return "RestaurantDto [name=" + name + ", location=" + location + ", openTime=" + openTime + ", closeTime="
				+ closeTime + ", splFood=" + splFood + ", foodPrice=" + foodPrice + ", managerName=" + managerName
				+ ", contactNum=" + contactNum + ", mailId=" + mailId + "]";
	}



	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		return result;
		
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		RestaurantDto other = (RestaurantDto) obj;
		if (Double.doubleToLongBits(closeTime) != Double.doubleToLongBits(other.closeTime))
			return false;
		if (contactNum != other.contactNum)
			return false;
		if (foodPrice != other.foodPrice)
			return false;
		if (location == null) {
			if (other.location != null)
				return false;
		} else if (!location.equals(other.location))
			return false;
		if (mailId == null) {
			if (other.mailId != null)
				return false;
		} else if (!mailId.equals(other.mailId))
			return false;
		if (managerName == null) {
			if (other.managerName != null)
				return false;
		} else if (!managerName.equals(other.managerName))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (Double.doubleToLongBits(openTime) != Double.doubleToLongBits(other.openTime))
			return false;
		if (splFood == null) {
			if (other.splFood != null)
				return false;
		} else if (!splFood.equals(other.splFood))
			return false;
		return true;
	}
	
	
	
	

}
