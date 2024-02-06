package com.xworkz.hospital.dto;

public class HospitalDto {
	
	private String hospitalName;
	private int numOfDoctors;
	private String hospitalMailId;
	private long contactNumber;
	private int numOfNurse;
	private String address;
	private int numOfMedicine;
	private int openTime;
	private int closeTime;
	
	public HospitalDto() {
		System.out.println("no args constructor");
	}
	public HospitalDto(String hospitalName, int numOfDoctors, String hospitalMailId, long contactNumber, int numOfNurse,
			String address, int numOfMedicine, int openTime, int closeTime) {
        System.out.println("all args constructor");
		this.hospitalName = hospitalName;
		this.numOfDoctors = numOfDoctors;
		this.hospitalMailId = hospitalMailId;
		this.contactNumber = contactNumber;
		this.numOfNurse = numOfNurse;
		this.address = address;
		this.numOfMedicine = numOfMedicine;
		this.openTime = openTime;
		this.closeTime = closeTime;
	}
	public String getHospitalName() {
		return hospitalName;
	}
	public void setHospitalName(String hospitalName) {
		this.hospitalName = hospitalName;
	}
	public int getNumOfDoctors() {
		return numOfDoctors;
	}
	public void setNumOfDoctors(int numOfDoctors) {
		this.numOfDoctors = numOfDoctors;
	}
	public String getHospitalMailId() {
		return hospitalMailId;
	}
	public void setHospitalMailId(String hospitalMailId) {
		this.hospitalMailId = hospitalMailId;
	}
	public long getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(long contactNumber) {
		this.contactNumber = contactNumber;
	}
	public int getNumOfNurse() {
		return numOfNurse;
	}
	public void setNumOfNurse(int numOfNurse) {
		this.numOfNurse = numOfNurse;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getNumOfMedicine() {
		return numOfMedicine;
	}
	public void setNumOfMedicine(int numOfMedicine) {
		this.numOfMedicine = numOfMedicine;
	}
	public int getOpenTime() {
		return openTime;
	}
	public void setOpenTime(int openTime) {
		this.openTime = openTime;
	}
	public int getCloseTime() {
		return closeTime;
	}
	public void setCloseTime(int closeTime) {
		this.closeTime = closeTime;
	}
	
	
	
	

}
