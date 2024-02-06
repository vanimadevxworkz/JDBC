package com.xworkz.hospital.runner;

import com.xworkz.hospital.dto.HospitalDto;
import com.xworkz.hospital.service.HospitalService;
import com.xworkz.hospital.service.HospitalServiceImpl;

public class HospitalRunner {
	
	public static void main(String[] args) {
		
		System.out.println("this is runner class");
		HospitalDto dto=new HospitalDto();
		dto.setAddress("benglore");
		dto.setHospitalName("Aster CMI hospital");
		dto.setContactNumber(6361400696l);
		dto.setHospitalMailId("asterhosp@gmail.com");
		dto.setNumOfMedicine(5);
		dto.setNumOfNurse(20);
		dto.setNumOfDoctors(15);
		dto.setOpenTime(9);
		dto.setCloseTime(10);
		
		
		HospitalService service=new HospitalServiceImpl();
		service.save(dto);
		
		//System.out.println("");
		
		
		
	}

}
