package com.xworkz.army.dto;

public class ArmyDto {
	
	private String person_name;
	private int person_age;
	
	public ArmyDto() {
		System.out.println("no args cons");
	}
	
	public ArmyDto(String person_name,int person_age) {
		this.person_name=person_name;
		this.person_age=person_age;
	}
	
	public void setName(String person_name) {
		this.person_name=person_name;
	}
	
	public void setAge(int person_age) {
		this.person_age=person_age;
	}
	
	public String getPersonName() {
		return person_name;
	}
	
	public int getAge() {
		return person_age;
	}


}
