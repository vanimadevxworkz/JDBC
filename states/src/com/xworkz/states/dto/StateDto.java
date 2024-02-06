package com.xworkz.states.dto;

public class StateDto {
	
	private String stateName;
	private String capital;
	private int numOfDistrict;
	private int numOfTaluks;
	private double population;
	private String splFood;
	private String famousPlace;
	private String cmName;
	private String danceName;
	
	public StateDto() {
		System.out.println("this no args constructor");
	}

	public StateDto(String stateName, String capital, int numOfDistrict, int numOfTaluks, double population,
			String splFood, String famousPlace, String cmName, String danceName) {
		System.out.println("this is all agrs constructor");
		this.stateName = stateName;
		this.capital = capital;
		this.numOfDistrict = numOfDistrict;
		this.numOfTaluks = numOfTaluks;
		this.population = population;
		this.splFood = splFood;
		this.famousPlace = famousPlace;
		this.cmName = cmName;
		this.danceName = danceName;
	}

	public String getStateName() {
		return stateName;
	}

	public void setStateName(String stateName) {
		this.stateName = stateName;
	}

	public String getCapital() {
		return capital;
	}

	public void setCapital(String capital) {
		this.capital = capital;
	}

	public int getNumOfDistrict() {
		return numOfDistrict;
	}

	public void setNumOfDistrict(int numOfDistrict) {
		this.numOfDistrict = numOfDistrict;
	}

	public int getNumOfTaluks() {
		return numOfTaluks;
	}

	public void setNumOfTaluks(int numOfTaluks) {
		this.numOfTaluks = numOfTaluks;
	}

	public double getPopulation() {
		return population;
	}

	public void setPopulation(double population) {
		this.population = population;
	}

	public String getSplFood() {
		return splFood;
	}

	public void setSplFood(String splFood) {
		this.splFood = splFood;
	}

	public String getFamousPlace() {
		return famousPlace;
	}

	public void setFamousPlace(String famousPlace) {
		this.famousPlace = famousPlace;
	}

	public String getCmName() {
		return cmName;
	}

	public void setCmName(String cmName) {
		this.cmName = cmName;
	}

	public String getDanceName() {
		return danceName;
	}

	public void setDanceName(String danceName) {
		this.danceName = danceName;
	}

	@Override
	public String toString() {
		return "StateDto [stateName=" + stateName + ", capital=" + capital + ", numOfDistrict=" + numOfDistrict
				+ ", numOfTaluks=" + numOfTaluks + ", population=" + population + ", splFood=" + splFood
				+ ", famousPlace=" + famousPlace + ", cmName=" + cmName + ", danceName=" + danceName + "]";
	}
	
	
	
	

}
