package com.xworkz.oceans.dto;

public class OceansDto {
	
	private String name;
	private String location;
	
	public OceansDto() {
		System.out.println("no args cons");
	}
	
	public OceansDto(String name,String location) {
		this.name=name;
		this.location=location;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	
	public void setLocation(String location) {
		this.location=location;
	}
	
	public String getName() {
		return name;
	}
	
	public String getLocation() {
		return location;
	}


}


